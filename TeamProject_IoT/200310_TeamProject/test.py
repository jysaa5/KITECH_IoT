import requests
url ="http://www.naver.com"
response = requests.get(url)

print("status code :", response.status_code)