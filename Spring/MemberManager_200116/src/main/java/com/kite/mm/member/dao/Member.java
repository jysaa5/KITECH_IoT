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

}
