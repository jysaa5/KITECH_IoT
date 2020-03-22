package com.iot.smarthome.styler.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.iot.smarthome.styler.dao.StylerDao;
import com.iot.smarthome.styler.domain.StylerEditVo;


//서비스 bean으로 등록하기 
//BoardViewService: 회원 정보에서 idx와 일치하는 회원 정보를 가져다주는 서비스 클래스 (조회 기능)
@Service("viewService")
public class StylerViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private StylerDao dao;
	
	//getPostingidx: 게시글 번호를 반으면 조회하여 찾아주는 메서드
	public StylerEditVo getPostingidx(int idx) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(StylerDao.class);
		
		return dao.selectStylerByIdx(idx);
		
	}//getPostingidx 메서드 끝

}//BoardViewService 클래스 끝
