#테이블의 질의
#sqlite3
import sqlite3

#DB 연결
#con = sqlite3.connect('naverDB')
#con = sqlite3.connect('phonebook')
con = sqlite3.connect('phonebooksample')

cur = con.cursor()

<<<<<<< HEAD
#sql_select = 'select * from phonebook_table WHERE name={}'.format('kim')

sql_select = 'delete from phonebook_table WHERE name=\'{}\''.format('k')
#sql_select = 'select * from phonebook_table'
cur.execute(sql_select)
print(cur.execute(sql_select))
print('이름\t 전화번호\t 생일')
con.commit()
=======
sql_select = 'select * from phonebook_table'

cur.execute(sql_select)

print('아이디\t 이름\t 이메일\t 태어난 해')

>>>>>>> cc63c21aa5c910edc8d25bfcbbbb63eee1a97906

while True:
    row = cur.fetchone() #반환 행이 없으면 None을 반환 해준다. 
    if row == None:
        break
    print('{}\t {}\t {}\t'.format(row[0], row[1], row[2]))

con.close()

