<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true"%>

<c:url value = "/" var="url"/>

<script>
alert('로그아웃 되었습니다.');

/* location.href = '<c:url value ="/" />'; */

location.href = '${url}'; 

//문자열 아님. -> 자바스크립트는 브라우저에서 실행됨. jsp 실행을 다 하고 나서 자바스크립트가 실행된다. 

</script>

