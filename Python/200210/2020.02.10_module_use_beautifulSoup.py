from bs4 import BeautifulSoup as bs

from urllib import request 

#urlopen() 함수를 이용해서 기상청 데이터 가져오기 
target = request.urlopen('http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1165051000')
#data = target.read()
#print(data)

soup = bs(target, 'html.parser')

#print(sou.prettify())


print(soup.find('title').string)


#data라는 변수에 담을 것이다.
for fdata in soup.find_all('data'):
    print(fdata.hour.string, '시 예보', end = '') #\n(개행)를 안함. 
    print(fdata.day.string, ''  ,end = '')
    print('현재온도: ',fdata.temp.string, ' 도',end = '')
    print('강수 상태: ',fdata.pty.string)


