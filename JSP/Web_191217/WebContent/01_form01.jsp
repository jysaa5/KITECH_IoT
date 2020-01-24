<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>로그인 페이지</title>
    <link rel = "stylesheet" href ="191203_01.css">
</head>
<body>
    <!-- 2em: 배수 표현, 기본 사이즈 16px -> 32px -->
    <h1 class="title">회원 로그인</h1>
    <hr>
    <form action="02_view_data01.jsp" method="post">
        <table class="inputBox">
            <tr>
                <td>아이디(이메일)</td>
                <td><input type="text" name="uid"> </td>
            </tr>

            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="pw"> </td>
            </tr>

            <tr>

                <td></td>
                <td><input type="submit" value="로그인"> </td>
            </tr>

        </table>
    </form>
</body>
</html>