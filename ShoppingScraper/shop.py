from selenium import webdriver
from bs4 import BeautifulSoup
import sys
import re

def items_on_page(val):
	
		# Counting number of items in each page

		my_elems = val.find('div',{'id' : 'searchResultsContainer'})
		count=0
		e = my_elems('div',{'class' : re.compile('.*grid.*')})
		for io in e:
			count+=1
		return count/3.0

if len(sys.argv) == 2:

	# Open the phantomJS browser, driver is the phantomjs browser object
	driver = webdriver.PhantomJS()

	# With the query given in the command line arguments, open the webpage to find all it's products
	driver.get("http://shopping.com/products?KW="+sys.argv[1])

	# Get the source code of the page and create a beautifulsoup parser object with it
	val = BeautifulSoup(driver.page_source,"html.parser")

	# Count the number of objects present in the perticular page
	count_per_page = items_on_page(val)

	# The pagination concept of moving to next pages, new pages hyperlink given at the end of the page
	val1 = val.find('div',{'class','paginationNew'})
	no_of_pages = 1
	for tag in val1.find_all('a'):
		if tag.text.replace(" ","").isdigit():
			no_of_pages = tag.text.replace(" ","")

	# Finally check the number of items in the last page
	driver.get("http://www.shopping.com/products~PG-"+str(no_of_pages)+"?KW="+sys.argv[1])
	val = BeautifulSoup(driver.page_source,"html.parser")
	items_on_last_page = items_on_page(val)

	# Until the last page, you are sure of the number of elements occuring in each page. So multiply (count of items * No. of pages) + (count of items in last page)

	print "The total items ",(int((int(no_of_pages) - 1))*int(count_per_page)) + int(items_on_last_page)
	driver.quit()

else:

	driver = webdriver.Chrome()
	driver.get("http://www.shopping.com/products~PG-"+sys.argv[1]+"?KW="+sys.argv[2])
	val = BeautifulSoup(driver.page_source,"html.parser")
	items_on_last_page = items_on_page(val)
	print int(items_on_last_page)
	driver.quit()