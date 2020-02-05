#2020.02.04_03_if.py를 개선
#모듈 호출
#날짜, 시간 관련 모듈 호출
#as: 모듈의 별칭
#import datetime as t
import datetime 

#현재 시간 구하기
now = datetime.datetime.now()
print(now)
print(now.year, '년')
print(now.month, '월')
print(now.day, '일')
print(now.hour, '시')
print(now.minute, '분')
print(now.second, '초')

#봄
if 3<=now.month<=5:
    print("이번달은 {}월로 봄입니다.".format(now.month))

#여름
elif 6<=now.month<=8:
    print("이번달은 {}월로 여름입니다.".format(now.month))

#가을
elif 9<=now.month<=11:
    print("이번달은 {}월로 가을입니다.".format(now.month))

#겨울
else: #now.month==12 or 1<=now.month<=2:
    print("이번달은 {}월로 겨울입니다.".format(now.month))