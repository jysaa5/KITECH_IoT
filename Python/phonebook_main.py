from module_basic.phoneBook import phonebookmanager as pbm
import sys

while True:
    print('메뉴를 입력해주세요.\n (1)데이터 입력\n (2)전체 출력 \n (3)exit')
    choice = input('메뉴 번호를 입력해주세요. >>')

    if choice =='1':
        pbm.insertMember()
    elif choice == '2':
        pbm.showList()
    elif choice == '3':
        #break -> break만 해도 된다.
        sys.exit()
    else:
        print('유효한 메뉴번호가 아닙니다. 확인해주세요.')


