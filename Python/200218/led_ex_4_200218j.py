#coding: utf-8 
#한글 주석이 되도록 함.

#GPIO 라이브러리 호출 
import RPi.GPIO as GPIO

import tkinter as tk

import time

#핀 번호 할당으로 처리: 핀 번호 설정
GPIO.setmode(GPIO.BOARD)

#핀 번호 설정: Channel 번호
LED_R = 11
LED_G = 16

#11번 채널(핀 번호)을 출력 핀을 등록, 초기 출력은 로우레벨(low level), Low = 0, False
GPIO.setup(LED_R, GPIO.OUT, initial = GPIO.LOW)
GPIO.setup(LED_G, GPIO.OUT, initial = GPIO.HIGH)

print ('=====================>LED_R: ', GPIO.input(LED_R))
print ('=====================>LED_G: ', GPIO.input(LED_G))

#하이 레벨 출력 = 점등
def func():
    GPIO.output(LED_R, not GPIO.input(LED_R))
    #time.sleep(3) #3초
    GPIO.output(LED_G, not GPIO.input(LED_G))
    #time.sleep(3) #3초

#윈도우 객체
window = tk.Tk()

window.geometry('400x400')

#label
#label 객체 생성
label = tk.Label(window, text="버튼을 눌러서 LED 점등을 하세요.")

#button
btn = tk.Button(window, text='LED', command=func)

#위젯 배치 
label.pack()
btn.pack()

#윈도우 출력
window.mainloop()

#GPIO 개방
GPIO.cleanup()



