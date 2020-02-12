import threading
import datetime 

count = 0

#call back function
def func_a():
    print('timer expired')
    print('end time:', datetime.datetime.now())
    global count #전역변수를 함수 안에서 지역변수로서 사용하기 위해.
    if(count == 10):
        return
    count += 1
    threading.Timer(3, func_a).start() #계속 함수가 돌도록 함. 10초단위로 계속 처리 됨. = 재귀함수 -> 무한반복됨. 

print('start time: ', datetime.datetime.now())

#10초후에 함수 실행
threading.Timer(3, func_a).start()