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
	private Member mDao;
	
	//login 메서드: 로그인 폼을 작성하고 로그인 여부를 반환하는 메서드
	public MemberRequest login(MemberRequest request){
	
		mDao = template.getMapper(Member.class);
		
		MemberRequest userlogin = mDao.loginMember(request);
		
		System.out.println(userlogin);
		
		
		return userlogin;
		
	}
}
