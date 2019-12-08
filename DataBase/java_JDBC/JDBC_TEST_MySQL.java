package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_TEST_MySQL {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			// 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MySQL 드라이버 로드 완료");

			// 호스트, port, db name
			String jdbcUrl = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
			String user = "kite"; // root
			String password = "test1111"; // admin

			conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("데이터베이스에 접속했습니다.");

			conn.close();
		} catch (ClassNotFoundException e) {
			// System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			e.printStackTrace();
		} catch (SQLException se) {
			// System.out.println(se.getMessage());
			se.printStackTrace();
		}

	}

}
