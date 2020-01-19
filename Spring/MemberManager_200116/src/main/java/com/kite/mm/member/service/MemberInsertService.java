package com.kite.mm.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kite.mm.member.dao.Member;
import com.kite.mm.member.domain.MemberRequest;

//서비스 bean으로 등록하기 
@Service
public class MemberInsertService {

	//bean 주입
	@Autowired
	private SqlSessionTemplate template;
	
	//인터페이스
	private Member mdao;
	
	//insert 메서드: 회원정보를 작성하고 idx를 반환하는 메서드
	public int insert(MemberRequest request) {
		
		//인터페이스 구현, SQL문 실행
		mdao = template.getMapper(Member.class);
		
		
		if(mdao.selectMemberByuemail(request.getUemail()) != null) {
			return -1;
		}
		
		return mdao.insertMember(request);
	}
	
}
