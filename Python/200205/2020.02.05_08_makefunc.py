# 가변 매개변수 함수 생성
def print_n_times(n, *val):

#튜플(tuple): 변하지 않는 데이터이다.

    list_args = val #val: tuple 타입이다. list와 특징이 같다. 요소의 데이터는 변경이 불가하다.
    #print(list_args)
    
    #n번 반복
    for i in range(n):
        #가변 매개변수의 데이터를 출력
        for v in val:
            print(v, 'argValue', end='|', sep='_')
        print()

print_n_times(3, 'hi~', 'python', 'bye~')
print_n_times(2, 'hi~', 'python', 'bye~')
print_n_times(2, 'hi~', 'python', 'bye~', '!!!!!!', '')



def make_str(*val):
    result = ''
    for v in val:
        result += v
        result += '|'
    return result

print(make_str('hi~', 'python', 'bye~', '!!!!!!', '~~~~~~~~'))