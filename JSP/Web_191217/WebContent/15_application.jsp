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
String driver = application.getInitParameter("driver"); //문자열 반환함.
String debug = application.getInitParameter("debugMode");
%>

DB Driver: <%=driver %>, debug: <%=debug %>








</body>
</html>