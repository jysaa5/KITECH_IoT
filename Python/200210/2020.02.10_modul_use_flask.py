#모듈 읽기
from flask import Flask

#서버 생성 
app = Flask(__name__) #name: 모듈의 이름

@app.route('/')
def hello(): 
    return '<h1> Hello~Python Flask </h1>'

