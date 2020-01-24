package com.kite.mm.guest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.guest.domain.WriteRequest;
import com.kite.mm.guest.service.GuestEditService;
import com.kite.mm.guest.service.GuestViewService;

//GuestEditController: 방명록(게시글)를 수정하도록 해당 방명록(게시글)을 가져오고 수정된 데이터를 전송하는 컨트롤러 클래스.
@Controller
@RequestMapping("/guest/edit")
public class GuestEditController {

	@Autowired
	GuestViewService viewService;
	
	@Autowired
	GuestEditService editService;

	
	//editForm 메서드: 수정하려는 방명록(게시글)을 찾아서 해당 페이지를 보여주는 메서드
	@RequestMapping(method = RequestMethod.GET)
	public String editForm(@RequestParam(value = "idx", defaultValue = "-1") int idx, Model model) {

		model.addAttribute("article", viewService.getArticle(idx));

		return "guest/editForm";
	}

	//edit 메서드: 수정된 방명록(게시글)을 보내고 수정된 상태의 페이지를 보여주는 메서드
	@RequestMapping(method = RequestMethod.POST)
	public String edit(WriteRequest request, Model model) {

		model.addAttribute("result", editService.editArticle(request));
		
		return "guest/edit";
	}

}
