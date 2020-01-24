<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td{
padding: 10px;
}

</style>
</head>
<body>
	<!-- <form  method="post"> 자기 자신으로 돌아아옴 -->
	<form method="post">
		<h1>로그인</h1>
		<hr>
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" /></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="로그인" /></td> 

			</tr>
		</table>
	</form>
</body>
</html>