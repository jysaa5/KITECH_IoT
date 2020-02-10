import test_module as test
#from test_module import number_input

#print(test.__package__) #같은 패키지에 있으면 표시가 안됨.
#print(test.__name__)
#print(test.__doc__) #기본적으로 정의되어 있는게 없음.
#print(test.__file__) #test모듈이 어디 위치에 있는지.


r = test.number_input()
print('원의 둘레 값은: ', test.get_circleconference(r) )
print('원의 면적 값은: ', test.get_circle_area(r) )
