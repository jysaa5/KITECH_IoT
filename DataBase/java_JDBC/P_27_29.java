package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P_27_29 {

	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "scott", "tiger");

			System.out.println("데이터베이스에접속했습니다.");
			System.out.println("======================================");

			String sql1 = "INSERT INTO dept (DEPTNO, DNAME, Loc) VALUES (?, ?, ?) ";
			Statement stmt = conn.createStatement();
			PreparedStatement pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, 90);
			pstmt.setString(2, "MARKETING");
			pstmt.setString(3, "JEJU");

			int procNum = pstmt.executeUpdate();
			System.out.println(procNum + "개 행이 적용되었습니다.");

			String sql2 = "select * from dept order by DEPTNO";
			ResultSet rs = stmt.executeQuery(sql2);

			while (rs.next()) {
				System.out.print("부서번호 : " + rs.getInt(1) + "\t");
				System.out.print("부서번호 : " + rs.getString(2) + "\t");
				System.out.print("부서번호 : " + rs.getString(3) + "\t");
				System.out.println("\n------------------------------------");
			}

			rs.close();
			pstmt.close();
			conn.close();

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}

	}
}
