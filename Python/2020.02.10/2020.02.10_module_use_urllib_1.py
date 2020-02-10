#모듈 읽기
#urllib 패키지 안에 request만 사용하겠다.
from urllib import request
#import urllib.request as req #별칭을 사용.

#urlopen() 함수를 이용해서 웹 요청
#target = request.urlopen('https://www.google.com')
target = request.urlopen('http://localhost:8080/sensor1/dataInput.jsp?data=sensor01,11.119')
data = target.read()

# Spring 다이나믹 프로젝트에서 ok 라고 했던게 여기서 응답 받음.
print(data) 
