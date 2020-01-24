package com.kite.op.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kite.op.domain.OpMember;
import com.kite.op.service.ListMemberServiceImpl;

@Controller
public class MemberListController {

	@Autowired // 이걸쓰려면 ListMemberServiceImpl가 빈즈로 등록되어 있어야됨.
	ListMemberServiceImpl service; // 의존 주입

	@RequestMapping("/member/list")
	public String getMemberList(Model model) {

		List<OpMember> members = service.getMemberList(); // 리스트간 필요한 것임.

		model.addAttribute("memberList", members);

		return "member/list";
	}
}
