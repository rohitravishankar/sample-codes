from pymongo import MongoClient

client = MongoClient()
#Database name = "teet"
#collection name ="contacts"
#file = "supports.json"
#command = "mongoimport --db teet --collection contacts --drop --file supports.json"

db = client.teet

def addContact(name, phno, email):
	result = db.contacts.insert_one(
	{ "name" : name, "phno" : phno, "email" : email})
	#print result.inserted_id
	
def listall():
	myl=""
	cursor = db.contacts.find()
	for document in cursor:
		myl=myl+"Name  :  "+document['name']+"<br/>"
		myl=myl+"Phone :  "+document['phno']+"<br/>"
		myl=myl+"Email :  "+document['email']+"<br/>"
		myl=myl+"<br/>"+"<br/>"
		
	return myl
def delCont(name):
	result = db.contacts.delete_many({"name": name})
	#print result.deleted_count
	if(result.deleted_count==0):
		return "No entry exists by the name  "+name
	else:
		return str(result.deleted_count)+" rows deleted from the table!"
