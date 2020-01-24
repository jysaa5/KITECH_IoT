package service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import model.OpMember;

public class KakaoLoginMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		String viewPage = "/WEB-INF/views/kakaoLogin.jsp";

		// kakao api를 통해서 받은 데이터를 이용해서
		// OpMember 객체를 생성 -> Session 속성에 loginInfo이름으로 저장

		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		}

		String uname = request.getParameter("nickname");
		String uid = request.getParameter("email");
		String byear = request.getParameter("birthday");
		String gender = request.getParameter("gender");
		String uphoto = request.getParameter("photo");
		
		String result = "fail";
		
		OpMember member = new OpMember(0, uid, null, uname, Integer.parseInt(byear), gender, uphoto);
		
		//session
		request.getSession(false).setAttribute("loginInfo", member);
		
		result ="login";
		
		request.setAttribute("result", result);
		

		return viewPage;
	}

}
