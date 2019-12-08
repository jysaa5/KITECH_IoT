package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_EMP_P_30 {

	public static void main(String[] args) {
		
	
		Connection conn = null;
		try {

			//1.드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로드 완료.");

			//호스트, port, db name
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			// 계정
			String user = "scott";
			// 비밀번호
			String pw = "tiger";

			//2.데이터베이스에 접속
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			System.out.println("데이터베이스에 정상적으로 접속했습니다.");
			// conn.setAutoCommit(false); //자동 커밋을 거짓으로 바꿔놓음.

			//인스턴스 1번 생성
			EMP_DAO_P30 empdao = EMP_DAO_P30.getInstance();
			
			//데이터 입력, 출력, 수정, 삭제 메서드 실행
			
			//데이터 입력 메서드
			//(Connection conn, int empno, String ename, String job, int mgr, String hiredate, int sal, int comm, int deptno)
			empdao.insertEmp(conn, 0000, "KIM", "KIM", 0000, "19/12/08", 100, 100, 10);
			
			//데이터 출력 메서드
			empdao.listEmp(conn);
			
			//데이터 수정 메서드
			empdao.editEmp(conn,3000,"SCOTT");
			
			//데이터 조회 메서드
			empdao.searchEmp(conn,"SCOTT");
			
			//데이터 전체 조회
			empdao.listEmpDept(conn);
			
			

	} catch (ClassNotFoundException e) {
		e.printStackTrace();

	} catch (SQLException se) {

		se.printStackTrace();

	}

		
		
		
	}//메인 메서드 끝
}//클레스 끝
