package com.kite.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*view?uid=cool*/
/*view/cool 또는 view/hot으로 처리하기.*/

@Controller
public class MemberViewController {

	// view/cool -> cool을 변수로 사용.
	@RequestMapping("/member/view/{uid}") // 경로 정의
	public String memberInfo(@PathVariable("uid") String uid, Model model) {

		System.out.println(uid);

		model.addAttribute("userInfo", uid+"님 안녕하세요.");
		return "member/view";
	}

}
