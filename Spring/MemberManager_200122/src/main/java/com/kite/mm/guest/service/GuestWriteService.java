package com.kite.mm.guest.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.guest.dao.GuestDao;
import com.kite.mm.guest.domain.WriteRequest;

//서비스 bean으로 등록하기 
@Service
public class GuestWriteService {

	//bean 주입
	@Autowired
	private SqlSessionTemplate template;
	
	//인터페이스
	private GuestDao dao;
	
	//write 메서드: 게시글을 작성하고 게시글 번호를 반환하는 메서드
	public int write(WriteRequest request) {
		
		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(GuestDao.class);
		
		return dao.insertArticle(request);
	}
	
}
