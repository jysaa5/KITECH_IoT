package com.kite.jdbc.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.jdbc.dao.MemberDao;
import com.kite.jdbc.dao.MemberDaoInterface;
import com.kite.jdbc.dao.MemberMybatisDao;
import com.kite.jdbc.domain.RequestMemberReg;

@Service
public class MemberRegService {

	@Autowired	
	MemberDao dao;
	
	@Autowired
	MemberMybatisDao mDao;
	
	@Autowired
	SqlSessionTemplate template;
	
	
	MemberDaoInterface iDao;
	
	
	public int regMember(RequestMemberReg request) {
		return dao.insertMember(request);
		//return dao.insert(request);
	}
	

	public Object registMember(RequestMemberReg request) {
		
		iDao = template.getMapper(MemberDaoInterface.class);
		return iDao.insertMember(request);
		
		//return mDao.insertMember(request);
	}
	
}
