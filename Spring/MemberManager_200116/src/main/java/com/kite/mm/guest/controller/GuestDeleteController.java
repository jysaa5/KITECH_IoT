package com.kite.mm.guest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.guest.domain.GuestListView;
import com.kite.mm.guest.service.GuestDeleteService;
import com.kite.mm.guest.service.GuestListService;

//GuestDeleteController: 방명록 게시물 삭제하는 컨트롤러 클래스
@Controller
public class GuestDeleteController {

	@Autowired
	GuestDeleteService delservice;
	
	//delete 메서드: idx 값을 받아서 게시글을 삭제하는 메서드
	@RequestMapping("/guest/delete")
	public String delete( @RequestParam(value="idx", defaultValue = "-1") int idx, Model model) {
		
		model.addAttribute("result", delservice.deleteArticle(idx));
		
		System.out.println(idx);
		
		return "guest/delete";
	}
}
