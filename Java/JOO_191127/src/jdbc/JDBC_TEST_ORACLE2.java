package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_TEST_ORACLE2 {

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
			// conn.setAutoCommit(false); //자동 커밋을 거짓으로 바꿔놓음.

			DAO dao = DAO.getInstance();

			// 부서정보 입력
			// dao.insertDept(conn, 90, "design", "SEUOL");
			// dao.insertDept(conn, 50, "design", "SEUOL");
			// dao.insertDept(conn, 60, "design", "SEUOL");
			// dao.insertDept(conn, 70, "design", "SEUOL");

			// 부서 정보 수정
			// dao.editDept(conn, 80, "MARKETING", "NEWYORK");
			// dao.editDept(conn, 60, "MARKETING", "NEWYORK");

			// 부서 삭제 수정
			//dao.deleteDept(conn, 50);
			//dao.deleteDept(conn, 70);
			//dao.deleteDept(conn, 60);

			// 부서 리스트 출력
			// dao.listDept(conn);

			// 부서 검색
			dao.searchDept(conn, 90);
			dao.searchDept(conn, 10);
			dao.searchDept(conn, 40);
			dao.searchDept(conn, 60);

			// conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException se) {
			// try {
			// conn.rollback();
			// } catch (SQLException e) {
			// e.printStackTrace();
			// }
			se.printStackTrace();

		}

	}

}
