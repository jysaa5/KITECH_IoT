#데이터 저장용 list 선언, 데이터 입력
# students = [
#     {'name':'Scott', 'Korean': 87, 'math':91, 'English': 90, 'science': 70},
#     {'name':'King', 'Korean': 97, 'math':99, 'English': 70, 'science': 80},
#     {'name':'Adam', 'Korean': 67, 'math':77, 'English': 83, 'science': 88},
#     {'name':'Smith', 'Korean': 87, 'math':82, 'English': 78, 'science': 77},
#     {'name':'Son', 'Korean': 77, 'math':90, 'English': 69, 'science': 90},
#     {'name':'Lee', 'Korean': 83, 'math':69, 'English': 100, 'science': 60},
#     {'name':'Kim', 'Korean': 80, 'math':77, 'English': 60, 'science': 100}
# ]

#학생들의 이름, 총점, 평균 
#sep: 각 문자열 사이 안에 끼워서 넣을 것.
print('이름', '총점', '평균', sep='\t')


#학생 리스트 반복 출력
#소수점 없이 출력하는 연산자: //
# for st in students:
#     score_sum = st['Korean']+st['English']+st['math']+st['science']
#     score_avg = score_sum//4
#     print(st['name'], score_sum, score_avg, sep='\t')

#코드 간결화 하기.
#1. list에 추가할 object를 만드는 함수
# def makeStudent(name, kor, math, eng, sci):
#     return {'name': name, 'Korean': kor, 'math':math, 'English': eng, 'science': sci}

# students = [
#     makeStudent('Scott', 87, 91, 90, 70),
#     makeStudent('King', 97, 99, 70, 80),
#     makeStudent('Adam', 67, 77, 83, 88),
#     makeStudent('Smith', 87, 82, 78, 77),
#     makeStudent('Son', 77, 90, 69, 90),
#     makeStudent('Lee', 83, 69, 100, 60),
#     makeStudent('Kim', 80, 77, 60, 100)
# ]

#dic 참조
# for st in students:
#     score_sum = st['Korean']+st['English']+st['math']+st['science']
#     score_avg = score_sum/4
#     print(st['name'], score_sum, score_avg, sep='\t')


#2. Student Class 정의
class Student:
    #Constructor(생성자) 정의 / self 인자는 전달받지 않는다.
    def __init__(self, name, kor, math, eng, sci):
        self.name = name
        self.Korean = kor
        self.math = math
        self.English = eng
        self.science = sci

    #각 과목의 점수의 합을 구해 반환하는 메서드
    def score_sum(self):
        return self.Korean+self.math+self.English+self.science

    #각 과목의 평균값을 구해 반환하는 메서드
    def score_avg(self):
        return self.score_sum()/4



#인스턴스 선언
#class를 이용한 인스턴스 생성
#st_a = Student() 

#print(type(st_a))

#st_a 객체에 name 속성을 추가함. 동적으로 추가함. 클래스에 추가하는 건 아님. -> 자바하고 다른 점. node.js와는 비슷함.
#st_a.name = 'son'
#print(st_a.name)

#다른 객체에는 name 속성이 추가되지 않는 것을 확인할 수 있다.
#st_b = Student()
#print(type(st_b))
#print(st_b.name)

#3. list에 추가할 object를 class를 이용해서 만드는 함수
# def makeStudent_class(name, kor, math, eng, sci):
#     st_temp = Student()
#     st_temp.name = name
#     st_temp.Korean = kor
#     st_temp.math = math
#     st_temp.English = eng
#     st_temp.science = sci
#     return st_temp


# students = [
#     makeStudent_class('Scott', 87, 91, 90, 70),
#     makeStudent_class('King', 97, 99, 70, 80),
#     makeStudent_class('Adam', 67, 77, 83, 88),
#     makeStudent_class('Smith', 87, 82, 78, 77),
#     makeStudent_class('Son', 77, 90, 69, 90),
#     makeStudent_class('Lee', 83, 69, 100, 60),
#     makeStudent_class('Kim', 80, 77, 60, 100)
# ]

# for st in students:
#     #class 인스턴스 속성 참조
#     score_sum = st.Korean+st.English+st.math+st.science
#     score_avg = score_sum/4
#     print(st.name, score_sum, score_avg, sep='\t')

#Studnet 클래스를 이용한 object 생성
students = [
    Student('Scott', 87, 91, 90, 70),
    Student('King', 97, 99, 70, 80),
    Student('Adam', 67, 77, 83, 88),
    Student('Smith', 87, 82, 78, 77),
    Student('Son', 77, 90, 69, 90),
    Student('Lee', 83, 69, 100, 60),
    Student('Kim', 80, 77, 60, 100)
]

for st in students:
    print(st.name, st.score_sum(), st.score_avg(), sep = '\t')

