package com.kite.mm.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.guest.domain.GuestListView;
import com.kite.mm.guest.service.GuestListService;
import com.kite.mm.member.domain.MemberListView;
import com.kite.mm.member.service.MemberListService;

//MemberListController: 멤버 리스트를 페이지 번호에 따라서 보여지게 하는 컨트롤러 클래스 
@Controller
public class MemberListController {

	@Autowired
	MemberListService service;
	
	//사용자가 페이지 번호를 눌렀을 때, 해당 페이지의 데이터가 보이게 하는 메서드
	@RequestMapping("/member/list")
	public String mList(
			//모델에게 저장
			@RequestParam(value="page", defaultValue = "1") int page, Model model
			) {
		
		//페이지 번호를 받아서 처리
		MemberListView mView = service.getMemberListView(page); 
		
		System.out.println(mView);
		
		//모델에게 전달해서 view에서 볼수 있도록 한다.
		model.addAttribute("mListView",mView);
		
		return "member/list";
	}
}
