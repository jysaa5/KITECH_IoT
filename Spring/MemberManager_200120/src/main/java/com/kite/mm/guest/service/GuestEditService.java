package com.kite.mm.guest.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.guest.dao.GuestDao;
import com.kite.mm.guest.domain.WriteRequest;

//GuestEditService: 게시글을 수정하는 sql문을 실행하는 서비스 클래스 (게시글 수정 기능)
@Service
public class GuestEditService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	//인터페이스 
	private GuestDao dao; 
	
	//editArticle: 작성되어진 방명록 데이터를 받아서 수정하기 위해 idx를 반환하는 메서드
	public int editArticle(WriteRequest request) {
		
		//인터페이스 구현, SQL문 실행
		dao= template.getMapper(GuestDao.class);
		
		return dao.editArticle(request);
	} 

}
