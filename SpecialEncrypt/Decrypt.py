from __future__ import division
# Input the hash code
g = float(raw_input())
# Number of letters the string should contain
numberLetters = int(raw_input())
myar=[]
stri = 'acdegilmnoprstuw'
for k in range(0,numberLetters):
	for i in xrange(len(stri)):
		pcal = '{0:.2f}'.format(float((g - i)/37))
		if pcal.split(".")[1]=="00":
			myar.append(stri[i])
			break
	g=int(pcal.split(".")[0])
myar.reverse()
print ''.join(myar)
