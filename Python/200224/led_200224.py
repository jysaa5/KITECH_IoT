#coding: utf-8
import RPi.GPIO as GPIO
import time

pin = 16

GPIO.setmode(GPIO.BCM)
GPIO.setup(pin, GPIO.OUT)


try:

    while True:
        GPIO.output(pin, True)
        time.sleep(1)
        GPIO.output(pin,False)
        time.sleep(1)

except KeyboardInterrupt:
    GPIO.cleanup()