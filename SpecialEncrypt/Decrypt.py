from __future__ import division
s = 930846109532517
myar=[]
stri = 'acdegilmnoprstuw'
for k in range(0,9):
	for i in xrange(len(stri)):
		pcal = '{0:.2f}'.format(float((g - i)/37))
		if pcal.split(".")[1]=="00":
			myar.append(stri[i])
			break
	g=int(pcal.split(".")[0])
myar.reverse()
print ''.join(myar)
