# coding: utf-8

#flask 모듈안에 Flask 객체
from flask import Flask, jsonify, abort, make_response
from flask_restful import Api, Resource

#sqlite3
import sqlite3
con = sqlite3.connect('sample', check_same_thread=False)

app = Flask(__name__)
api = Api(app)

class LedApi(Resource):
    def get(self, led_no):
        cur = con.cursor()
        sql_select = 'select * from user_table'
        cur.execute(sql_select)

        result_data={}

        while True:
            row = cur.fetchone()
            if row == None:
                break

            result_data= {
                'id':row[0],
                'name':row[1],
                'emali':row[2],
                'birthday': row[3]
            }

        # return({
        #     'type':'GET',
        #     'led_no': led_no
        
        # })
        return result_data
    
    def post(self, led_no):
        return({'type': 'POST'})

    def put(self, led_no):
        return({'type':'PUT'})
    
    def delete(self, led_no):
        return({'type': 'DELET'})


# api.add_resource(LedApi, '/rest/v2/leds')
api.add_resource(LedApi, '/rest/v2/leds/<led_no>')


if __name__=='__main__':
    app.run(debug=True)
    