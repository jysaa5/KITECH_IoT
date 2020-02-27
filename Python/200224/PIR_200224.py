#coding: utf-8
import RPi.GPIO as GPIO

import time

LED = 16

PIR_S = 25

GPIO.setmode(GPIO.BCM)
GPIO.setup(LED, GPIO.OUT)
GPIO.setup(PIR_S, GPIO.IN)

try:
    while True:
        if GPIO.input(PIR_S) == True:
            print('Sensor ON')
            GPIO.output(LED,True)
            time.sleep(5)
        else:
            print('Sensor OFF')
            GPIO.output(LED,False)

except KeyboardInterrupt:
    GPIO.cleanup()