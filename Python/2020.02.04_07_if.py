# Bool 타입으로 치환되는 상황
# 0 -> False
# None -> False
# 빈 문자열 "" -> False
# 빈 list -> False
num = 0
str_blank = ""
nums = []


if 0:
    print('0은 True 처리가 됩니다.')
else:
     print('0은 False 처리가 됩니다.')

if num:
    print('{}은 True 처리가 됩니다.'.format(num))
else:
     print('{}은 False 처리가 됩니다.')

num = 12
if num:
    print('{}은 True 처리가 됩니다.'.format(str_blank))
else:
     print('{}은 False 처리가 됩니다.'.format(str_blank))

if str_blank:
    print('{}은 True 처리가 됩니다.'.format(str_blank))
else:
     print('빈 문자열은 False 처리가 됩니다.')

if nums:
    print('{}은 True 처리가 됩니다.'.format(nums))
else:
     print('빈 리스트는 False 처리가 됩니다.')

nums = [3,5]

if nums:
    print('{}은 True 처리가 됩니다.'.format(nums))
else:
     print('빈 리스트는 False 처리가 됩니다.')


#문장을 비워놓은 채로 넘긴다.
if num:
    pass
else:
    pass