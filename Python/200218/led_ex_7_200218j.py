#coding: utf-8 
#한글 주석이 되도록 함.

#GPIO 라이브러리 호출 
import RPi.GPIO as GPIO

import tkinter as tk

import time

#핀 번호 할당으로 처리: 핀 번호 설정
GPIO.setmode(GPIO.BOARD)

#핀 번호 설정: Channel 번호
LED_R = 11 #빨간색
LED_G = 16 #초록색
LED_Y = 22 #노란색

#11번 채널(핀 번호)을 출력 핀을 등록, 초기 출력은 로우레벨(low level), Low = 0, False
GPIO.setup(LED_R, GPIO.OUT, initial = GPIO.LOW)
GPIO.setup(LED_G, GPIO.OUT, initial = GPIO.LOW)
GPIO.setup(LED_Y, GPIO.OUT, initial = GPIO.LOW)

print ('=====================>LED_R: ', GPIO.input(LED_R))
print ('=====================>LED_G: ', GPIO.input(LED_G))
print ('=====================>LED_Y: ', GPIO.input(LED_Y))


def func_r():
    func_clear()
    print ('=====================>LED_R: ', GPIO.input(LED_R))
    GPIO.output(LED_R, not GPIO.input(LED_R))

def func_y():
    func_clear()
    print ('=====================>LED_Y: ', GPIO.input(LED_Y))
    GPIO.output(LED_Y, not GPIO.input(LED_Y))


def func_g():
    func_clear()
    print ('=====================>LED_G: ', GPIO.input(LED_G))
    GPIO.output(LED_G, not GPIO.input(LED_G))


#Channel 값을 0으로.
def func_clear():
    GPIO.output(LED_R, False)
    GPIO.output(LED_Y, 0)
    GPIO.output(LED_G, GPIO.LOW)


#윈도우 객체
window = tk.Tk()

window.geometry('400x400')

#label
#label 객체 생성
label = tk.Label(window, text="버튼을 눌러서 LED 점등을 하세요.")

#button
btn_r = tk.Button(window, text='빨간버튼', command=func_r)
btn_y = tk.Button(window, text='노란버튼', command=func_y)
btn_g = tk.Button(window, text='초록버튼', command=func_g)

#위젯 배치 
label.pack()
btn_r.pack()
btn_y.pack()
btn_g.pack()

#윈도우 출력
window.mainloop()

#GPIO 개방
GPIO.cleanup()



