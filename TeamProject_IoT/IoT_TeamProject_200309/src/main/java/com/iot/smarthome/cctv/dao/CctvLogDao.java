package com.iot.smarthome.cctv.dao;

import com.iot.smarthome.cctv.domain.CctvEditVo;
import com.iot.smarthome.cctv.domain.CctvLogVo;
import com.iot.smarthome.cctv.domain.CctvLogWriteRequestVo;

public interface CctvLogDao {

	//cctv 로그 파일 저장
	public int insertCctvLog(CctvLogVo writelog);

	//cctv 로그 파일 보여주기 위해 select하는 메서드
	public CctvEditVo selectCctvByName(String fileName);

	

}
