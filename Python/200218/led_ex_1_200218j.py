#coding: utf-8 
#한글 주석이 되도록 함.

#GPIO 라이브러리 호출 
import RPi.GPIO as GPIO

import tkinter as tk

import time

#핀 번호 할당으로 처리: 핀 번호 설정
GPIO.setmode(GPIO.BOARD)

#핀 번호 설정: Channel 번호
LED_W = 11

#11번 채널(핀 번호)을 출력 핀을 등록, 초기 출력은 로우레벨(low level), Low = 0, False
GPIO.setup(LED_W, GPIO.OUT, initial = GPIO.LOW)

print ('=====================>LED_W: ', GPIO.input(LED_W))

#하이 레벨 출력 = 점등
def func():
    GPIO.output(LED_W, not GPIO.input(LED_W))
    time.sleep(3) #3초

func()

print ('=====================>LED_W: ', GPIO.input(LED_W))

GPIO.cleanup()



