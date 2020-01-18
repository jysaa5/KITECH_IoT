package com.kite.mm.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kite.mm.member.dao.Member;
import com.kite.mm.member.domain.MemberRequest;

//서비스 bean으로 등록하기 
@Service
public class MemberLoginService {

	//bean 주입
	@Autowired
	private SqlSessionTemplate template;
	
	//인터페이스
	private Member mdao;
	
	//login 메서드: 게시글을 작성하고 게시글 번호를 반환하는 메서드
	public String login(MemberRequest request) {
		
		String logintry = "fail";
		//인터페이스 구현, SQL문 실행
		mdao = template.getMapper(Member.class);
		
		
		if(!mdao.loginMember(request).equals(null)) {
			logintry = "success";
		}
		
		
		return logintry;
	}
	
}
