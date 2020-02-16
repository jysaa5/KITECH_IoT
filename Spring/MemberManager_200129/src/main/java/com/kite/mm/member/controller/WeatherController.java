package com.kite.mm.member.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {
	
	@CrossOrigin //다른 서버에서 비동기 통신을 해도 문제가 발생하지 않는다. 
	@RequestMapping("/weather")
	public String getInfo(Model model) throws UnsupportedEncodingException {
		//통신을해줘야됨. 통신된 결과를 모델에 담음.
		
		RestTemplate restTemplate = new RestTemplate();
		
		String serviceKey = "E8ZjiDP5QBA9z4FPo%2FMEMbbt6SpDm2vsZDiKBqyYWEorfqjJ2MhW9ZbiX6JZRGCnlMDSyKPW5uQuaxPURITsKA%3D%3D";
		
		String dcodeKey = URLDecoder.decode(serviceKey, "utf-8");
		
		String url = "http://apis.data.go.kr/1360000/VilageFcstInfoService/getVilageFcst"
				+ "?serviceKey="+dcodeKey
				+ "&numOfRows=10"
				+ "&pageNo=1"
				+ "&base_date=20200129"
				+ "&base_time=0200"
				+ "&nx=61"
				+ "&ny=125";
		
		
		String result = restTemplate.getForObject(url, String.class);
		
		model.addAttribute("result", result);
		
		return "weather";
		
	}

}
