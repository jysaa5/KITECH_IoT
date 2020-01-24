package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_TEST_ORACLE {

	public static void main(String[] args) {
		Connection conn = null;
		try {

			// 1.드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로드 완료.");

			// 호스트, port, db name
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			// 계정
			String user = "scott";
			// 비밀번호
			String pw = "tiger";

			// 2.데이터베이스에 접속
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("데이터베이스에 정상적으로 접속했습니다.");
			conn.setAutoCommit(false); //자동 커밋을 거짓으로 바꿔놓음.
			

			// -----------------------------------------------------------------------------------------------------------------------
			// 3.데이터의 검색과 변경처리: select / DML
			// 3.2 insert를 통해서 부서정보를 입력처리
			// PreparedStatement 생성: 객체 생성 시에 sql문을 완성

			/*
			 * String sql2 = "insert into dept (deptno, dname, loc) values (?,?,?)";
			 * PreparedStatement pstmt = conn.prepareStatement(sql2);
			 * 
			 * //데이터 매핑 -> ? 안에 값 넣기 pstmt.setInt(1, 50); //? 물음표 1부터 시작함 //무결성 제약 조건에 걸림.
			 * -> 기본키라서 pstmt.setString(2, "DEV"); pstmt.setString(3, "SEOUL"); //String
			 * sql2 = "insert into dept (deptno, dname, loc) values (50,'DEV','SEOUL')";
			 * 
			 * int rCnt = pstmt.executeUpdate(); //preparedStatement는 Statement를 상속하고 있다. //
			 * 실행횟수가 0보다 크면 성공, 아니면 실패 ->int 반환 // 예외 발생함.
			 * 
			 * if(rCnt > 0) { System.out.println("데이터 입력이 정상 처리되었습니다."); }else {
			 * System.out.println("입력이 되지 않았습니다, 관리자에게 문의하세요."); }
			 */
			// -----------------------------------------------------------------------------------------------------------------------

			//입력 메서드 호출
			//insertDept(conn, 60, "design", "Jeju");
			insertDept(conn, 70, "design", null);
			//insertDept(conn, 80, null, null);
			//insertDept(conn, 90, null, null);
			
			//데이터 출력
			listDept(conn);
			
			conn.commit(); //데이터베이스에 물리적으로 변경을 완료시킴.

			// 3.1 dept 테이블의 내용을 출력
			// Statement 객체 생성

			/*Statement stmt = conn.createStatement();
			String sql1 = "select * from dept"; // 문자열안에 ; 세미클론 안 붙임.
			ResultSet rs = stmt.executeQuery(sql1);

			while (rs.next()) {
				// int deptno = rs.getInt("deptno");
				// String dname = rs.getString("dname");
				// String loc = rs.getString("loc");

				int deptno = rs.getInt(1); // 컬럼의 순서는 테이블을 만들때 순서임. -> DESC dept 해서 보고 하면 됨.
				String dname = rs.getString(2);
				String loc = rs.getString(3);

				System.out.println(deptno + "|" + dname + "|" + loc);

			}*/

			//rs.close();
			//stmt.close();
			// pstmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			// System.out.println("해당 클래스를 찾을 수 없습니다." + e.getMessage());
			e.printStackTrace();
		} catch (SQLException se) {
			// System.out.println(se.getMessage());
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			se.printStackTrace();
			// System.out.println("입력오류");
		}

	}

	
	//부서정보 리스트 출력
	public static void listDept(Connection conn) throws SQLException {
		
		Statement stmt = conn.createStatement();
		String sql = "select * from dept"; // 문자열안에 ; 세미클론 안 붙임.
		ResultSet rs = stmt.executeQuery(sql);

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
	public static void insertDept(Connection conn, int deptno, String dname, String loc) throws SQLException {
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

}
