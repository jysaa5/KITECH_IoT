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
<!-- value에 상대경로, 절대 경로 둘 다 쓸 수 있다. -->
<c:url var="home" value="/index.jsp" />
${home} <br>
<c:url var="home" value="/05_html/index.jsp" />
${home} <br>
<c:url var="outPage" value="c_out.jsp" />
${outPage}<br>

<%-- <a href ="<c:url value = '/index.jsp'/>">home</a> --%>

<a href ="<c:url value = '/index.jsp'><c:param name ="uid" value = "cool"/></c:url>">home</a>


</body>
</html>