package com.kite.gz.board.service;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kite.gz.board.dao.BoardDao;
import com.kite.gz.board.domain.Board;
import com.kite.gz.board.domain.BoardEditVo;
import com.kite.gz.board.domain.BoardPasswordVo;

//비밀번호를 체크하는 서비스 
@Service("PwCheckService")
public class BoardPwCheckService {

	@Inject
	private SqlSessionTemplate template;

	//인터페이스
	private BoardDao dao;

	public int passwordCheck(BoardPasswordVo request) {
		
		dao = template.getMapper(BoardDao.class);
		
		int pwCheck = 0;

		BoardPasswordVo getgpwchek = null;

		getgpwchek = dao.pwcheck(request);
		
		if (getgpwchek != null) {

			pwCheck = 2;
		}
		
		return pwCheck;
		
	}//passwordCheck 메서드 끝
	
	
	
	public BoardPasswordVo getBoardPost(int idx) {

		//인터페이스 구현, SQL문 실행
		dao = template.getMapper(BoardDao.class);
		
		return dao.selectBoardByIdx2(idx);
	}
	

}//passwordCheck 클래스 끝