package service;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import dao.MemberDao;

import jdbc.ConnectionProvider;

import model.OpMember;

public class RegAjaxMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {

		// 사용자 요청 데이터를 받는다.
		// DAO에 저장 요청 -> DAO 클래스 생성, 기능 메서드 생성
		// Connection 객체를 생성해서 메서드에 전달
		// DAO의 응답은 처리 횟수: 결과 데이터 -> view 전달 request에 저장
		// view 응답 데이터를 받아서 처리.

		String viewPage = "/WEB-INF/views/memberRegAjax.jsp";

		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		}

		// 데이터 받기
		String uid = request.getParameter("uid");
		String uname = request.getParameter("uname");
		String pw = request.getParameter("pw");
		String byear = request.getParameter("byear");
		String gender = request.getParameter("gender");
		String uphoto = request.getParameter("pfile");

		OpMember member = new OpMember(0, uid, pw, uname, Integer.parseInt(byear), gender, uphoto);

		System.out.println("insert Data: " + member);

		Connection conn = null;
		int resultCnt = 0; // 처리 횟수

		MemberDao dao = new MemberDao();

		try {
			conn = ConnectionProvider.getConnection();
			resultCnt = dao.insertMember(conn, member);

		} catch (SQLException se) {
			resultCnt = -1; // 예외 발생을 알려주기 위한 것. 예외처리는 한 곳에서 해주는게 좋다.
			se.printStackTrace(); // 오류가 발생한 시작점을 출력해주기 위한 것이다.

		}

		String result = "success";
		if (resultCnt < 1) {
			result = "fail";
		}

		request.setAttribute("result", result);

		return viewPage;
	}

}
