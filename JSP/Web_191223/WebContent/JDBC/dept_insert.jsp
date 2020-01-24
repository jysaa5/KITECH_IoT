<%@page import="jdbc.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"
	integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
	crossorigin="anonymous"></script>
<style>
* {
	margin: 0;
	padding: 0;
}
</style>
</head>
<body>

	<%
		//한글 처리 
		request.setCharacterEncoding("utf-8");

		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		//여기서 들어오는 데이터의 값이 null이거나 공백일때, 기본값으로 처리 해주거나 예외처리가 필요하다. 

		//1. 드라이버 로드: Servlet에서 초기화 처리 
		//2. Connection 객체 생성 
		/* 	String jdbcurl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
		
			Connection conn = DriverManager.getConnection(jdbcurl, user, pw); */
		Connection conn = ConnectionProvider.getConnection();

		//3. PreparedStatement
		String sql = "insert into dept values(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(deptno));
		pstmt.setString(2, dname);
		pstmt.setString(3, loc);

		int result = pstmt.executeUpdate();
		//실행 횟수 반환해줌.

		if (result > 0) {
	%>
	<h1>데이터가 입력되었습니다.</h1>
	<%
		} else {
	%>
	<h1>데이터 입력이 되지 않았습니다. 확인해주세요.</h1>
	<%
		}

		pstmt.close();
		conn.close();
	%>

	<a href="dept_list.jsp">부서 리스트 보기</a>

</body>
</html>