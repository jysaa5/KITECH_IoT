<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 코어태그 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>멤버 List</title>

<!-- 기본 CSS 처리 시작 -->
<%@ include file="/WEB-INF/views/include/basic.jsp"%>
<!-- 기본 CSS 처리 끝 -->
<script>
</script>
</head>
<body>

	<!-- 해더 시작 -->
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<!-- 해더 끝 -->

	<!-- 메인 컨텐트 시작 -->
	<main role="main" class="container">
		<div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
			<div class="lh-100">
				<h6 class="mb-0 text-white lh-100">멤버</h6>
				<small>Since 2020</small>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">멤버리스트</h6>
			<%-- ${listView} --%>
			<table class="table">
				<tr>
					<th>no</th>
					<th>이메일(아이디)</th>
					<th>비밀번호</th>
					<th>이름</th>
					<th>성별</th>
					<th>태어난 연도</th>
					<th>프로필 사진</th>
				</tr>

				<!-- 리스트 시작 -->
				<c:forEach items="${mListView.memberList}" var="member">
					<tr>
						<td>${member.idx}</td>
						<td>${member.uemail}</td>
						<td>${member.upw}</td>
						<td>${member.uname}</td>
						<td>${member.gender}</td>
						<td>${member.byear}</td>
						<td>${member.uphoto}</td>
						<%-- <td>
						<a href="<c:url value ="/guest/edit?idx=${article.idx}"/>" class="btn btn-primary">수정</a>
						<a href="<c:url value ="/guest/delete?idx=${article.idx}"/>" class="btn btn-danger">삭제</a>
						</td> --%>
					</tr>
				</c:forEach>
				<!-- 리스트 끝-->
			</table>

			<div>
				<c:forEach begin="1" end="${mListView.totalMemberPageCount}" var="i">
					<a href="<c:url value ="/member/list?page=${i}"/>">[${i}]</a>
				</c:forEach>	
			</div>
		</div>
		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">멤버리스트</h6>

			<c:forEach items="${mListView.memberList}" var="member">
			
				<div class="media text-muted pt-3">
					<!--<img data-src="holder.js/32x32?theme=thumb&bg=007bff&fg=007bff&size=1" alt="" class="mr-2 rounded"> -->
					<div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
						<div class="d-flex justify-content-between align-items-center w-100">
						
						<strong class="text-gray-dark">${member.uemail}</strong> 
						<a href="#">${member.uname}</a> 
						
						</div>
						<span class="d-block">${member.uphoto}</span>
					</div>
				</div>
			</c:forEach>
		</div>
	</main>

	<!-- 메인 컨텐트 끝 -->

	<!-- 푸터 시작 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
	<!-- 푸터 끝-->


</body>
</html>