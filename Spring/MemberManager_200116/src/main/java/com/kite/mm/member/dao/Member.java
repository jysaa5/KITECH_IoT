package com.kite.mm.member.dao;

import java.util.List;

import com.kite.mm.member.domain.MemberListView;
import com.kite.mm.member.domain.MemberRequest;


public interface Member {

	//회원 가입
	public int insertMember(MemberRequest request);

	//회원 리스트
	public List<MemberRequest> selectMemberList(int startMemberRow, int cOUNT_PER_PAGE);
	
	// 전체 멤버의 수
	public int selectMemberCount();

	//회원 정보 수정
	public int editMember(MemberRequest request);

	//회원 정보 조회
	public MemberRequest selectMemberByIdx(int idx);

	//회원 정보 삭제
	public int deleteMember(int idx);

	//회원 로그인 
	public MemberRequest loginMember(MemberRequest request);

	//회원 마이페이지 이메일로 정보 조회
	public MemberRequest selectMemberByuemail(String uemail);

}
