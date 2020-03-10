package com.iot.smarthome.led.service;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.led.dao.LedDao;
import com.iot.smarthome.led.domain.LedWriteRequestVo;


@Service("ledWriteService")
public class LedWriteService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	private LedDao dao;
	
	public int writeLed(HttpServletRequest request, LedWriteRequestVo write) {
		
		dao = template.getMapper(LedDao.class);
		
		return 	dao.insertLed(write);
			
	}

}
