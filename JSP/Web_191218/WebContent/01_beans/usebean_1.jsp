<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<jsp:useBean id="member" class="member.MemberInfo" scope="request"/>
<!-- 값을 넣어줌. -->
<jsp:setProperty property="*" name ="member"/>

<%=member %>

<!-- 1.기존에 있는 것을 찾기: MemberInfo member = (MemberInfo)request. getAttribute("member"); 
이것과 jsp:useBean과 같은 문장이다.

2.없으면 생성.
MemberInfo member = new MemberInfo(); 이 코드와 위에 코드와 같은 것. 
scope ="request" ==> request.setAttribute("member", member);
 -->
<%--<% member.setUname("son");

<%= member.getByear() %> :<%= member.getUname() %> --%>

<br>

<jsp:useBean id="loginInfo" class="member.LoginInfo" scope="session"/>

<% loginInfo.setId("ryuyj76@naver.com"); %>


<%=loginInfo %>

</body>
</html>