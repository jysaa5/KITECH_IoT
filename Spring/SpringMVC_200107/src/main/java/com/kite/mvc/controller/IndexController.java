package com.kite.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	// 사용자 요청 경로 지정: @RequestMapping
	// @RequestMapping(value="/index")
	@RequestMapping("/index")
	
	//저장해서 전달
	public ModelAndView index() { // ModelAndView 택배 개념: 택배랑 주소
		
		// ModelAndView
		// view의 정보, 결과 데이터
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/index"); // /WEB-INF/views/member/index.jsp 
		mav.addObject("msg", "Hello Spring MVC!!");
		
		return mav;
	}

}
