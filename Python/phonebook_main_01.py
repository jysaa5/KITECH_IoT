from module_basic.phoneBook import phonebookmanager_01 as pbm
import sys

while True:
    print('------------------------------------------------------------------------')
    print('메뉴를 입력해주세요.\n (1)데이터 입력\n (2)전체 출력 \n (3)조회 \n (4)삭제 \n (5)exit')
    print('------------------------------------------------------------------------')
    choice = input('메뉴 번호를 입력해주세요. >>')

    if choice =='1':
        pbm.insertMember()
    elif choice == '2':
        pbm.showList()
    elif choice == '3':
        pbm.selectMember()
    elif choice == '4':
        pbm.deleteMember()
    elif choice == '5':
        #break -> break만 해도 된다.
        sys.exit()
    else:
        print('유효한 메뉴번호가 아닙니다. 확인해주세요.')


