import keyword
import re

handle = open("filename.py","r")
data = str(handle.read())
data = re.sub(r'".*"', r"",data)
data = re.sub(r'#.*' , r"",data)
data = re.sub(r'""".*"""',r"",data)
mystr = data.split()
mykeys = keyword.kwlist
count=0;
for i in mystr:
	i = re.sub(r':',r'',i)
	if i in mykeys:
		print i
		count=count+1
	else:
		count+=0
print count
