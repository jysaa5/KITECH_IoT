package com.iot.smarthome.styler.dao;


import java.util.List;

import com.iot.smarthome.styler.domain.StylerDetailViewVo;
import com.iot.smarthome.styler.domain.StylerEditVo;
import com.iot.smarthome.styler.domain.StylerVo;

public interface StylerDao {

	//사진 저장
	public int insertStyler(StylerVo styler);

	//사진인덱스 찾기 - 리스트
	public StylerEditVo selectStylerByIdx(int stylerIdx);

	//사진인덱스 찾기 - 디테일 뷰
	public StylerDetailViewVo selectStylerByIdx3(int stylerIdx);

	
	public List<StylerEditVo> selectStylerList(int startRow, int cOUNT_PER_PAGE);

	public int selectStylerCount();

}
