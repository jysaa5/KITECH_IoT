package com.kite.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.jdbc.service.MemberDeleteService;

@Controller
public class MemberDelController {

	@Autowired
	MemberDeleteService delService;
	
	
	//해당하는 id로 조건검색해서 회원정보 삭제, 회원정보가 없으면 -1로 기본값을 했음. 왜냐하면 NullpointException이 뜨지 않도록 하기 위해서.
	@RequestMapping("/member/delete")
	public String deleteMember(@RequestParam(value = "id", defaultValue = "-1") int id, Model model) {

		model.addAttribute("result", delService.deleteMember(id));
		return "member/delete";
	}

}
