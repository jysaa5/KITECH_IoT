package com.kite.mm.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.guest.dao.GuestDao;
import com.kite.mm.guest.domain.WriteRequest;
import com.kite.mm.member.dao.Member;
import com.kite.mm.member.domain.MemberRequest;

//MemberEditService: 회원정보를 수정하는 sql문을 실행하는 서비스 클래스 (회원 정보 수정 기능)
@Service
public class MemberEditService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	//인터페이스 
	private Member mDao; 
	
	//editArticle: 작성되어진 방명록 데이터를 받아서 수정하기 위해 idx를 반환하는 메서드
	public int editMember(MemberRequest request) {
		
		//인터페이스 구현, SQL문 실행
		mDao= template.getMapper(Member.class);
		
		return mDao.editMember(request);
	} 

}
