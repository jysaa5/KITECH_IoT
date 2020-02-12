import logging

logger = logging.getLogger('main')
stream_hand = logging.StreamHandler() #콘솔에 출력하는 것이다.
logger.addHandler(stream_hand)

#텍스트만 출력됨.
#logger.setLevel(logging.DEBUG)
logger.setLevel(logging.INFO)
logger.debug('틀렸음~!!!')
logger.info('확인~!!!')
logger.warning('조심~!!!') #기본적으로 여기서부터 시작함. default level
logger.error('에러발생~!!!')
logger.critical('치명적~!!!')
