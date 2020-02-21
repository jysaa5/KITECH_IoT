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

def func_r():
    print ('=====================>LED_R: ', GPIO.input(LED_R))
    GPIO.output(LED_R, not GPIO.input(LED_R))

def func_y():
    print ('=====================>LED_Y: ', GPIO.input(LED_Y))
    GPIO.output(LED_Y, not GPIO.input(LED_Y))


def func_g():
    print ('=====================>LED_G: ', GPIO.input(LED_G))
    GPIO.output(LED_G, not GPIO.input(LED_G))

  
cnt = 0 
while 1:
    func_g()
    time.sleep(3)
    func_g()
    func_y()
    time.sleep(3)
    func_y()
    func_r()
    time.sleep(3)
    func_r()
    
    #print('========> LED_W : ', GPIO.input(LED_W))
    cnt += 1


#GPIO 개방
GPIO.cleanup()



