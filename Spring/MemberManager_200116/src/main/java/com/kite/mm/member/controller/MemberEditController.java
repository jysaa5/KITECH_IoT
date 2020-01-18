package com.kite.mm.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kite.mm.guest.domain.WriteRequest;
import com.kite.mm.guest.service.GuestEditService;
import com.kite.mm.guest.service.GuestViewService;
import com.kite.mm.member.domain.MemberRequest;
import com.kite.mm.member.service.MemberEditService;
import com.kite.mm.member.service.MemberViewService;

//MemberEditController: 회원 정보를 수정하도록 해당 회원 정보를 가져오고 수정된 데이터를 전송하는 컨트롤러 클래스.
@Controller
@RequestMapping("/member/edit")
public class MemberEditController {

	@Autowired
	MemberViewService viewService;
	
	@Autowired
	MemberEditService editService;

	
	//editMemberForm 메서드: 수정하려는 회원정보를 찾아서 해당 페이지를 보여주는 메서드
	@RequestMapping(method = RequestMethod.GET)
	public String editMemberForm(@RequestParam(value = "idx", defaultValue = "-1") int idx, Model model) {

		model.addAttribute("member", viewService.getMember(idx));

		return "member/editForm";
	}

	//editMember 메서드: 수정된 회원정보를 보내고 수정된 상태의 페이지를 보여주는 메서드
	@RequestMapping(method = RequestMethod.POST)
	public String editMember(MemberRequest request, Model model) {

		model.addAttribute("mResult", editService.editMember(request));
		
		return "member/edit";
	}

}
