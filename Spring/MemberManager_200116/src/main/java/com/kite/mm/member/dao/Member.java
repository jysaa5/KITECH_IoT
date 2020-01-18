package com.kite.mm.member.dao;

import java.util.List;

import com.kite.mm.member.domain.MemberListView;
import com.kite.mm.member.domain.MemberRequest;

public interface Member {

	//회원 가입
	int insertMember(MemberRequest request);

	//회원 리스트
	List<MemberRequest> selectMemberList(int startMemberRow, int cOUNT_PER_PAGE);
	
	// 전체 멤버의 수
	int selectMemberCount();

	//회원 정보 수정
	int editMember(MemberRequest request);

	//회원 정보 조회
	MemberRequest selectMemberByIdx(int idx);

	//회원 정보 삭제
	int deleteMember(int idx);

	//회원 로그인 
	String loginMember(MemberRequest request);

}
