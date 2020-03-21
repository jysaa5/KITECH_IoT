package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserCctvLogController: cctv 로그 화면 보여주는 컨트롤러
@Controller
@RequestMapping("/cctv/userCctvLog")
public class UserCctvLogController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String userCctvLogView() {
	
		return "cctv/userCctvLog";
		
	}//userCctvLogView 메서드 끝

	
}//UserCctvLogController 클래스 끝
