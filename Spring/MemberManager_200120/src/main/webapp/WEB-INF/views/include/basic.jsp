<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<!-- mm: context 경로: 배포도중에 context 경로가 변경될수 있으므로 core태그를 사용함. -->
<!-- /mm/css/default.css -->
<%-- <c:url value ="/css/default.css/"/> : 절대경로임. 맨 앞에 슬래시 앞에 context 경로가 들어감 --%>
<link rel="stylesheet" href="<c:url value ="/css/default.css/"/>">

<!-- Bootstrap core CSS -->
<!-- <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet"> -->
<link href="<c:url value ="/css/bootstrap/bootstrap.min.css/"/>" rel="stylesheet">

<!-- Custom styles for this template -->
<!-- <link href="css/bootstrap/offcanvas.css" rel="stylesheet"> -->
<link href="<c:url value ="/css/bootstrap/offcanvas.css/"/>" rel="stylesheet">