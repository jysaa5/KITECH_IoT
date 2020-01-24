<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>

    <link rel = "stylesheet" href ="191203_01.css">
    
    <style>
        select.byear{
            width: 214px;
            height: 30px;
            font-size: 1.3em;
            
        }
    
    </style>
    
</head>
<body>
    <!-- 2em: 배수 표현, 기본 사이즈 16px -> 32px -->
    <h1 class="title">회원가입</h1>
    <hr>
    <form action="04_view_data02.jsp" method="post">
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
                <td>이름</td>
                <td><input type="text" name="uname"> </td>
            </tr>

            <tr>
                <td>성별</td>
                <td>
                남성<input type="radio" name="gender" value="m">
                    여성<input type="radio" name=gender value="w"> 
                    </td>
            </tr>

            <tr>
                <td>태어난 년도</td>
                <td>
                    <select id="byear" class = "byear" name= "byear">
                    <%for(int i=2019; i>=1950; i--){
                    	%><option><%out.println(i+"\n");
                    	%></option><%} %>
                    </select>
                </td>
            </tr>

            <tr>
                <td>프로필 사진</td>
                <td><input type="file" name="pflie"> </td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="회원가입"> </td>
            </tr>
        </table>
    </form>
    
    <script>
    
    </script>
    
    
    
    
</body>
</html>