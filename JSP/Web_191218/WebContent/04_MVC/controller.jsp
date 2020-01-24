<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true"%>



<c:choose>
	<c:when test="${param.type == 'A'}">
		<c:set var="result" value="A 페이지 입니다." scope="request" />
		<c:set var="fpage" value="a.jsp" />

	</c:when>

</c:choose>

<c:choose>
	<c:when test="${param.type == 'B'}">
		<c:set var="result" value="B 페이지 입니다." scope="request" />
		<c:set var="fpage" value="b.jsp" />

	</c:when>

</c:choose>

<c:choose>
	<c:when test="${param.type == 'C'}">
		<c:set var="result" value="C 페이지 입니다." scope="request" />
		<c:set var="fpage" value="c.jsp" />

	</c:when>

</c:choose>

<jsp:forward page="${fpage}" />

<%-- 

<%
	String type = request.getParameter("type");

	String fpage = "";

	if (type.equals("A")) {
		//핵심처리를 한다.그리고 나서 결과 ▽
		String str = "A 페이지 입니다.";
		request.setAttribute("result", str);
		fpage = "a.jsp";
	} else if (type.equals("B")) {

		//핵심처리... 쭉 되고 나서.
		String result = "B 페이지 정답입니다.";
		request.setAttribute("result", result);
		fpage = "b.jsp";
	} else if (type.equals("C")) {
		String s = "Page c";
		request.setAttribute("result", s);
		fpage = "c.jsp";
	}
%>

<jsp:forward page="<%=fpage%>" /> --%>