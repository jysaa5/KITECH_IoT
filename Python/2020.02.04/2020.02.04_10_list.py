#list 선언
list_a = [1,2,3]
list_b = [1,2,1,2]

#list에 요소 추가 append: 요소가 맨 마지막 index 뒤로 추가가 된다.
list_a.append(4)
print(list_a) 

list_a.append(5)
print(list_a) 


#list 요소 추가 insert: 특정 지정한 index의 위치에 요소가 추가
list_a.insert(0,100)
print(list_a) 

list_a.insert(2,300)
print(list_a) 

#list 다른 list 요소를 추가해준 함수: extend
list_a.extend([1000, 10000, 100000])
print(list_a)

#list 요소 삭제: del 키워드
print('-----요소 삭제 del[2]-----')
print(list_a)
del list_a[2] #2번지 요소를 삭제: 300 제거
print(list_a)

print('-----요소 삭제 pop(0)-----')
list_a.pop(0) #0번지 요소를 삭제: 100 제거
print(list_a)

#list 요소 삭제: del 키워드 범위 삭제
print('-----요소 삭제 del [2:5]-----')
del list_a[2:5] #index 2,3,4 인 요소가 삭제
print(list_a)

print('-----요소 삭제 del [2:]-----')
del list_a[2:] #index 2부터 그 다음 요소들 모두 삭제
print(list_a) 

#remove를 이용한 요소 삭제: 요소 값으로 삭제
print('-----remove(2) 삭제-----')
list_b.remove(2)
print(list_b)
print('\n------------------------\n')

#clear()를 이용한 모든 요소 삭제
print('-----clear() 모든 요소 삭제-----')
list_b.clear()
print(list_b)
print('\n------------------------\n')

#in 연산자로 요소 존재 유무 확인: True / False 
chk_1 = 10000 in list_a
chk_2 = 1 in list_a
print('list_a의 요소에 10000이 존재 하는가?  ==>  ', chk_1)
print('list_a의 요소에 1이 존재 하는가?  ==>  ', chk_2)

