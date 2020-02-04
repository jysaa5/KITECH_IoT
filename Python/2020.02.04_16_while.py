import time

#number: 카운트를 위한 변수/ 처리 횟수 카운트 변수
number = 0

#현재보다 5초 앞선 시간
target_time = time.time() + 5

#5초간 반복
while time.time() < target_time:
    number += 1

print('5초간 {}번 반복'.format(number))

#CPU마다 반복하는 횟수가 다름.
