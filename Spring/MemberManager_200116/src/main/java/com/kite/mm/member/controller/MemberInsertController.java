package com.kite.mm.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.mm.member.domain.MemberRequest;
import com.kite.mm.member.service.MemberInsertService;

//MemberInsertController: 회원 가입 데이터를 보내는 컨트롤러 클래스
@Controller
@RequestMapping("/member/insert")
public class MemberInsertController {

	@Autowired
	MemberInsertService service;

	// insertForm 메서드: 회원가입 폼을 보여주는 메서드
	// get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String insertForm() {

		return "member/insertForm";
	}

	// insert 메서드: 작성한 회원가입 폼을 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	// 커맨드형식
	@RequestMapping(method = RequestMethod.POST)
	public String insert(MemberRequest request) {

		System.out.println(request);
		System.out.println("요청 idx: " + request.getIdx());

		int result = service.insert(request);

		System.out.println("결과: " + result);
		System.out.println("결과 idx: " + request.getIdx());
		
		if(result == -1) {
			return "member/invalid";
		}
		

		return "member/insert";
	}

}// MemberInsertController 컨트롤러 클래스 끝
