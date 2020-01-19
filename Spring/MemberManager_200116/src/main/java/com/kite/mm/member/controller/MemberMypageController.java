package com.kite.mm.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.mm.member.domain.MemberRequest;
import com.kite.mm.member.service.MemberMypageService;

//MemberMypageController: 마이페이지 페이지 보여지게 하는 컨트롤러 클래스 
@Controller
@RequestMapping("/member/mypage")
public class MemberMypageController {

	@Autowired
	MemberMypageService servcie;

	@RequestMapping(method = RequestMethod.GET)
	public String mypageForm(MemberRequest request, Model model, HttpSession httpsession) {
		
		System.out.println(servcie.selectMypage(request, httpsession));
		model.addAttribute("mypage", servcie.selectMypage(request, httpsession));
		
	
	
		return "member/mypage";
	}

}
