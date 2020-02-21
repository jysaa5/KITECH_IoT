#coding: utf-8

#flask
from flask import Flask

from flask_cors import CORS

#GPIO 모듈
import RPi.GPIO as GPIO


#핀 번호 할당 설정
GPIO.setmode(GPIO.BOARD)

#핀(Channel) 번호
LED_R = 11 #빨간색
LED_G = 16 #초록색
LED_Y = 22 #노란색

#채널(핀 번호)을 출력 핀을 등록, 초기 출력은 로우레벨(low level), Low = 0, False
GPIO.setup(LED_R, GPIO.OUT, initial = GPIO.LOW)
GPIO.setup(LED_G, GPIO.OUT, initial = GPIO.LOW)
GPIO.setup(LED_Y, GPIO.OUT, initial = GPIO.LOW)

def func_r():
    #configure: 내용 변경
    if not GPIO.input(LED_R): #0
        func_clear()

    GPIO.output(LED_R, not GPIO.input(LED_R))
    return str(GPIO.input(LED_R)) #현재값


def func_y():
    #configure: 내용 변경
    if not GPIO.input(LED_Y): #0
        func_clear()
    
    GPIO.output(LED_Y, not GPIO.input(LED_Y))
    return str(GPIO.input(LED_Y)) #현재값

def func_g():
    #configure: 내용 변경
    if not GPIO.input(LED_G): #0
         func_clear()
    
    GPIO.output(LED_G, not GPIO.input(LED_G))
    return str(GPIO.input(LED_G)) #현재값




#Channel 값을 0으로.
def func_clear():
    GPIO.output(LED_R, False)
    GPIO.output(LED_Y, 0)
    GPIO.output(LED_G, GPIO.LOW)


##################################밑에는 웹에서 처리###########################

app = Flask(__name__)

#Cross origins 이슈 해결
CORS(app)

@app.route('/sw_g')
def sw_g():
    return func_g()

@app.route('/sw_y')
def sw_y():
    return func_y()

@app.route('/sw_r')
def sw_r():
    return func_r()

print(__name__)
if __name__ == '__main__':
    app.run(host='192.168.0.66', port=5000, debug=False)

