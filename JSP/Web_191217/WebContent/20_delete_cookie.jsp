<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU=" crossorigin="anonymous"></script>
<style>
*{
margin:0;
padding: 0;
}
</style>
</head>
<body>

<%
Cookie c = new Cookie("uname","");
c.setMaxAge(0); //생성 되자마자 삭제됨.
//1일: 1*60*60*24


response.addCookie(c);

%>

<h1>쿠키 정보가 삭제되었습니다.</h1>
<a href = "18_view_cookie.jsp" >쿠키 정보 보기</a>

</body>
</html>