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

table {
	width: 60%;
}
</style>
</head>
<body>

	<%
		//1.드라이버 로딩: 한번만 실행해도 된다.
		//Class.forName("oracle.jdbc.driver.OracleDriver");

		//2.컨넥션 
/* 		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";

		Connection conn = DriverManager.getConnection(jdbcurl, user, pw); */
		Connection conn = ConnectionProvider.getConnection();
		
		//3. Statement 객체 생성
		Statement stmt = conn.createStatement();

		String sql = "select * from dept order by deptno";

		ResultSet rs = stmt.executeQuery(sql);
	%>
	<h1>부서 리스트</h1>
	<hr>
	<table border="1">

		<tr>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>위치</td>
			<td>관리</td>

		</tr>
		<%
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getInt(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><a href="dept_edit_form.jsp?dno=<%=rs.getInt("deptno")%>">수정</a>
				| <a href="javascript:del(<%=rs.getInt(1)%>)">삭제</a></td>
		</tr>

		<%
			}
			rs.close();
			stmt.close();
			conn.close();
		%>


	</table>

	<script>
		function del(dno) {
			var chk = confirm("삭제하시겠습니까?");
			if (chk) {
				location.href = "dept_delete.jsp?dno=" + dno;
				//alert(dno + '번호의 부서가 삭제되었습니다.');

			}
		}
	</script>



</body>
</html>