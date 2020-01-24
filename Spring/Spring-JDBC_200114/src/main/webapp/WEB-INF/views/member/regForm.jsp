<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
</head>
<body>
	<h1>회원 정보 수정</h1>

	<!-- html5는 email 타입 사용 가능 -->
	<!-- 	동일한 경로에는 action 필요 없음. -->
	<form method="post">
		email <input type="email" name ="email"> 
		<br> 
		이름<input type="text" name ="name">
		<br> 
		비밀번호<input type="password" name = "password"> 
		<br> 
		<input type="submit">

	</form>
</body>
</html>