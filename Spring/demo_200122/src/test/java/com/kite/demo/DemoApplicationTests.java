package com.kite.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

//sql의 datasource를 import해야됨.
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kite.demo.domain.OpMember;
import com.kite.demo.mapper.MemberMapper;



@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private DataSource datasource;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testConntection() throws SQLException {
		System.out.println(datasource);
		Connection conn = datasource.getConnection(); //예외처리 필요함.
		System.out.println(conn);
		conn.close();
	}
	
	//mybatis가 만들어지면 sqlsessionfatory를 가져올수 있다.
	@Autowired
	private SqlSessionFactory sqlsessionFactory;
	
	@Test
	public void testSqlsessionFactory() {
		System.out.println(sqlsessionFactory);
	}
	
	@Autowired
	private MemberMapper mapper; 
	
	@Test
	public void testSelectList() {
		
		List<OpMember> members = mapper.getMemberList();
		for (OpMember opMember : members) {
			System.out.println(opMember);
		}
	}

	
	@Test
	public  void testSelectMemberByID() {
		OpMember om = mapper.selectMemberById("11@11");
		System.out.println("검색 결과: "+ om);
	}
	
}
