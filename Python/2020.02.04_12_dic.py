# 딕셔너리 선언 {key:value, ....}
# key -> int, str, bool 타입도 가능.
# value -> 숫자, 문자열, bool, list, dic

dic_a = {
    'name': '홍길동',
    'phoneNumber': '01077779999',
    'birthday' : '20000101'
}
print('-------dic_a------')
print(dic_a)

print('-----------------')
print('이름:',dic_a['name'])
print('전화번호:',dic_a['phoneNumber'])
print('생일:',dic_a['birthday'])

name = '이름'
dic_b = {
    name : '7D 망고저림',
    'type' : '망고저림'
}
print(dic_b)