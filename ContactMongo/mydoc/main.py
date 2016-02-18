from flask import Flask,request
import flask
from resources import addContact,delCont,listall
app = Flask(__name__)

@app.route("/",methods=['POST'])
def hello():
	if request.form['submit'] == 'add':
		name = str(request.form.get('name'))
		if not name:
			return "Name cannot be empty!"
		phno = str(request.form.get('phno'))
		email =  str(request.form.get('email'))
		addContact(name,phno,email)
		print name, phno, email
		return "<h4>Success!</h4>"
	elif request.form['submit'] == 'list':
		mycont = listall()
		return "<h2>Contents below</h2><br/>"+mycont
	elif request.form['submit'] == 'delete':
		name = str(request.form.get('name'))
		if not name:
			return "<h1>Deletion not possible</h1>"
		mys = delCont(name)
		return "<h4>"+mys+"</h4>" 

if __name__ == "__main__":
    app.run(debug=True)
