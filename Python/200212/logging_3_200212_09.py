import logging
#import datetime -> 파일 이름 포멧팅도 할 수 있다.

logger = logging.getLogger('myApp')
#파일에 로그를 출력할것이다.
hand = logging.FileHandler('myapp_20200212.log')
#로그 포멧팅
#                              생성시간, 로그레벨, 프로세스 아이디, 메세지  -> 메세지를 제외하고는 정해져 있는 값이다. 메세지는 우리가 만드는 것.       
formatter = logging.Formatter('%(asctime)s %(levelname)s %(process)d %(message)s')

#파일핸들러에 문자열 포메터를 등록 (위에 formatter 사이에 콤마 같은거 넣어도 됨)
hand.setFormatter(formatter)

logger.addHandler(hand)

#info부터 출력되도록 함.
logger.setLevel(logging.INFO)

logger.debug('틀렸음~!!!')
logger.info('확인~!!!')
logger.warning('조심~!!!') #기본적으로 여기서부터 시작함. default level
logger.error('에러발생~!!!')
logger.critical('치명적~!!!')
