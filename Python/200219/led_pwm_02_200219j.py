#coding: utf-8

#GPIO 라이브러리
import RPi.GPIO as GPIO

import time 

#Tkinter 라이브러리 (Python3)
import tkinter as tk

#핀 번호 할당 방법은 커넥터 핀 번호로 설정
GPIO.setmode(GPIO.BOARD)

#pin 번호 channel
LED = 11 

#11번 핀 설정/ 11번 핀을 출력 핀으로 설정, 초기 출력 로우 레벨
GPIO.setup(LED, GPIO.OUT, initial=GPIO.LOW)


#PWM 객체 생성: 11번 핀, 주파수 - 100Hz
p = GPIO.PWM(LED, 100)

#TK 객체
window = tk.Tk()

#변수설정
led_value = tk.DoubleVar()
# 0 지정
led_value.set(0)


#PWM 신호 출력
p.start(0)



#duty 값을 변경 함수 정의
def change_duty(dc):
    p.ChangeDutyCycle(led_value.get()) #듀티 비 변경


#window size
window.geometry('300x300')


#슬라이드 객체 생성
#레이블(LED 밝기 조정), 숫자 범위(0~100)
slide = tk.Scale(window, label ='LED 밝기 조정', orient ='h', from_=0, to=100, variable=led_value, command=change_duty)


#슬라이더 배치
slide.pack()

#윈도우 출력
window.mainloop()

#PWM 정지
p.stop()

#GPIO 개방
GPIO.cleanup()