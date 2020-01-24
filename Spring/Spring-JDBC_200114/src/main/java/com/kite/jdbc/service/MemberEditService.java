package com.kite.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.jdbc.dao.MemberMybatisDao;
import com.kite.jdbc.domain.Member;

//서비스로 어노테이션을 해줘야 bean으로 자동 등록됨.
@Service
public class MemberEditService {
	

	@Autowired
	MemberMybatisDao mDao;
	
	//member 객체를 DAO쪽으로 전달해서 id값을 받아야 됨.
	
	public int editMember(Member member) {
		
		return mDao.editMember(member);
	}

}//MemberEditService 클래스 끝
