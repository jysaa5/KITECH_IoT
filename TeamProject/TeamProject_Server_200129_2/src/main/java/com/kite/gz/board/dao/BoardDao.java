package com.kite.gz.board.dao;

import java.util.List;

import com.kite.gz.board.domain.BoardWriteRequest;
import com.kite.gz.board.domain.BoardYoutubeTitle;
import com.kite.gz.board.domain.Board;
import com.kite.gz.board.domain.BoardEditVo;
import com.kite.gz.board.domain.BoardPasswordVo;

public interface BoardDao {

	// 추상메서드

	// 방명록에 글 데이터 입력
	//public int insertArticle(BoardWriteRequest request);
	
	// 방명록에 글 데이터 입력
	public int insertBoard(Board board);

	// 게시글의 리스트
	public List<BoardEditVo> selectBoardList(int startRow, int count);

	// 전체 게시글의 개수
	public int selectCount();

	// idx 값으로 한 개의 게시물을 받기
	public BoardEditVo selectBoardByIdx(int idx);

	// idx 값으로 한 개의 게시물의 데이터 수정
	public int editBoard(BoardWriteRequest request);

	//게시글 삭제 기능
	public int deleteBoard(int idx);

	//유튜브 search title 데이터 저장
	public int searchTitleSave(BoardYoutubeTitle request);

	public BoardPasswordVo selectBoardByIdx2(int idx);

	public BoardPasswordVo pwcheck(BoardPasswordVo request);


}
