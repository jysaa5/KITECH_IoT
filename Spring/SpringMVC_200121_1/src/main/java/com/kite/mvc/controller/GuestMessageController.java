package com.kite.mvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kite.mvc.domain.GuestMessage;
import com.kite.mvc.domain.GuestMessage2;
import com.kite.mvc.domain.GuestMessageList;
import com.kite.mvc.domain.GuestMessageList2;

@Controller
public class GuestMessageController {

	//사용자에게는 xml 파일로 보여짐.
	//사용자가 하는 요청.
	@RequestMapping("/guestmessage/list.xml")
	@ResponseBody
	public GuestMessageList listXml() {
		
		return getMessageList();
	}

	
	//응답 받는 것의 형식: 일반 객체
	@RequestMapping("/guestmessage/list.json")
	@ResponseBody
	public GuestMessageList2 listJson() {
		
		return getMessageList2();
	}
	
	
	private GuestMessageList getMessageList() {
		
		List<GuestMessage> message = new ArrayList<GuestMessage>(); 
		
		message.add(new GuestMessage(1,"메시지1", new Date()));
		message.add(new GuestMessage(2,"메시지2", new Date()));
		message.add(new GuestMessage(3,"메시지3", new Date()));
		
		return new GuestMessageList(message);
	}
	
	
	
	private GuestMessageList2 getMessageList2() {
		
		List<GuestMessage2> message = new ArrayList<GuestMessage2>(); 
		
		message.add(new GuestMessage2(1,"메시지1", new Date()));
		message.add(new GuestMessage2(2,"메시지2", new Date()));
		message.add(new GuestMessage2(3,"메시지3", new Date()));
		
		return new GuestMessageList2(message);
	}
	
}
