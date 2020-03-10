package com.iot.smarthome.cctv.dao;

import com.iot.smarthome.cctv.domain.CctvVo;

public interface CctvDao {

	//사진 저장
	public int insertCctv(CctvVo cctv);

}
