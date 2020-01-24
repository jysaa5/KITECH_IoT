package service;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import dao.MemberDao;
import jdbc.ConnectionProvider;
import model.OpMember;

public class EditMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {
		String viewPage = "/WEB-INF/views/edit.jsp";
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
		
			e.printStackTrace();
		}
		
		// 데이터 받기
		String idx = request.getParameter("idx");
		String uid = request.getParameter("uid");
		String pw = request.getParameter("pw");
		String uname = request.getParameter("uname");
		String byear = request.getParameter("byear");
		String gender = request.getParameter("gender");
		String uphoto = request.getParameter("pfile");

		OpMember member = new OpMember(Integer.parseInt(idx), uid, pw, uname, Integer.parseInt(byear), gender, uphoto);

		System.out.println("insert Data: "+member);
		
		Connection conn = null;
		int result = 0; //처리 횟수 

		MemberDao dao = new MemberDao();
		
		try {
			conn = ConnectionProvider.getConnection();
			result = dao.editMember(conn, member);
			
			
		} catch (SQLException se) {
			result = -1; //예외 발생을 알려주기 위한 것. 예외처리는 한 곳에서 해주는게 좋다.
			se.printStackTrace(); //오류가 발생한 시작점을 출력해주기 위한 것이다. 

		}
		
		request.setAttribute("resultCode", result);

		return viewPage;
	}

}
