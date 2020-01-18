package com.kite.mm.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.guest.dao.GuestDao;
import com.kite.mm.guest.domain.WriteRequest;
import com.kite.mm.member.dao.Member;

//MemberDeleteService: 회원정보를 삭제하는 sql문을 실행하는 서비스 클래스 (회원정보 삭제 기능)
@Service
public class MemberDeleteService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	//인터페이스 
	private Member dao; 
	
	//deleteMember: 작성되어진 회원정보를 데이터를 받아서 삭제하기 위해 idx를 반환하는 메서드
	public int deleteMember(int idx) {
		
		//인터페이스 구현, SQL문 실행
		dao= template.getMapper(Member.class);
		
		return dao.deleteMember(idx);
	} 

}
