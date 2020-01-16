package com.kite.mm.member.dao;

import com.kite.mm.member.domain.MemberRequest;

public interface Member {

	//회원 가입
	int insertMember(MemberRequest request);

}
