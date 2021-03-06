#데이터 저장을 위한 클래스
#기능 클래스 -> 기능 모듈
#데이터를 저장하고 있는 배열(리스트) -> []
#기능 메서드: 입력(리스트), 삭제(리스트 삭제), 검색, 전체 출력

#친구의 정보를 저장하는 리스트

# class 정의: PhoneInfo
# 속성: name, phonenumber, birthday
# 기능: showInfo
class PhoneInfo:
    #생성자
    def __init__(self, name, phonenumber, birthday):
        self.name = name
        self.phonenumber = phonenumber
        self.birthday = birthday
    
    def checkInfo(self, keyword):
        return self.name==keyword
    
    #__str__() 함수 재정의
    def __str__(self):
        return '------------정보출력 시작------------\n 이름:{}\n 전화번호:{}\n 생일:{}\n------------정보출력 종료------------'.format(self.name, self.phonenumber, self.birthday) 


#sqlLite DB 연결
import sqlite3

#클래스 생성
class Sql:
    def __init__(self):
        self.con = sqlite3.connect('phonebooksample')
        self.cur = self.con.cursor()
        
        
    def allselect_sql(self):
        self.sql1 = 'select * from phonebook_table'
        self.cur.execute(self.sql1)
        print('이름\t | 전화번호\t | 생일')
        while True:
            row = self.cur.fetchone() #반환 행이 없으면 None을 반환 해준다. 
            if row == None:
                break
            print('{}\t\t{}\t\t{}'.format(row[0], row[1], row[2]))

    def insert_sql(self, name, pNum, bDay):
        self.sql2 = 'insert into phonebook_table values (\'{}\',\'{}\' ,\'{}\')'.format(name,pNum,bDay)
        self.cur.execute(self.sql2)
    
    def select_sql(self,name):
        self.sql3 = 'select * from phonebook_table where name = \'{}\''.format(name)
        self.cur.execute(self.sql3)
        self.chk_num = 0     
        print('이름\t | 전화번호\t | 생일')
        while True:
            row = self.cur.fetchone() #반환 행이 없으면 None을 반환 해준다. 
            if row == None:
                break
            print('{}\t\t{}\t\t{}'.format(row[0], row[1], row[2]))
            self.chk_num += 1

    def select_sql1(self,name):
        self.sql3 = 'select * from phonebook_table where name = \'{}\''.format(name)
        self.cur.execute(self.sql3)
        self.chk_num = 0     
        while True:
            row = self.cur.fetchone() #반환 행이 없으면 None을 반환 해준다. 
            if row == None:
                break
            self.chk_num += 1
        return self.chk_num
    
    def delete_sql(self,name):
        self.sql4 = 'delete from phonebook_table where name = \'{}\''.format(name)
        self.cur.execute(self.sql4)

    def exit(self):
        self.con.commit()
        self.con.close()


pBooks = [] #이 파일안에서는 전역변수

def insertMember():
    sql = Sql()
    name = input('이름을 입력해주세요.>>')
    pNum = input('전화번호를 입력해주세요.>>')
    bDay = input('생일을 입력해주세요.>>')
    sql.insert_sql(name,pNum,bDay) 
    member = PhoneInfo(name,pNum,bDay)
    pBooks.append(member)
    sql.exit()

def showList():
    print('----전체 정보 리스트----')
    sql = Sql()
    sql.allselect_sql()
    sql.exit()
    #for member in pBooks:
    #print(member)

def searchInfo():
    sql = Sql()
    print('----검색(이름)----')
    keyword = input('찾으시는 이름을 입력해주세요>>')
    #검색 결과가 없을 때: 0, 검색 결과가 있을 때: 1 이상
    sql.select_sql(keyword)
    if(sql.chk_num == 0):
        print()
        print('찾으시는 이름의 정보가 존재하지 않습니다.')
        print()
    sql.exit()

def deleteInfo():
    print('----삭제(이름)----')
    sql = Sql()
    keyword = input('이름을 입력해주세요>>')
    delCnt = 0
    for i, member in enumerate(pBooks):
        if member.checkInfo(keyword):
            del pBooks[i]
            delCnt +=1
    if sql.select_sql1(keyword) != 0:
        sql.delete_sql(keyword)
        print()
        print('삭제가 완료되었습니다.')
        print()
    else:
        print()
        print('찾으시는 이름의 정보가 존재하지 않습니다.')
        print()
    sql.exit()



