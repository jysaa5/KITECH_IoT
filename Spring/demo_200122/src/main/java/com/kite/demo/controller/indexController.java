package com.kite.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kite.demo.domain.OpMember;
import com.kite.demo.mapper.MemberMapper;

@Controller
public class indexController {
	
	@Autowired
	private MemberMapper mapper;
	

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("msg","spring Boot!!");
		return "index";
	}
	
	
	@GetMapping("/members/list.json")
	@ResponseBody //json 객체로 변해서 반환된다. 
	public List<OpMember> getMembers(){
		
		
		return mapper.getMemberList();
		
	}
	
	
	
}
