<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page trimDirectiveWhitespaces="true" %> <%--공백없애기 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar test</title>
<style></style>
</head>
<body>
<% Calendar cal = Calendar.getInstance();
%>
오늘은
<%=cal.get(Calendar.YEAR) %> 년
<%=cal.get(Calendar.MONTH)+1 %> 월
<%=cal.get(Calendar.DATE) %> 일
</body>
</html>