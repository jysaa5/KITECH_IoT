package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EMP_DAO_P_30 {

	//싱글톤 패턴
	private EMP_DAO_P_30() {
	}

	private static EMP_DAO_P_30 empdao = new EMP_DAO_P_30();

	public static EMP_DAO_P_30 getInstance() {
		return empdao;
	}
	//싱글톤 패턴 끝

	//DB 사원정보 입력 메서드
	//Connection 클래스 인스턴스, 사원정보(사원번호, 사원이름, 직급, 사수번호, 입사일, 급여, 상여금, 부서번호)
		public void insertEmp(Connection conn, int empno, String ename, String job, int mgr, String hiredate, int sal, int comm, int deptno) throws SQLException {
			// 메소드에 커넥션을 받음.
			// SQL
			String sql = "insert into emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (?,?,?,?,?,?,?,?)";

			// PreparedStatement
			PreparedStatement pstmt = conn.prepareStatement(sql);

			// Mapping
			pstmt.setInt(1, empno); // ? 물음표 1부터 시작함 //무결성 제약 조건에 걸림. -> 기본키라서
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, mgr);
			pstmt.setString(5, hiredate);
			pstmt.setInt(6, sal);
			pstmt.setInt(7, comm);
			pstmt.setInt(8, deptno);

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

		}//insertEmp 메서드 끝
	
	//DB 사원정보 전체 출력 메서드	
		public void listEmp(Connection conn) throws SQLException {

			Statement stmt = conn.createStatement();
			String sql1 = "select * from emp"; // 문자열안에 ; 세미클론 안 붙임.
			ResultSet rs = stmt.executeQuery(sql1);

			System.out.println("사원정보(emp) 리스트");
			System.out.println("-------------------------------------------");

			while (rs.next()) {
				// int deptno = rs.getInt("deptno");
				// String dname = rs.getString("dname");
				// String loc = rs.getString("loc");

				int empno = rs.getInt(1); // 컬럼의 순서는 테이블을 만들때 순서임. -> DESC emp 해서 보고 하면 됨.
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				String hiredate = rs.getString(5);
				int sal = rs.getInt(6);
				int comm = rs.getInt(7);
				int deptno = rs.getInt(8);
				
				System.out.println(empno + "|" + ename + "|" + job + "|" + mgr + "|" + hiredate + "|" + sal + "|" + comm + "|" + deptno + "|"     );

			}
			System.out.println("-------------------------------------------");
			rs.close();
			stmt.close();
		}//listEmp 메서드 끝	

		
	//DB 사원정보 수정 메서드
	//사원이름, 급여 선택의 조건 사원이름으로 한다.
	public void editEmp(Connection conn, int sal, String ename) throws SQLException {

		String sql = "update emp set sal =? where ename = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sal);
		pstmt.setString(2, ename);

		int rCnt = pstmt.executeUpdate();

		if (rCnt > 0) {
			System.out.println("수정되었습니다.");
		} else {
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
		}
		pstmt.close();
	}//editEmp 메서드 끝
		
	
	//DB 사원정보 조회 메서드
	//사원 이름으로 사원의 정보 전체 조회
		public void searchEmp(Connection conn, String ename) throws SQLException {

			String sql = "select * from emp where ename = ?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ename);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				System.out.println("찾으시는" + ename + "사원의 정보");
				System.out.println("----------------------------------------------");
				System.out.println(rs.getInt("empno") + "|" + rs.getString("ename") + "|" + rs.getString("job")+"|"+rs.getInt("mgr")+"|"+ rs.getString("hiredate")+"|"+rs.getInt("sal")+"|"+rs.getInt("comm")+"|"+rs.getInt("deptno"));
				System.out.println("----------------------------------------------");

			} else {
				System.out.println("찾으시는 부서의 정보가 없습니다.");
			}
			rs.close();
			pstmt.close();
		}//searchEmp메서드 끝
		
		
	// DB 사원정보&부서정보 전체 출력 메서드
	public void listEmpDept(Connection conn) throws SQLException {

		Statement stmt = conn.createStatement();
		String sql1 = "select empno, ename, job, mgr, hiredate, sal, comm, emp.deptno, dname, loc from emp, dept Where emp.deptno = dept.deptno"; // 문자열안에 ; 세미클론 안 붙임.
		ResultSet rs = stmt.executeQuery(sql1);

		System.out.println("사원정보(emp) & 부서정보(dept) 리스트");
		System.out.println("-------------------------------------------");

		while (rs.next()) {
			// int deptno = rs.getInt("deptno");
			// String dname = rs.getString("dname");
			// String loc = rs.getString("loc");

			int empno = rs.getInt(1); // 컬럼의 순서는 테이블을 만들때 순서임. -> DESC emp 해서 보고 하면 됨.
			String ename = rs.getString(2);
			String job = rs.getString(3);
			int mgr = rs.getInt(4);
			String hiredate = rs.getString(5);
			int sal = rs.getInt(6);
			int comm = rs.getInt(7);
			int deptno = rs.getInt(8);
			String dname = rs.getString(9);
			String loc = rs.getString(10);
			

			System.out.println(empno + "|" + ename + "|" + job + "|" + mgr + "|" + hiredate + "|" + sal + "|" + comm
					+ "|" + deptno + "|"+ dname + "|" + loc);

		}
		System.out.println("-------------------------------------------");
		rs.close();
		stmt.close();
	}// listEmpDept 메서드 끝
		
		
		
}//클래스 끝
