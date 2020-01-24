<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

	<c:if test="${loginChk}"> <!--  true = 로그인 된 것. -->
		<c:redirect url="${refererPage}" />
	</c:if>

	<c:if test="${!loginChk}"><!-- 로그인이 안되었을때. -->
		<script>
			alert('아이디 혹은 비밀번호가 틀립니다.\n확인 후 다시 로그인 해주세요.');
			location.href= '../login/loginForm';
		</script>

	</c:if>
</body>
</html>