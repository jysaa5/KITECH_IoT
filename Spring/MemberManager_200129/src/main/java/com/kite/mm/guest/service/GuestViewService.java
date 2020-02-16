package com.kite.mm.guest.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.guest.dao.GuestDao;
import com.kite.mm.guest.domain.GuestArticleVo;

//GuestViewService: 회원 정보에서 idx와 일치하는 회원 정보를 가져다주는 서비스 클래스 (조회 기능)
@Service
public class GuestViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private GuestDao dao;
	
	//getArticle: 게시글 번호를 반으면 조회하여 찾아주는 메서드
	public GuestArticleVo getArticle(int idx) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(GuestDao.class);
		
		return dao.selectGuestByIdx(idx);
	}

}
