package com.kite.mm.guest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.guest.domain.GuestListView;
import com.kite.mm.guest.service.GuestListService;

//GuestListController: 방명록 리스트를 페이지 번호에 따라서 보여지게 하는 컨트롤러 클래스 
@Controller
public class GuestListController {

	@Autowired
	GuestListService service;
	
	//사용자가 페이지 번호를 눌렀을 때, 해당 페이지의 데이터가 보이게 하는 메서드
	@RequestMapping("/guest/list")
	public String list(
			//모델에게 저장
			@RequestParam(value="page", defaultValue = "1") int page, Model model
			) {
		
		//페이지 번호를 받아서 처리
		GuestListView view = service.getListView(page); 
		
		System.out.println(view);
		
		//모델에게 전달해서 view에서 볼수 있도록 한다.
		model.addAttribute("listView",view);
		
		return "guest/list";
	}
}
