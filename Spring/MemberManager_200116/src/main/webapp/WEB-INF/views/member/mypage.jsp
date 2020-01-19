<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 코어태그 -->
<%@page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>MyPage</title>

<!-- 기본 CSS 처리 시작 -->
<%@ include file="/WEB-INF/views/include/basic.jsp"%>
<!-- 기본 CSS 처리 끝-->
<style>
li {
	list-style: none;
	padding: 3px 30px;
	}
</style>

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
			<img class="mr-3" src="https://getbootstrap.com/assets/brand/bootstrap-outline.svg" alt="" width="48" height="48">
			<div class="lh-100">
				<h6 class="mb-0 text-white lh-100">마이페이지</h6>
				<small>Since 2020</small>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">마이페이지 상태</h6>
			<div class="media text-muted pt-3">
				<p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
				</p>
			</div>
			<br>
			<c:if test="${mypage ne null}">
				회원 정보
				<ul>
					<li>이름 : ${mypage.uname}</li>
					<li>아이디 : ${mypage.uemail}</li>
					<li>성별 : ${mypage.gender}</li>
					<li>태어난 연도 : ${mypage.byear}</li>
<%-- 					<li><c:if test="${mypage.uphoto ne null}">
							<img src="${mypage.uphoto}">
						</c:if></li> --%>
				</ul>
			</c:if>

			<%-- <c:if test="${mypage eq null}">
				<script>
					alert('로그인이 필요한 서비스 입니다. 확인해주세요.');
					location.href = '../member/login';
				</script>

			</c:if> --%>
		</div>
		</div>
	</main>

	<!-- 메인 컨텐트 끝 -->



	<!-- 푸터 시작 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
	<!-- 푸터 끝-->

</body>
</html>