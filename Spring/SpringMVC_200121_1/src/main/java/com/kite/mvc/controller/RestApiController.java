package com.kite.mvc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kite.mvc.domain.MemberVo;

@RestController
public class RestApiController {

	
	@CrossOrigin //다른 곳에서 비동기 통신을 허용
	@PostMapping("/api/members")	//일반 문자열 반환됨.
	public String insertMember(@RequestBody MemberVo member) {

		return member.toString();
	}

}
