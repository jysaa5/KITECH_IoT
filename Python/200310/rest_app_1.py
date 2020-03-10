# coding: utf-8

#flask 모듈안에 Flask 객체
from flask import Flask, jsonify, abort, make_response

#jsonify: 딕셔너리, 리스트를 json 형식으로 바꿔줌

#abort: 에러, 예외 응답 처리 

#make_response: 특정 메시지나 객체를 

app = Flask(__name__)

@app.route('/')
def index():
    return '<h1>Hello~!!</h>'

#GET
# @app.route('/rest/v1/data', methods = ['GET'])
# def data_get():

#     data_dic = {
#         'id':'cool',
#         'name':'COOL',
#         'pw': 'abcd1234'
#     }

#     data_dic1 = [{
#         'id':'cool',
#         'name':'COOL',
#         'pw': 'abcd1234'
#     },{
#         'id':'cool',
#         'name':'COOL',
#         'pw': 'abcd1234'
#     }]
#     return jsonify(data_dic, {'members':data_dic1})

#POST -> Postman에서 확인
@app.route('/rest/v1/data', methods = ['POST'])
def data_post():

    data_dic = {
        'id':'cool',
        'name':'COOL',
        'pw': 'abcd1234'
    }

    data_dic1 = [{
        'id':'cool',
        'name':'COOL',
        'pw': 'abcd1234'
    },{
        'id':'cool',
        'name':'COOL',
        'pw': 'abcd1234'
    }]
    return jsonify(data_dic, {'members':data_dic1})


#GET
#led
@app.route('/rest/v1/leds/<int:led_id>', methods = ['GET'])
def led_get(led_id):

    data_dic ={'led_no': led_id}

    if led_id > 9:
        abort(404)
        #500: 서버 오류


    return jsonify(data_dic)


@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({'error':'not used led Number'}))







if __name__=='__main__':
    app.run(debug=True)