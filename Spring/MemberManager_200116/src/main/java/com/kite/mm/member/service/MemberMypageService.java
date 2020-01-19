package com.kite.mm.member.service;


import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.member.dao.Member;
import com.kite.mm.member.domain.MemberRequest;

//MemberMypageService: 마이페이지 데이터를 찾는 sql문을 실행하는 서비스 클래스 
@Service
public class MemberMypageService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	//인터페이스 
	private Member mDao; 
	
	//selectMypage: 작성되어진 방명록 데이터를 받아서 수정하기 위해 idx를 반환하는 메서드
	public MemberRequest selectMypage (MemberRequest request, HttpSession httpsession) {
		MemberRequest loginMypage = (MemberRequest) httpsession.getAttribute("loginInfo");
		//인터페이스 구현, SQL문 실행
		mDao= template.getMapper(Member.class);
		
		return mDao.selectMemberByuemail(loginMypage.getUemail());
	} 

}
