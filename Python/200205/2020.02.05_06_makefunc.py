# 사용자 함수의 정의

def print_3_times():
    print('hi~!!')
    print('hi~!!')
    print('hi~!!')

print_3_times()

#print_3_times(3) #매개변수가 없는데 넣어서 에러가 발생함.

def print_n_times(val, n):
    for i in range(n):
        print(val)

print_n_times('Hello', 10)
print_n_times('!!', 2)