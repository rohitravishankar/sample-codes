from selenium import webdriver
from bs4 import BeautifulSoup
import sys
import re

def items_on_page(val):
	
		my_elems = val.find('div',{'id' : 'searchResultsContainer'})
		count=0
		e = my_elems('div',{'class' : re.compile('.*grid.*')})
		for io in e:
			count+=1
		return count/3.0

if len(sys.argv) == 2:

	driver = webdriver.Chrome()
	driver.get("http://shopping.com/products?KW="+sys.argv[1])
	val = BeautifulSoup(driver.page_source,"html.parser")
	count_per_page = items_on_page(val)
	val1 = val.find('div',{'class','paginationNew'})
	no_of_pages = 1
	for tag in val1.find_all('a'):
		if tag.text.replace(" ","").isdigit():
			no_of_pages = tag.text.replace(" ","")
	driver.get("http://www.shopping.com/products~PG-"+str(no_of_pages)+"?KW="+sys.argv[1])
	val = BeautifulSoup(driver.page_source,"html.parser")
	items_on_last_page = items_on_page(val)
	print "The total items ",(int((int(no_of_pages) - 1))*int(count_per_page)) + int(items_on_last_page)
	driver.quit()

else:

	driver = webdriver.Chrome()
	driver.get("http://www.shopping.com/products~PG-"+sys.argv[1]+"?KW="+sys.argv[2])
	val = BeautifulSoup(driver.page_source,"html.parser")
	items_on_last_page = items_on_page(val)
	print int(items_on_last_page)
	driver.quit()