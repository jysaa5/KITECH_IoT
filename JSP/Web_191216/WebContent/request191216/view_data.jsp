<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style></style>
</head>
<body>

<%request.setCharacterEncoding("utf-8"); %>

<h1>request.getParameter()메서드 이용 -> String으로 받음.</h1>
uname 파라미터: <%= request.getParameter("uname") %> <br>
address 파라미터: <%= request.getParameter("address") %> <br>

<hr>

<h1>request.getParameterValues()메서드 이용 -> String[] 스트링타입의 배열로 받음.</h1>

<% String[] values = request.getParameterValues("pet");
if(values != null){
	
	out.print("좋아하는 동물:");
	
	
	for(int i=0; i<values.length; i++){
	
		out.print(values[i]+",");
		
	}
}

%>

</body>
</html>