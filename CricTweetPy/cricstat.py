import json,os
import requests
import re
import requests_oauthlib
from twython import Twython

consumer_key = "consumer key"
consumer_secret = "consumer secret key"
access_token = "access token key"
access_secret = "acess secret key"

twitter = Twython(consumer_key,consumer_secret, access_token, access_secret)

r = requests.get('http://cricscore-api.appspot.com/csa')

res1=json.loads(r.text)
for entries in res1:
	inputString = ""
	print "between : ",entries['t1']," and ",entries['t2']," id : ",entries['id']
	payload = {'id': entries['id']}
	mys = requests.get('http://cricscore-api.appspot.com/csa', params = payload)
	res2 = json.loads(mys.text)
	for sim in res2:
		inputString = inputString + sim['si']
		if bool(re.search(r'\d', inputString)):
			print inputString
		else:
			inputString = inputString+"Match may be abandoned between "+entries['t1']+" and "+entries['t2']
			print inputString
		twitter.update_status(status=inputString)
	print "\n"
