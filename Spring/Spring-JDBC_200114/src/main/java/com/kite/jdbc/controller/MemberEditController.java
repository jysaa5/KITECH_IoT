package com.kite.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.jdbc.domain.Member;
import com.kite.jdbc.domain.RequestMemberReg;
import com.kite.jdbc.service.MemberEditService;
import com.kite.jdbc.service.MemberViewService;

@Controller
@RequestMapping("/member/edit")
public class MemberEditController {
	
	@Autowired
	MemberViewService viewService;
	
	@Autowired
	MemberEditService editService;
	

	@RequestMapping(method = RequestMethod.GET)
	public String editForm( @RequestParam(value="id", defaultValue ="-1") int id, Model model) {
	
		Member member = viewService.getMembers(id);
		
		model.addAttribute("memberInfo", member);
		
		return "member/editForm";
	}
	
	//Member가 가지고 있는 id를 가져와야 하므로 RequestMemberReg가 아닌 Member에서 가져와야 됨. 
	@RequestMapping(method = RequestMethod.POST)
	public String edit(Member member, Model model) {
		
		model.addAttribute("result", editService.editMember(member));
		
		return "member/edit";
	}
	
	
}
