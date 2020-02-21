#coding: utf-8 
#한글 주석이 되도록 함.

#GPIO 라이브러리 호출 
import RPi.GPIO as GPIO

import tkinter as tk

import time

import random

#핀 번호 할당으로 처리: 핀 번호 설정
GPIO.setmode(GPIO.BOARD)

#핀 번호 설정: Channel 번호
LED_R = 11
LED_G = 16
LED_Y = 22

#11번 채널(핀 번호)을 출력 핀을 등록, 초기 출력은 로우레벨(low level), Low = 0, False
GPIO.setup(LED_R, GPIO.OUT, initial = GPIO.LOW)
GPIO.setup(LED_G, GPIO.OUT, initial = GPIO.LOW)
GPIO.setup(LED_Y, GPIO.OUT, initial = GPIO.LOW)

print ('=====================>LED_R: ', GPIO.input(LED_R))
print ('=====================>LED_G: ', GPIO.input(LED_G))
print ('=====================>LED_Y: ', GPIO.input(LED_Y))

list_led = [LED_R, LED_G, LED_Y]


#하이 레벨 출력 = 점등
def func():
    cnt = 0
    while 1:
        ran = random.randint(0, 2)
        GPIO.output(list_led[ran], not GPIO.input(list_led[ran]))
        time.sleep(1) #1초
        GPIO.output(list_led[ran], False)
        cnt += 1

        if LED_R == True:
            GPIO.output(LED_G, False)
            GPIO.output(LED_Y, False)
        
        elif LED_G == True:
            GPIO.output(LED_R, False)
            GPIO.output(LED_Y, False)

        elif LED_Y == True:
            GPIO.output(LED_R, False)
            GPIO.output(LED_G, False)

        if cnt == 5:
            break

    

    # GPIO.output(LED_R, not GPIO.input(LED_R))
    # time.sleep(1) #1초
    # GPIO.output(LED_R, False)
    # time.sleep(1) #1초

    # GPIO.output(LED_R, False)
    # GPIO.output(LED_G, not GPIO.input(LED_G))
    # time.sleep(1) #1초
    
    # GPIO.output(LED_G, False)
    # GPIO.output(LED_Y, not GPIO.input(LED_Y))
    # time.sleep(1) #1초


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



