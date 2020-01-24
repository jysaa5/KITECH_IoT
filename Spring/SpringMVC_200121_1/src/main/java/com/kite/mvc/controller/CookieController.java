package com.kite.mvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {

	// 쿠키생성
	@RequestMapping("/cookie/make")
	public String makeCookie(HttpServletResponse response, Model model) {

		Cookie c = new Cookie("uid", "cool"); // 쿠키는 default 생성자가 없다.
		response.addCookie(c); // 쿠키 객체 전달

		model.addAttribute("cookieInfo", c); // 전달이 어떻게 되는지 보기 위한 것.

		return "cookie/make";
	}

	// 쿠키확인
	@RequestMapping("/cookie/view")
	public String viewCookie(// 쿠키는 짧은 문자열을 저장함.
			@CookieValue(value = "uid", required = false, defaultValue = "N") String uid, Model model) { //null 받는 것보다 낫다. 

		System.out.println("cookie(uid):" + uid);

		model.addAttribute("cUid", "cookie(uid):" + uid);
		
		return "cookie/view";
	}

}
