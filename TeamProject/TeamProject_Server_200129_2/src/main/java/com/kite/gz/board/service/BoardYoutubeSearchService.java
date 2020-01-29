package com.kite.gz.board.service;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kite.gz.board.dao.BoardDao;
import com.kite.gz.board.domain.BoardYoutubeTitle;

@Service("YoutubeSearchService")
public class BoardYoutubeSearchService {

	
	@Inject
	private SqlSessionTemplate template;
	
	//인터페이스
	private BoardDao dao;
	
	//write 메서드: 게시글을 작성하고 게시글 번호를 반환하는 메서드
	public int boardYoutubeSearchSave(BoardYoutubeTitle request) {
	
		dao = template.getMapper(BoardDao.class);
		
		 return dao.searchTitleSave(request);
		
	}
	
}
