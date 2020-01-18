package com.kite.mm.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.guest.dao.GuestDao;
import com.kite.mm.guest.domain.GuestArticleVo;
import com.kite.mm.guest.domain.GuestListView;
import com.kite.mm.member.dao.Member;
import com.kite.mm.member.domain.MemberListView;
import com.kite.mm.member.domain.MemberRequest;

//MemberListService: 멤버 수를 표현하는 서비스 (멤버 페이지 리스트 출력 기능)
@Service
public class MemberListService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스
	private Member mDao;

	// 한 페이지 표현될 게시글의 개수
	private final int COUNT_PER_PAGE = 10;

	//GuestListView 객체를 반환하는 메서드: 페이지 번호를 받으면, 
	//게시글 리스트에서 처음에 시작하는 위치 순서를 계산함.그래서 해당 페이지에 게시될 게시글의 처음 시작 번호와 게시글 수를 주어서 페이지당 
	//일정한 게시글이 보이도록 하는 메서드
	public MemberListView getMemberListView(int mPageNo) {
		
		//dao를 쓸수 있도록 한다.
		mDao = template.getMapper(Member.class);
		
		//시작 게시글의 위치 startRow
		int startMemberRow = (mPageNo-1)*COUNT_PER_PAGE;
		

		//페이지 표현할 게시글의 리스트
		List<MemberRequest> mList = mDao.selectMemberList(startMemberRow, COUNT_PER_PAGE);
		
		
		//전체 게시글의 개수
		int totalMemberCount = mDao.selectMemberCount();
		
		//객체 생성 
		MemberListView mListView = new MemberListView(mList, totalMemberCount,  mPageNo, startMemberRow, COUNT_PER_PAGE);
		
		return mListView;
	}

}
