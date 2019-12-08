package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class P_26 {

	public static void main(String[] args) {
		
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, "scott", "tiger");
		System.out.println("데이터베이스에 접속했습니다.");
		conn.close();
		} catch (ClassNotFoundException cnfe) {
		System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
		System.out.println(se.getMessage());
		}

	}

}
