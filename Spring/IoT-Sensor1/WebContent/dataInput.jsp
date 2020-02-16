<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
String data = request.getParameter("data");

//DB에 insert 작업

application.setAttribute("sdata", data);
%>

<%@ page trimDirectiveWhitespaces="true" %>
ok