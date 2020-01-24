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
	<c:set var="price" value="10000" />
	<fmt:formatNumber value="10000000000" type="number" />
	<br>
	<fmt:formatNumber value="10000000000" type="number" var="numberType" />
	<!--  var="numberType" -> 변수를 만들어줌. -->
	${numberType}
	<br>
	<fmt:formatNumber value="${price}" type="number" var="numberType" />
	<br> ${numberType}
	<br>

	<fmt:formatNumber value="${price}" type="currency" currencySymbol="$" />
	<br>

	<fmt:formatNumber value="${price/100000}" type="percent"
		groupingUsed="false" />
	<br>
	<fmt:formatNumber value="${price}" pattern="00000000.00" />



</body>
</html>