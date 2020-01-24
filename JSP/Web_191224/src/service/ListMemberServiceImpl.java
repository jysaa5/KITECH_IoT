package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import dao.MemberDao;
import jdbc.ConnectionProvider;
import model.OpMember;

public class ListMemberServiceImpl implements MemberService {

	@Override
	public String process(HttpServletRequest request) {

		String viewPage = "/WEB-INF/views/member_list.jsp";

		// 결과 데이터
		List<OpMember> list = null;

		MemberDao dao = new MemberDao();

		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnection();
			list = dao.getMemberList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		request.setAttribute("memberList", list); // memberList라는 이름으로 저장함.

		for (OpMember opMember : list) {

			System.out.println(opMember);
		}

		return viewPage;
	}

}
