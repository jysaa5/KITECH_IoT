import random

#리스트 생성
han = list('가나다라마바사아자차카타파하')

#print(han)

with open('info.txt','w', encoding='utf-8')as file:
    for i in range(1000):
        name = random.choice(han)+random.choice(han)+random.choice(han)
        weight = random.randrange(40, 100) #start와 stop은 꼭 들어가야 된다.
        height = random.randrange(140, 200)

        file.write("{}, {}, {}\n".format(name, weight, height))

print('파일이 생성되었습니다.')

