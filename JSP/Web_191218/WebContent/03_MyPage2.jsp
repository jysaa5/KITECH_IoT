<%@page import="member.LoginInfo"%>
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

	<c:if test="${loginInfo == null}">
		<script>
		alert('로그인이 필요한 서비스 입니다.');
		location.href = '04_form.html';
	</script>
	</c:if>

	<c:if test="${loginInfo != null}">

		<h1>회원 정보</h1>
		<h3>
			이름: ${loginInfo.name} <br>
			 아이디:${loginInfo.id}<br> 
			 성별:${loginInfo.gender}<br>
			 태어난 년도:${loginInfo.byear}<br>
		</h3>
		<a href="06_logout.jsp">로그아웃</a>

	</c:if>

	<%-- 

	<%
		//로그인 유무 확인 -> session 속성에 loginInfo 확인

		LoginInfo info = (LoginInfo) session.getAttribute("loginInfo");

		if (info == null) {
	%>
	<script>
		alert('로그인이 필요한 서비스 입니다.');
		location.href = '04_form.html';
	</script>
	<%
		} else {
	%>
	<h1>회원 정보</h1>
	<h3>
		이름:
		<%=info.getName()%> /${loginInfo.name} <br>
		아이디:
		<%=info.getId()%> /${loginInfo.id}<br>
		성별:
		<%=info.getGender()%> /${loginInfo.gender} <br>
		태어난 년도:
		<%=info.getByear()%> /${loginInfo.byear} <br>
	</h3>
	<a href="06_logout.jsp">로그아웃</a>
	
	<%} %> --%>
</body>
</html>