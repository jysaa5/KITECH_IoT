package com.iot.smarthome.styler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.styler.service.StylerDetailViewService;



//BoardDetailViewController: 게시글 리스트를 페이지 번호에 따라서 보여지게 하는 컨트롤러
@Controller
public class StylerDetailViewController {

	//객체 주입
	@Autowired
	StylerDetailViewService detailViewService;
	
	//list 메서드: 사용자가 페이지 번호를 눌렀을 때, 해당 페이지의 데이터가 보이게 하는 메서드
	@RequestMapping("/styler/detailView")
	public String detailPostingView(@RequestParam(value = "stylerIdx", defaultValue = "-1") int stylerIdx, Model model) {
		
		model.addAttribute("stylerDetailView", detailViewService.getDetailPostingidx(stylerIdx));
		
		return "styler/detailView";
		
	}//detailPostingView 메서드 끝
	
}//BoardDetailViewController 클래스 끝
