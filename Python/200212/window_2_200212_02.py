from tkinter import *
from tkinter import messagebox

window = Tk()
window.title('동물 선택')
window.geometry('500x500')

#handler function: 이벤트 처리 함수
def view_func():
    if check_val.get() == 1:
        messagebox.showinfo('','강아지를 선택하셨군요.')
    elif check_val.get() == 2:
        messagebox.showinfo('','고양이를 선택하셨군요.')
    elif check_val.get() == 3:
        messagebox.showinfo('','펭수를 선택하셨군요.')
    else:
        messagebox.showinfo('','잘못된 선택입니다. 확인해주세요!')


#화면 구성을 위한 위젯
label_title = Label(text = '좋아하는 동물을 선택해주세요.', font = ('고딕체', 20), fg = 'blue')

#radio 선택 값을 저장할 변수
check_val = IntVar()
radio_btn_1 = Radiobutton(window, text='강아지', variable = check_val, value = 1)
radio_btn_2 = Radiobutton(window, text='고양이', variable = check_val, value = 2)
radio_btn_3 = Radiobutton(window, text='펭수', variable = check_val, value = 3)

btn = Button(window, text = '확인', command = view_func)

#위젯 배치
label_title.pack()
radio_btn_1.pack()
radio_btn_2.pack()
radio_btn_3.pack()
btn.pack()


#윈도우창 띄워주는 것.
window.mainloop()