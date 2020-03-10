package com.iot.smarthome.led.dao;

import com.iot.smarthome.led.domain.LedWriteRequestVo;


public interface LedDao {

	int insertLed(LedWriteRequestVo write);



}
