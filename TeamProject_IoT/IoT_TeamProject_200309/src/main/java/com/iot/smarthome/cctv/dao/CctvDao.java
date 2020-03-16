package com.iot.smarthome.cctv.dao;

import java.util.List;

import com.iot.smarthome.cctv.domain.CctvDetailViewVo;
import com.iot.smarthome.cctv.domain.CctvEditVo;
import com.iot.smarthome.cctv.domain.CctvVo;

public interface CctvDao {

	//사진 저장
	public int insertCctv(CctvVo cctv);

	//사진 리스트 보기
	public List<CctvEditVo> selectCctvList(int startRow, int cOUNT_PER_PAGE);

	//사진 리스트 개수
	public int selectCctvCount();

	//사진인덱스
	public CctvEditVo selectCctvByIdx(int idx);

	
	public CctvDetailViewVo selectCctvByIdx3(int idx);

}
