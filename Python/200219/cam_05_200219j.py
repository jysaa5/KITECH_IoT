#coding: utf-8

#라즈베리 카메라 모듈
import picamera 
import time
import datetime 

#picamera Object 생성
with picamera.PiCamera() as camera:

    now = datetime.datetime.now()
    
    #해상도 설정 -> 튜플
    camera.resolution = (320, 240)

    file_name = '{}{}{}{}{}{}{}.jpg'.format(now.year, now.month, now.day, now.hour, now.minute, now.second, now.microsecond)

    #촬영 -> 저장
    camera.capture('photo/'+file_name)




