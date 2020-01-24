package com.kite.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.jdbc.domain.Member;
import com.kite.jdbc.service.MemberListService;

//dlapdlf와 이름으로 동적으로 검색하도록 하는 클래스 
@Controller
public class SearchListController {

	//객체 주입
	@Autowired
	MemberListService listService;
	
	@RequestMapping("/member/searchList")
	public String searchList(@RequestParam(value = "stype", required = false) String stype, @RequestParam(value="keyword", required = false) String keyword, Model model) {

		//trim: 문자의 왼쪽, 오른쪽 공백 제거
		if(stype != null && keyword != null && stype.trim().length()>0 && keyword.trim().length()>0) {
			
			List<Member> list = listService.searchList(stype, keyword);
			model.addAttribute("list",list);
		}
		
		return "member/searchList";
	}

}
