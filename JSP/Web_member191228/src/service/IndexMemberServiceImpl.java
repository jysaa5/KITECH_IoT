package service;

import javax.servlet.http.HttpServletRequest;

//MemberService 인터페이스 구현
public class IndexMemberServiceImpl implements MemberService {

	//MemberService 인터페이스의 process메서드 오버라이딩.
	//request: JSP 내장객체
	@Override
	public String process(HttpServletRequest request) {

		//view 페이지
		String viewPage = "/WEB-INF/views/index.jsp";
		
		String msg = "환경합니다.";
		
		//
		request.setAttribute("msg", msg);
		
		return viewPage;
	}

}
