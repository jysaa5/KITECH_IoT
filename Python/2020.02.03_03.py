print('First Python') #print 실행

#주석입니다
#기본 내장 함수 abs
print("-------abs()------")
print(abs(5))
print(abs(-5))

#기본 내장 함수 max
print("-------max()------")
a = 10
b = 20
nums = [10, 40, 100, 60, 30] #list
names = "python" #문자열
print(max(a,b)) #20
print(max(nums)) #100
print(max(names)) #y

#기본 내장 함수 min
print("-------min()------")
print(min(a,b)) #10 
print(min(nums)) #10
print(min(names)) #h

#기본 내장 함수 pow
print("-------pow()------")
print(pow(2,2))
print(pow(3,3))
print(pow(2,-1))

#기본 내장 함수 chr
print("-------chr()------")
print(chr(97))
print(chr(65))
print(chr(48))
print(chr(97+1))
print(chr(65+1))
print(chr(48+1))

#기본 내장 함수 str
print("-------str()------")
print(str(97)) #문자이다.
print(str([10,'hum',30,70]))
print(str("String"))

#기본 내장 함수 range
print("-------range()------")
numbers = range(0,10,2)
print(numbers)

#기본 내장 함수 type
print("-------type()------")
print(type(-1))
print(type("word"))
print(type([1,2,3,4]))

#식별자 주의사항
#키워드, 함수이름, 모듈이름, 클래스 이름과 동일하게 사용하면 안된다.
#str = 'abc' #기존의 str 함수가 변수 str 변경됨: 오류가 아니다. 
#print(str('abc')) #str 함수 호출 오류 발생.

#""" """개행
print("""안녕
친구야
너를 만나고 있냥""")

#"""\ \"""
print("""\
안녕
친구야
너를 만나고 있냥\
""")

#문자열 반복
print("Python"*3)
print(5*"Python")

#인덱싱: 양수, 음수
print("안녕하세요"[4])
print("안녕하세요"[-5]) 

#여러개 인덱싱
print("안녕하세요"[1:3])
print("안녕하세요"[:3])
print("안녕하세요"[3:])

#문자열의 개수 출력
print("-------len()------")
print(len("안녕하세요"))

#숫자연산
print("-------숫자 연산------")
print("5+7=",5+7) #12
print("7-5=",7-5) #2
print("5*7=",5*7) #35
print("7/5=",7/5) #1.4
print("7//5=",7//5) #1
print("7%5=",7%5) #2

print("-------제곱승------")
print("2**1=",2**1) #2
print("2**2=",2**2) #4
print("2**3=",2**3) #8
print("2**4=",2**4) #16

#사용자 데이터 입력
age = input("나이를 입력해주세요.>>>")

print(type(age))
print(age)

#캐스팅
string_a = input("숫자를 입력해주세요 >>>")
string_b = input("다른 숫자를 입력해주세요 >>>")

int_a = int(string_a)
int_b = int(string_b)

print('문자열 연산: ', string_a + string_b)
print('숫자 연산: ', int_a + int_b)

#문자열을 다루는 기본함수
string_str = "hello python"
#string_str.

string_aa = "{}".format(20)
print(string_aa)
print(type(string_aa))

format_a = "{}만 원".format(5000)
format_b = "파이썬 열공해서 첫 연봉 {}만 원 만들기".format(10000)
format_c = "{}, {}, {}".format(3000, 4000, 5000)
format_d = "{} {} {}".format(1, '펭수', True)
print(format_a)
print(format_b)
print(format_c)
print(format_d)

#문자열 대문자, 소문자
print(string_str.upper())
print(string_str.lower())

#split
string_list = string_str.split(" ")
print(string_list)

string_str ="001|code1234|spaceA|15000"
string_list = string_str.split("|")
print("PK : ", string_list[0])
print("CODE : ", string_list[1])
print("Name : ", string_list[2])
print("Price : ", int(string_list[3])*1.15)
