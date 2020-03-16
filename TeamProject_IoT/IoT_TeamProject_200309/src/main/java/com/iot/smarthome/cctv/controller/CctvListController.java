package com.iot.smarthome.cctv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.cctv.domain.CctvListViewVo;
import com.iot.smarthome.cctv.service.CctvListService;


//BoardListController: 게시글 리스트를 페이지 번호에 따라서 보여지게 하는 컨트롤러
@Controller
public class CctvListController {

	//객체 주입
	@Autowired
	CctvListService listService;
	
	//list 메서드: 사용자가 페이지 번호를 눌렀을 때, 해당 페이지의 데이터가 보이게 하는 메서드
	@RequestMapping("/cctv/userList")
	public String list(
			//모델에게 저장
			@RequestParam(value="page", defaultValue = "1") int page, Model model
			) {
		
		//페이지 번호를 받아서 처리
		CctvListViewVo view = listService.getListView(page); 
		
		System.out.println(view);
		
		//모델에게 전달해서 view에서 볼수 있도록 한다.
		model.addAttribute("cctvListView",view);
		
		return "cctv/userList";
		
	}//list 메서드 끝
	
}//BoardListController 클래스 끝
