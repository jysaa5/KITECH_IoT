package com.kite.jdbc.dao;
//Mapper.xml의 namespace명과 동일해야 한다.

import java.util.List;

import com.kite.jdbc.domain.Member;
import com.kite.jdbc.domain.RequestMemberReg;

public interface MemberDaoInterface {

	// 전체 리스트
	public List<Member> getMemberList();

	// 같은 이름의 메서드를 오버로딩하지 않는다.
	// Mapper에 있는 id와 동일한 메서드 이름을 사용한다.

	// ID로 검색
	public Member getMemberById(Integer id);

	//email로 검색
	public Member getMemberByEmail(String email);

	//입력
	public int insertMember(RequestMemberReg request);
	
}
