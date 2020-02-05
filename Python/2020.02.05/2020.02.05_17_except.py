list_ex = ["52", "274", "100", "스파이", "102"]

list_result = []

for item in list_ex:
    try:
        float(item) #예외가 발생한다.
        #list_result.append(item) #여기를 건너뛴다. 
    except Exception as e:
        #pass
        print('type(e): ', type(e))
        print('Exception e:', e)
    else:
        list_result.append(item) #문제가 없는 것들만 append 해줌. 
    finally:
        print('한 번의 반복 구문이 종료되었습니다.')



print(list_ex)
print(list_result)