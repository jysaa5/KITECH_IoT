
print('이름', '총점', '평균', sep='\t')

#2. Student Class 정의
class Student:
    count = 0

    #Constructor(생성자) 정의 / self 인자는 전달받지 않는다.
    def __init__(self, name, kor, math, eng, sci):
        self.name = name
        self.Korean = kor
        self.math = math
        self.English = eng
        self.science = sci

        Student.count += 1
        print('인스턴스가 생성되었습니다.')

    #각 과목의 점수의 합을 구해 반환하는 메서드
    def score_sum(self):
        return self.Korean+self.math+self.English+self.science

    #각 과목의 평균값을 구해 반환하는 메서드
    def score_avg(self):
        return self.score_sum()/4

    #__str()__재 정의
    def __str__(self):
        return '{}\t{}\t{}'.format(self.name, self.score_sum(), self.score_avg())
    
    #cls: 클래스 정보
    @classmethod
    def print(cls):
        print(Student.count)
    
    #print()메서드를 제외하고 나머지 메서드들은 인스턴스가 생성되어야 사용가능

#0을 출력함.
Student.print()


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

print('{}개의 리스트의 요소가 생성되었습니다'.format(Student.count))

for st in students:
    # print(st.name, st.score_sum(), st.score_avg(), sep = '\t')
    print(st) #객체 출력

