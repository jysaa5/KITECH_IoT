# tuple 선언: ()를 이용. () 생략도 가능
tuple_a = (10, 20, 30)
tuple_a = 10, 20, 30 #소괄호 생략 가능

print(tuple_a[0])
print(tuple_a[1])
print(tuple_a[2])
#print(tuple_a[3]) #오류 난다.

print()

for num in tuple_a:
    print(num)
