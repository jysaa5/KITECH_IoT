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
Cookie[] cookies = request.getCookies();
for(int i=0; i<cookies.length; i++){
	if(cookies[i].getName().equals("uname")){
%>
쿠키 이름: <%= cookies[i].getName() %> = <%=cookies[i].getValue()%> <br>
<% 	
}
}
%>
<h1>
쿠키 수정하기. <br></h1>
<a href = "19_edit_cookie.jsp" >쿠키 정보 보기</a>
<br>
<h1>쿠키 삭제하기.</h1>
<a href = "20_delete_cookie.jsp" >쿠키 정보 보기</a>
</body>
</html>