package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserWeatherLogController: 사용자가 날씨 로그 버튼을 눌렀을 때, 사용되는 컨트롤러
@Controller
@RequestMapping("/weather/userHumLog")
public class UserHumLogController {
	
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String userWeatherLogView() {
	
		return "weather/userHumLog";
		
	}//userWeatherLogView 메서드 끝

}//UserWeatherLogController 클래스 끝
