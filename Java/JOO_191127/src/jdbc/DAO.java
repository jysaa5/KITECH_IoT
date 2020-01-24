package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Data Access Object : 데이터베이스의 데이터 조작을 위한 클래스 
//싱글톤 패턴: 인스턴스 생성을 제한한다. -> 기능클래스는 인스턴스 생성을 1번만 하도록 제한함. 
// 1. 생성자 호출을 막아서 인스턴스 생성을 막는다. 
// private 
//2. 사용할 인스턴스 생성 
//3. 외부 참조용 메서드: 인스턴스를 반환해주는 메서드
public class DAO {

	// 싱글톤 패턴-------------------
	private DAO() {

	}

	private static DAO dao = new DAO(); // 생성자를 private으로 했으므로 static을 붙이고 외부에서 DAO.dao = null(직접참조 안되게) 되지 않도록 private
										// 붙이기;

	public static DAO getInstance() {
		return dao;
	}
	// 싱글톤 패턴-------------------

	// 부서정보 리스트 출력
	public void listDept(Connection conn) throws SQLException {

		Statement stmt = conn.createStatement();
		String sql1 = "select * from dept"; // 문자열안에 ; 세미클론 안 붙임.
		ResultSet rs = stmt.executeQuery(sql1);

		System.out.println("부서(DEPT) 리스트");
		System.out.println("-------------------------------------------");

		while (rs.next()) {
			// int deptno = rs.getInt("deptno");
			// String dname = rs.getString("dname");
			// String loc = rs.getString("loc");

			int deptno = rs.getInt(1); // 컬럼의 순서는 테이블을 만들때 순서임. -> DESC dept 해서 보고 하면 됨.
			String dname = rs.getString(2);
			String loc = rs.getString(3);

			System.out.println(deptno + "|" + dname + "|" + loc);

		}
		System.out.println("-------------------------------------------");
		rs.close();
		stmt.close();
	}

	// DB 부서정보 입력
	public void insertDept(Connection conn, int deptno, String dname, String loc) throws SQLException {
		// 메소드에 커넥션을 받음.
		// SQL
		String sql = "insert into dept (deptno, dname, loc) values (?,?,?)";

		// PreparedStatement
		PreparedStatement pstmt = conn.prepareStatement(sql);

		// Mapping
		pstmt.setInt(1, deptno); // ? 물음표 1부터 시작함 //무결성 제약 조건에 걸림. -> 기본키라서
		pstmt.setString(2, dname);
		pstmt.setString(3, loc);

		// executeUpdate
		int rCnt = pstmt.executeUpdate(); // preparedStatement는 Statement를 상속하고 있다. // 실행횟수가 0보다 크면 성공, 아니면 실패 ->int 반환
		// 예외 발생함.

		if (rCnt > 0) {
			System.out.println("데이터 입력이 정상 처리되었습니다.");
		} else {
			System.out.println("입력이 되지 않았습니다, 관리자에게 문의하세요.");
		}

		// pstmt.close
		pstmt.close();

	}

	// 부서정보 수정
	// 부서이름, 부서위치, 부서 선택의 조건 부서번호 (PK)로 한다.
	public void editDept(Connection conn, int deptno, String dname, String loc) throws SQLException {

		String sql = "update dept set dname = ?, loc = ? where deptno = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dname);
		pstmt.setString(2, loc);
		pstmt.setInt(3, deptno);

		int rCnt = pstmt.executeUpdate();

		if (rCnt > 0) {
			System.out.println("수정되었습니다.");
		} else {
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
		}
		// pstmt.close();
		pstmt.close();

	}

	// 부서 정보 삭제
	// 부서 번호로 삭제 대상 선택
	public void deleteDept(Connection conn, int deptno) throws SQLException {

		String sql = "delete from dept where deptno =" + deptno;
		Statement stmt = conn.createStatement();
		int rCnt = stmt.executeUpdate(sql);

		if (rCnt > 0) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("삭제하고자 하는 데이터가 존재하지 않습니다.");
		}

		stmt.close();
	}

	// 부서 번호로 부서정보 검색하고 부서정보를 출력
	public void searchDept(Connection conn, int deptno) throws SQLException {

		String sql = "select * from dept where deptno = ?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, deptno);

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {

			System.out.println("찾으시는" + deptno + "번 부서의 정보");
			System.out.println("----------------------------------------------");
			System.out.println(deptno + "|" + rs.getString("dname") + "|" + rs.getString("loc"));
			System.out.println("----------------------------------------------");

		} else {
			System.out.println("찾으시는 부서의 정보가 없습니다.");
		}
		rs.close();
		pstmt.close();

	}

}// 클래스 끝
