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
//cookie의 수정 -> 새로운 쿠키 객체를 같은 이름으로 다시 등록 해주면 된다. 

Cookie c = new Cookie("uname", "LEE");
response.addCookie(c); //덮어씌워짐.
%>
<h1>쿠키 정보를 수정하였다.</h1>
<a href = "18_view_cookie.jsp" >쿠키 정보 보기</a>
</body>
</html>