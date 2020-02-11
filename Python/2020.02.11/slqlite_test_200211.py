#테이블의 질의
#sqlite3
import sqlite3

#DB 연결
#con = sqlite3.connect('naverDB')
#con = sqlite3.connect('phonebook')
con = sqlite3.connect('phonebooksample')

cur = con.cursor()

sql_select = 'select * from phonebook_table'

cur.execute(sql_select)

print('아이디\t 이름\t 이메일\t 태어난 해')


while True:
    row = cur.fetchone() #반환 행이 없으면 None을 반환 해준다. 
    if row == None:
        break
    print('{}\t {}\t {}\t'.format(row[0], row[1], row[2]))

con.close()

