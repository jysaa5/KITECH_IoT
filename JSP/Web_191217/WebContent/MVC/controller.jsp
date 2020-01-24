<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page trimDirectiveWhitespaces="true" %>
<%

String type = request.getParameter("type");

String fpage = "";

if(type.equals("A")){
	//핵심처리를 한다.그리고 나서 결과 ▽
	String str = "A 페이지 입니다.";
	request.setAttribute("result", str);
	fpage = "a.jsp";
}else if(type.equals("B")){
	
	//핵심처리... 쭉 되고 나서.
	String result = "B 페이지 정답입니다.";
	request.setAttribute("result", result);
	fpage="b.jsp";
}else if(type.equals("C")){
	String s = "Page c";
	request.setAttribute("result", s);
	fpage="c.jsp";
}

%>

<jsp:forward page ="<%=fpage%>"/>