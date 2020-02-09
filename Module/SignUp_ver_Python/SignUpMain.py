import sys

#리스트
name = []
phoneNumber = []
email = []
company = []
school = []

#signUpBook = [name, phoneNumber, email, company]

#증가, 감소하는 index를 담는 변수 선언 / 메뉴 번호 변수 선언
CNT = 0
INSERT_Info = '1'
SEARCH = '2'
DELETE = '3'
LIST = '4'
EXIT = '5'

#<<insertInfo 메서드: 정보입력 메서드>>
def insertInfo():
    print("이름를 입력해주세요.")
    nameInput = input(">>")
    print("전화번호를 입력해주세요.")
    phoneNumberInput = input(">>")
    print("이메일를 입력해주세요.")
    emailInput = input(">>")
    print("학교를 입력해주세요.")
    schoolInput = input(">>")
    print("회사를 입력해주세요.")
    companyInput = input(">>")
    global CNT

    name.insert(CNT, nameInput)
    phoneNumber.insert(CNT, phoneNumberInput)
    email.insert(CNT, emailInput)
    school.insert(CNT,schoolInput)
    company.insert(CNT, companyInput)

    CNT = CNT+1
    return CNT

#<<searchIndex 메서드: 이름으로 찾은 index 반환하는 메서드>>
def searchIndex(nameInput):
    
    index = -1
    for i in range(len(name)):
        if(name[i] == nameInput):
            index = i
            break
    return index

#<<showInfo 메서드: 해당 index의 정보를 출력>>
def showInfo(index):
    print("이름:", name[index])
    print("전화번호:", phoneNumber[index])
    print("이메일:", email[index])
    print("학교:", school[index])
    print("회사:", company[index])
    print("--------------------------")

#<<searchInfo 메서드: 이름으로 정보 검색>>
def searchInfo():
    print("검색하고자 하는 이름을 입력해주세요.")
    nameInput = input(">>")
    index = searchIndex(nameInput)
    
    if index >= 0:
        print("--------------------------")
        showInfo(index)
        print("--------------------------")
    else:
         print("찾으시는 정보가 없습니다.")


#<<deleteInfo 메서드: 정보 삭제>>
def deleteInfo():
    print("삭제하고자 하는 이름을 입력해주세요.")
    nameInput = input(">>")
    index = searchIndex(nameInput)
    if index >= 0:
        del name[index]
        del phoneNumber[index]
        del email[index]
        del school[index]
        del company[index]
        
        global CNT
        CNT = CNT-1
        print("삭제되었습니다.")

    else:
        print("해당하는 정보가 없습니다.")
        
   


#<<showAll 메서드: 전체 리스트 출력>>
def showAll():
    print("친구 리스트")
    
    for i in range(len(name)):
        print("--------------------------")
        print(name[i], phoneNumber[i], email[i], school[i], company[i])
        print("--------------------------")
        
   


#<<switch 메서드: 메뉴를 선택하는 분기점>>
def switch(x):
    if x==INSERT_Info: insertInfo()
    elif x==SEARCH: searchInfo()
    elif x==DELETE: deleteInfo()
    elif x==LIST: showAll()
    elif x==EXIT: 
        print("프로그램을 종료합니다.")
        sys.exit()
    else: print("메뉴 번호를 정확히 입력해주세요.")


        


#<<main 실행 메서드>>
while True:
    print("==========================")
    print("메뉴를 입력해주세요.")
    print(INSERT_Info,". 정보입력")
    print(SEARCH,". 친구 검색")
    print(DELETE,". 친구 삭제")
    print(LIST,". 친구 전체 리스트")
    print(EXIT,". 프로그램 종료")
    print("==========================")
    num = input("번호입력>>")
    print("입력하신 번호",num)
    switch(num)




