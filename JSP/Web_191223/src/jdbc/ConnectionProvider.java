package jdbc;

import java.sql.*;

public class ConnectionProvider {

	public static Connection getConnection() {
		// 1. 드라이버 로드: Servlet에서 초기화 처리
		// 2. Connection 객체 생성
		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(jdbcurl, user, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
