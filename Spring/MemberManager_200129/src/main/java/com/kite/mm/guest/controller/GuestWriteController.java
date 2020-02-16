package com.kite.mm.guest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kite.mm.guest.domain.WriteRequest;
import com.kite.mm.guest.service.GuestWriteService;

//GuestWriteController: 방명록을 입력할 때 입력 폼을 보여주고 입력된 데이터를 보내는 컨트롤러 클래스
@Controller
@RequestMapping("/guest/write")
public class GuestWriteController {
	
	@Autowired
	GuestWriteService service;

	//writeForm 메서드: 방명록 폼을 보여주는 메서드
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String wrtieForm() {
	
		return "guest/writeForm";
	}
	
	//write 메서드: 작성한 방명록을 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	//커맨드형식 
	@RequestMapping(method = RequestMethod.POST)
	public String write(WriteRequest request) {
		
		System.out.println(request);
		System.out.println("요청 idx: " + request.getIdx() );
		
		int result = service.write(request);
		
		System.out.println("결과: " + result );
		System.out.println("결과 idx: " + request.getIdx());
		
		return "guest/write";
	}
	
}//GusetWriteController 컨트롤러 클래스 끝
