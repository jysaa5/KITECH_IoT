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
<%-- 	${member} --%>
	<h1>회원 정보 수정</h1>
	<hr>
	<form action="edit" method="post">
		<input type="hidden" name="idx" value="${member.idx}"> <!-- pk가 사용자에게 보이진 않도록 처리함. -->
		<table class="inputBox">
			<tr>
				<td>아이디(이메일)</td>
				<td><input type="text" name="uid" value="${member.uid}" readonly></td> <!-- 아이디(이메일)은 변경하지 못하도록 함. -->
			</tr>

			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>

			<tr>
				<td>이름</td>
				<td><input type="text" name="uname" value="${member.uname}"></td>
			</tr>

			<tr>
				<td>성별</td>
				<td>남성<input type="radio" name="gender" value="m"
					<c:if test ="${member.gender == 'm'}">
				checked
				</c:if>>
					여성<input type="radio" name=gender value="w"
					<c:if test ="${member.gender == 'w'}">
				checked
				</c:if>>
				</td>
			</tr>

			<!-- radio 버튼의 속성: checked -->

			<tr>
				<td>태어난 년도</td>
				<td><select id="byear" class="byear" name="byear">
						<!--  <option value="2000">2000</option>
                    <option>1999</option>
                    <option>1998</option>
                    <option>1997</option>
                    <option>1996</option>
                    <option>1995</option>-->

						<c:forEach begin="1950" end="2019" step="1" var="i">
							<option value="${i}"
								<c:if test="${i==member.byear}">
								selected
                    </c:if>>${i}</option>
						</c:forEach>
						<!-- option의 속성: selected -->
				</select>
				</td>
			</tr>

			<tr>
				<td>프로필 사진</td>
				<td><input type="file" name="pflie"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="정보수정"></td>
			</tr>
		</table>
	</form>

	<script>
		$(document).ready(function() {

			/* 	var selectOption = '';
				for (var i = 2019; i >= 1950; i--) {

					selectOption += '<option value='+i+'>' + i + '</option>\n';
					$('#byear').html(selectOption);
				} */
		});
	</script>


</body>
</html>