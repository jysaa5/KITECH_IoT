package com.kite.gz.board.dao;

import java.util.List;

import com.kite.gz.board.domain.BoardWriteRequest;
import com.kite.gz.board.domain.BoardYoutubeTitle;
import com.kite.gz.board.domain.Board;
import com.kite.gz.board.domain.BoardEditVo;
import com.kite.gz.board.domain.BoardPasswordVo;

//BoardDao 인터페이스: board패키지의 기능을 정의한 DAO
public interface BoardDao {

	//추상메서드
	
	//게시글 데이터 입력
	public int insertBoard(Board board);

	//게시글의 리스트 출력
	public List<BoardEditVo> selectBoardList(int startRow, int count);

	//전체 게시글의 개수 계산
	public int selectCount();

	//idx 값으로 한 개의 게시글을 받기
	public BoardEditVo selectBoardByIdx(int idx);

	//idx 값으로 한 개의 게시글의 데이터 수정
	public int editBoard(BoardWriteRequest request);

	//게시글 삭제 기능
	public int deleteBoard(int idx);

	//유튜브 search title 데이터 저장
	public int searchTitleSave(BoardYoutubeTitle request);

	//게시글 idx를 체크하는 기능
	public BoardPasswordVo selectBoardByIdx2(int idx);

	//게시글의 비밀번호 체크하는 기능
	public BoardPasswordVo pwcheck(BoardPasswordVo request);


}//BoardDao 인터페이스 끝
