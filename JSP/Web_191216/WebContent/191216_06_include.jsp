<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div{
text-align: center;
border: 1px solid #777;
}

div.left, div.right{
width: 49%;
float: left;
}

div.footer{
clear: both;

}

</style>
</head>
<body>

<%@include file = "include191216/top.jsp" %>
<%@include file = "include191216/left.jsp" %>
<%@include file = "include191216/right.jsp" %>


<jsp:include page="include191216/footer.jsp">
<jsp:param value ="1" name ="menu_code"/>
<jsp:param value="test@test.com" name="email"/>
<jsp:param value="010-0000-0000" name="tel"/>

</jsp:include>

</body>
</html>