package com.kite.gz.board.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.gz.board.dao.BoardDao;
import com.kite.gz.board.domain.BoardWriteRequest;

//서비스 bean으로 등록하기 
//BoardEditSerivce: 게시글을 수정하는 sql문을 실행하는 서비스 클래스
@Service("editService")
public class BoardEditSerivce {
	
	//객체 주입
	@Autowired
	private SqlSessionTemplate template;
	
	//인터페이스 
	private BoardDao dao; 
	
	//editArticle: 작성되어진 방명록 데이터를 받아서 수정하기 위해 idx를 반환하는 메서드
	public int editPosting(BoardWriteRequest request) {
		
		//인터페이스 구현, SQL문 실행
		dao= template.getMapper(BoardDao.class);
		
		return dao.editBoard(request);
	} 

}
