package com.kite.gz.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.gz.board.domain.BoardPasswordVo;
import com.kite.gz.board.service.BoardPwCheckService;


//BoardPasswordCheckController
@Controller
@RequestMapping("/board/passwordCheck")
public class BoardPasswordCheckController {
	
	@Autowired
	BoardPwCheckService pwCheckService;
	

	//pwCheckForm 메서드
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String pwCheckForm(@RequestParam(value = "idx", defaultValue = "-1") int idx, Model model) {
	
		model.addAttribute("Checkidx", pwCheckService.getBoardPost(idx));
		
		return "board/passwordCheckForm";
	}
	
	//pwCheck 메서드: 
	//커맨드형식 
	@RequestMapping(method = RequestMethod.POST)
	public String pwCheck(BoardPasswordVo request, Model model) {
		
		int result = pwCheckService.passwordCheck(request);

		if(result !=2 ) {
			
			System.out.println("비밀번호가 정확하지 않습니다.");
			
			return "board/passwordCheckForm";
		}
		
		model.addAttribute("pwCheck", request);
		
		return "board/passwordCheck";
	}
	
}//BoardWriteController 컨트롤러 클래스 끝
