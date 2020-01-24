package com.kite.op.service;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kite.op.dao.MemberDao;
import com.kite.op.domain.OpMember;
import com.kite.op.jdbc.ConnectionProvider;

@Service
public class ListMemberServiceImpl implements MemberService {
	
	@Autowired //의존 주입해준다. 
	MemberDao dao; 
	
	public List<OpMember> getMemberList() {
		

		
		List<OpMember> members = null;  //이 리스트는 DAO가 필요함.
		
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			members = dao.getMemberList(conn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

}
