#날짜/시간 관련 모듈 호출
import datetime

list_data = []

for i in range(5):
    key_name = str(datetime.datetime.now())
    #센서 데이터 가져오기
    dic_temp = {
        key_name: {'data1': '측정값'+str(i)}
        }

    #측정 데이터 저장 (list, DB, file, network)
    list_data.append(dic_temp)
    for k in range(100000): 
        pass

for dic in list_data: 
     print(dic)

#for i in range(10000):
#    pass

#현재 시간 구하기
#print(datetime.datetime.now())
#for i in range(10000):
#    pass
#print(datetime.datetime.now())
#print(datetime.datetime.now())