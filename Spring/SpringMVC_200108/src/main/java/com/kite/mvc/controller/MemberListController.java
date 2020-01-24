package com.kite.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberListController {

	@RequestMapping("/member/list")
	public String list() { //리스트 객체 데이터를 전달

		return "member/list";
	}
	
	
	

	@RequestMapping("/member/search")
	public String search() { //리스트 객체 데이터를 전달

		return "member/search";
	}
	
	
	//list와 search에 공통으로 들어감. 공통적으로 사용됨. 각각 요청에 전달할 수 있다. 
	@ModelAttribute("searchOptions")
	public List<String> optionList(){
		
		List<String> options = new ArrayList<String>();
		
		//검색 조건을 변경하는 것은 여기서 하는 것이다. view는 출력한 하는 것. 
		options.add("ID");
		options.add("Name");
		options.add("ID + Name");
		
		return options;
	}
	
}
