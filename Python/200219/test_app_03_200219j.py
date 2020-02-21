#coding: utf-8

#flask
from flask import Flask
#request
from flask import request

app = Flask(__name__)

@app.route('/')
def index():
    led = request.args.get('led', 'g') #key = led , default = 'g'
    p_val = request.args.get('p_val','0') #led의 밝기

    return led + ':' + p_val

if __name__ == '__main__':
    app.run(host='192.168.0.23', port ='5000') 