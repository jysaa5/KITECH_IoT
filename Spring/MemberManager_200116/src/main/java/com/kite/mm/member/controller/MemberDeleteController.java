package com.kite.mm.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.guest.domain.GuestListView;
import com.kite.mm.guest.service.GuestDeleteService;
import com.kite.mm.guest.service.GuestListService;
import com.kite.mm.member.service.MemberDeleteService;

//MemberDeleteController: 회원정보를 삭제하는 컨트롤러 클래스
@Controller
public class MemberDeleteController {

	@Autowired
	MemberDeleteService delservice;
	
	//memberDelete 메서드: idx 값을 받아서 회원정보를 삭제하는 메서드
	@RequestMapping("/member/delete")
	public String memberDelete( @RequestParam(value="idx", defaultValue = "-1") int idx, Model model) {
		
		model.addAttribute("result", delservice.deleteMember(idx));
		
		System.out.println(idx);
		
		return "member/delete";
	}
}
