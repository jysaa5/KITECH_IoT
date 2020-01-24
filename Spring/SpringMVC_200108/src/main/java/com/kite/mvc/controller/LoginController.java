package com.kite.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mvc.service.RequestLogin;

@Controller
//@RequestMapping("/login/login") 이것을 아예없에고 각각 value 값을 줄수 있다.
@RequestMapping("/login/login") // 경로로 요청.
public class LoginController {

	// @RequestMapping(value="/login/login", method=RequestMethod.GET)
	@RequestMapping(method = RequestMethod.GET)
	public String loginForm() {
		/* return "/WEB-INF/views/login/login.jsp"; */
		return "login/loginForm";
	}
	
	//login(request, request.getParameter("uid"))으로 호출
	// @RequestMapping(value="/login/login", method=RequestMethod.POST)
	@RequestMapping(method = RequestMethod.POST)
	public String login(HttpServletRequest request, @RequestParam(value = "uid", defaultValue = "scott") String id,
			@RequestParam(value = "pw", required = false) String pw, @ModelAttribute("login") RequestLogin login // 커맨드 객체로 매개변수를 받음. 클래스 이름을 login으로 바꿈
	) {

		System.out.println(request.getParameter("uid"));
		System.out.println(request.getParameter("pw"));
		System.out.println(id);
		System.out.println(pw);
		System.out.println(login);

		return "login/login";
	}

}
