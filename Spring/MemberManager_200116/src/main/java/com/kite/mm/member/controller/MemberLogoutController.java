package com.kite.mm.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kite.mm.member.domain.MemberRequest;

//MemberLogoutController: 로그아웃 페이지 보여지게 하는 컨트롤러 클래스 
@Controller
public class MemberLogoutController {
	
	//사용자가 페이지 번호를 눌렀을 때, 해당 페이지의 데이터가 보이게 하는 메서드
	@RequestMapping("/member/logout")
	public String logout(MemberRequest request, HttpSession httpsession) {
		
		String loginInfo = null;
		httpsession.setAttribute("loginInfo", loginInfo);
		
		return "member/logout";
	}
}
