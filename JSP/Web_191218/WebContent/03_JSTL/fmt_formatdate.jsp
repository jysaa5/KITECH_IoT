<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

	<c:set var="now" value="<%=new java.util.Date()%>" />

	<fmt:formatDate value="${now}" />
	<br>
	<fmt:formatDate value="${now}" type="date" dateStyle="full" />
	<br>
	<fmt:formatDate value="${now}" type="date" dateStyle="short" />
	<br>

	<hr>

	<fmt:formatDate value="${now}" type="time" />
	<br>
	<fmt:formatDate value="${now}" type="time" timeStyle="full" />
	<br>
	<fmt:formatDate value="${now}" type="time" dateStyle="short" />
	<br>

	<hr>

	<fmt:formatDate value="${now}" type="both" />
	<br>
	<fmt:formatDate value="${now}" type="both" dateStyle="full"
		timeStyle="full" />
	<br>
	<fmt:formatDate value="${now}" type="both" dateStyle="short"
		timeStyle="short" />
	<br>

	<hr>

	<fmt:formatDate value="${now}" pattern="yyyy.MM.dd. H:mm:ss" />
	<br>
	<fmt:formatDate value="${now}" pattern="yyyy.MM.dd H:mm:ss" />
	<br>

	<hr>

	<fmt:timeZone value="HongKong">
	홍콩시간:
	<fmt:formatDate value="${now}" type="both" dateStyle="full"
			timeStyle="full" />
	</fmt:timeZone>
	<hr>
	<c:forEach var="id" items="<%=java.util.TimeZone.getAvailableIDs() %>">
	${id}<br>

	</c:forEach>
</body>
</html>