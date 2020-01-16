package com.kite.mm.guest.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.guest.dao.GuestDao;
import com.kite.mm.guest.domain.WriteRequest;

//GuestDeleteService: 회원정보를 삭제하는 sql문을 실행하는 서비스 클래스 (게시글 삭제 기능)
@Service
public class GuestDeleteService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	//인터페이스 
	private GuestDao dao; 
	
	//deleteArticle: 작성되어진 방명록 데이터를 받아서 삭제하기 위해 idx를 반환하는 메서드
	public int deleteArticle(int idx) {
		
		//인터페이스 구현, SQL문 실행
		dao= template.getMapper(GuestDao.class);
		
		return dao.deleteArticle(idx);
	} 

}
