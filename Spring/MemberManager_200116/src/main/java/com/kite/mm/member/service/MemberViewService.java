package com.kite.mm.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.mm.member.dao.Member;
import com.kite.mm.member.domain.MemberRequest;

//MemberViewService: 회원 정보에서 idx와 일치하는 회원 정보를 가져다주는 서비스 클래스 (조회 기능)
@Service
public class MemberViewService {

	@Autowired
	private SqlSessionTemplate template;

	//인터페이스 
	private Member mDao;
	
	//getMember: 게시글 번호를 받으면 조회하여 찾아주는 메서드
	public MemberRequest getMember(int idx) {

		//인터페이스 구현, SQL문 실행
		mDao = template.getMapper(Member.class);
		
		return mDao.selectMemberByIdx(idx);
	}

}
