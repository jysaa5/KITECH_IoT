<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 코어태그 등록 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 검색</h1>
	검색: ${searchOptions}
	<br>
	<br>
	<select>
		<c:forEach items="${searchOptions}" var="option">
			<option>${option}</option>
			<br>
		</c:forEach>
	</select>
	
	<input type ="text" placeholder ="검색 키워드">

</body>
</html>