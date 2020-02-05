# 함수 정의. 
# 매개변수로 전달받은 데이터의 제곱의 연산값을 반환하는 함수
def power(num):
    return num*num

#위에 것과 같음.
power_lamda = lambda x: x*x 

#전달 받은 데이터를 3과 비교해서 작은 값일때, True 반환하는 함수
def under_3(n):
    return n<3

under_3_lamda = lambda x: x<3

list_data = [1,2,3,4,5]

output_list_a = map(power, list_data)
print('output_list_a:' ,output_list_a ) #객체로 나옴. 
print('output_list_a:' ,list(output_list_a) ) 

print()

output_list_b = filter(under_3, list_data)
print('output_list_b:' , output_list_b) #객체로 나옴.
print('output_list_b:' ,list(output_list_b) )