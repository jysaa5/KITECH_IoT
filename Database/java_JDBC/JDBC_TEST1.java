package jdbc;

import java.sql.Connection; //자바에서 제공하는 커넥션 객체
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_TEST1 {

	public static void main(String[] args) {

		Connection conn = null;
		try {
		//드라이버 로드 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:orcl" , "scott", "tiger");
		System.out.println("오라클 드라이버 로드 완료");
		System.out.println("데이터베이스에 접속했습니다.");
		conn.close();
		}
		catch (ClassNotFoundException cnfe) {
		System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		}
		catch (SQLException se) {
		System.out.println(se.getMessage());
		}

	}

}
