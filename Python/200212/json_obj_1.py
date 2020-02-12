import json

with open('200212/member_data.json', 'r', encoding='utf-8') as file:
    content = file.read()
    #print(content)
    json_data = json.loads(content) #loads: json을 파이썬의 object로 변환시킴.
    #print(json_data)
    for member in json_data:
        print(member['uname'])