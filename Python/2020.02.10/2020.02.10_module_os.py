#os 모듈 부르기
import os

#os 기본정보 출력
print('os.name:', os.name) #nt: 윈도우즈버전 모델명
print('os.getcwd():', os.getcwd()) #작업폴더 경로
print('os.listdir():', os.listdir()) #작업공간의 파일리스트

#폴더 생성, 제거
os.mkdir('hello') #폴더 생성
print('os.mkdir():', os.listdir())
os.rmdir('hello') #폴더 삭제

#파일 생성 후 파일의 이름 변경
with open('original.txt','w') as file:
    file.write('hello')

#이름 변경
os.rename('original.txt','new.txt')

#파일 삭제
os.remove('new.txt')

os.system('cls')
os.system('dir/w')
os.system('cls')
os.system('dir')
