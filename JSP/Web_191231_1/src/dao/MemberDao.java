package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.OpMember;

public class MemberDao {

	// 회원 정보 저장 메서드
	// 데이터베이스 저장 처리 -> 처리 후 result = 1을 반환하기
	// DAO도 인터페이스를 만들고 사용함.
	public int insertMember(Connection conn, OpMember member) throws SQLException { // 호출한 곳으로 예외를 던짐.

		int result = 0;
		PreparedStatement pstmt = null;

		// 데이터 저장 SQL
		String sql = "insert into opmember values(member_idx_seq.nextval, ?, ?, ?, ?, ?, ?)";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getUid());
		pstmt.setString(2, member.getUname());
		pstmt.setString(3, member.getPw());
		pstmt.setString(4, member.getGender());
		pstmt.setInt(5, member.getByear());
		pstmt.setString(6, member.getUphoto());

		result = pstmt.executeUpdate(); // int 값을 반환한다.

		System.out.println("dao insert result:" + result);

		pstmt.close();

		return result;

	}// insertMember 메서드 끝

	// 회원 리스트
	public List<OpMember> getMemberList(Connection conn) throws SQLException {

		// 결과 데이터: list
		List<OpMember> list = new ArrayList<OpMember>();

		Statement stmt = null;
		ResultSet rs = null;

		stmt = conn.createStatement();

		// 회원 리스트 SQL
		String sql = "SELECT * FROM opmember ORDER BY idx";

		// 쿼리 실행 결과
		rs = stmt.executeQuery(sql);

		while (rs.next()) {

			// int idx = rs.getInt("idx");
			// String uname = rs.getString("uname");
			// String uid = rs.getString("uemail");
			// String pw = rs.getString("pw");
			// String gender=rs.getString("gender");
			// int byear = rs.getInt("byear");
			// String uphoto =rs.getString("uphoto");

			// 데이터를 객체에 저장 OpMember member = new OpMember (idx, uname, uid, pw,
			// byear,gender, uphoto);

			// 객체 list에 저장
			// list.add(member);
			list.add(makeOpMember(rs));

		}

		return list;
	}// getMembrList 메서드 끝

	// 행 한 개를 쫙 만들어주는 메서드
	private OpMember makeOpMember(ResultSet rs) throws SQLException {

		int idx = rs.getInt("idx");
		String uname = rs.getString("uname");
		String uid = rs.getString("uemail");
		String pw = rs.getString("upw");
		String gender = rs.getString("gender");
		int byear = rs.getInt("byear");
		String uphoto = rs.getString("uphoto");

		// 데이터를 객체에 저장
		OpMember member = new OpMember(idx, uid, pw, uname, byear, gender, uphoto);
		return member;

	}// makeOpMember 메서드 끝

	// idx로 회원정보 검색
	public OpMember selectByIdx(Connection conn, int idx) throws SQLException {

		OpMember member = null;

		PreparedStatement pstmt = null;
		ResultSet rs;

		String sql = "SELECT * FROM opmember WHERE idx = ? ";

		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);

		rs = pstmt.executeQuery();

		if (rs.next()) {

			member = makeOpMember(rs);
		}

		return member;

	}// selectByIdx 메서드 끝

	public int editMember(Connection conn, OpMember member) throws SQLException {

		int result = 0;
		PreparedStatement pstmt = null;

		String sql = "UPDATE opmember SET uname = ?, upw = ?, gender = ?, byear = ? WHERE idx = ?";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getUname());
		pstmt.setString(2, member.getPw());
		pstmt.setString(3, member.getGender());
		pstmt.setInt(4, member.getByear());
		pstmt.setInt(5, member.getIdx());

		result = pstmt.executeUpdate();

		return result;
	}// editMember 메서드 끝

	public int deleteMemberByIdx(Connection conn, int idx) throws SQLException {

		int result = 0;

		PreparedStatement pstmt = null;
		String sql = "DELETE FROM opmember WHERE idx = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);

		result = pstmt.executeUpdate();

		return result;

	}// deleteMemberByIdx 메서드 끝

	public boolean selectCheckId(Connection conn, String uid) throws SQLException {

		boolean result = true;

		String sql = "SELECT * FROM opmember WHERE uemail = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, uid);
		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) { // 행이 있다는 것은 기존에 아이디가 있다는 것이다.
			result = false;
		}

		pstmt.close();
		return result;
	}

	// 로그인하는 메서드
	// 아이디와 비밀번호가 데이터베이스에서 일치하는 게 있는지 찾는 것.
	// 둘 다 찾으면 row=0이다.
	public OpMember selectByUserIdPw(Connection conn, String uid, String pw) throws SQLException {

		OpMember member = null;
		PreparedStatement pstmt = null;

		String sql = "select * from opmember where uemail=? and upw=?";

		System.out.println(uid + ":" + pw);
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, uid);
		pstmt.setString(2, pw);

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			member = makeOpMember(rs);
		}

		pstmt.close();
		return member;
	}

}
