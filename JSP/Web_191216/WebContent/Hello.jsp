<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page errorPage="index.jsp" %> <%--오류가 생기면 이동할 페이지 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style></style>
</head>
<body>
현재 날짜와 시간은
<!-- JSP의 JAVA 코드를 작성할 수 있는 영역: 스크립트릿 영역-->
<%
//java.util.Date now = new java.util.Date(); 
Date now = new Date();
int n = 1/0;
%>

<!-- 표현식 -->
<%=now%> <br>
<%= 1+2 %>

</body>
</html>