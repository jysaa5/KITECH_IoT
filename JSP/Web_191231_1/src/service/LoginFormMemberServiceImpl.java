package service;

import javax.servlet.http.HttpServletRequest;

public class LoginFormMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {

		String viewPage = "/WEB-INF/views/loginForm.jsp";

		String refererPage = request.getHeader("referer");

		System.out.println("referer : " + refererPage);

		request.setAttribute("referer", refererPage);

		return viewPage;
	}

}
