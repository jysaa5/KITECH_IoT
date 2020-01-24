package com.kite.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.demo.domain.OpMember;

public interface MemberMapper {
	
	@Select("select * from opmember order by idx")
	public List<OpMember> getMemberList();

	//보내는 데이터의 파라미터를 넣는다.
	public OpMember selectMemberById(@RequestParam("uid") String uid);
	
	

}
