<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼에서 입력한 데이터</title>
<style></style>
</head>
<body>

<h1>회원 가입폼에서 전송한 파라미터 출력</h1>
<% 
//한글 인코딩
request.setCharacterEncoding("utf-8");
//데이터 받아 출력하기
//데이터 받기: request 내장 객체 
String uid  = request.getParameter("uid");
String pw = request.getParameter("pw");

%>

아이디:<%=uid %> <br>
비밀번호:<%=pw %> <br>

<hr>
</body>
</html>