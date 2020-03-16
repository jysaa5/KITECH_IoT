package com.iot.smarthome.cctv.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.smarthome.cctv.dao.CctvDao;
import com.iot.smarthome.cctv.domain.CctvDetailViewVo;


//서비스 bean으로 등록하기 
//BoardDetailViewService: 회원 정보에서 idx와 일치하는 회원 정보를 가져다주는 서비스 클래스 (조회 기능)
@Service("cctvDetailViewService")
public class CctvDetailViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private CctvDao dao;
	
	//getPostingidx: 게시글 번호를 반으면 조회하여 찾아주는 메서드
	public CctvDetailViewVo getDetailPostingidx(int idx) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(CctvDao.class);
		
		return dao.selectCctvByIdx3(idx);
		
	}//getDetailPostingidx 메서드 끝

}//BoardDetailViewService 클래스 끝
