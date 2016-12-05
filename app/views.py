from flask import render_template
from app import app


@app.route('/')
@app.route('/index')

def index():
    return render_template('index.html')
@app.route('/firstHTML')
def firstHTML():
    return render_template('firstHTML.html')
