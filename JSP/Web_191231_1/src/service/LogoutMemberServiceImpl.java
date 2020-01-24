package service;

import javax.servlet.http.HttpServletRequest;

public class LogoutMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {

		// View 페이지
		String viewPage = "/WEB-INF/views/logout.jsp";

		request.getSession(false).invalidate(); // 연결정보를 끊어서 소멸시킨다.

		return viewPage;
	}

}
