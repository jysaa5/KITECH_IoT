package com.iot.smarthome.styler.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.smarthome.styler.domain.StylerWriteRequestVo;
import com.iot.smarthome.styler.service.StylerWriteService;


//BoardWriteController: 게임 추천 게시글을 입력할 때 입력 폼을 보여주고 입력된 데이터를 보내는 컨트롤러
@Controller
@RequestMapping("/styler/write")
public class StylerWriteController {
	
	//객체 주입
	@Autowired
	StylerWriteService writeService;

	//writeForm 메서드: 게시글 작성 폼을 보여주는 메서드
	//get방식으로 들어왔을 때 처리
//	@RequestMapping(method = RequestMethod.GET)
//	public String wrtieForm() {
//	
//		return "styler/userStyler";
//		
//	}//wrtieForm 메서드 끝
	
	
	
	//write 메서드: 작성한 게임 추천 글을 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	//커맨드형식 
	@RequestMapping(method = RequestMethod.POST)
	public String write(StylerWriteRequestVo write, HttpServletRequest request, Model model) {
		
		System.out.println(write);
		//System.out.println("요청 idx: " + write.getIdx() );
		
		int result = writeService.writePhoto(request, write);
		
		System.out.println("결과: " + result );
		//System.out.println("결과 idx: " + write.getIdx());
		model.addAttribute("rCnt",  result);
		
		return "styler/write";
	
	}//write 메서드 끝
	
}//BoardWriteController 클래스 끝
