package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserStylerLogController: 사용자가 styler 로그 버튼을 눌렀을 때, 페이지를 이동시켜주는 컨트롤러
@Controller
@RequestMapping("/styler/userStylerLog")
public class UserStylerLogController {
	
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String userStylerLogView() {
	
		return "styler/userStylerLog";
		
	}//wrtieForm 메서드 끝
	
}//UserStylerLogController 클래스 끝
