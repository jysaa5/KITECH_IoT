<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 코어태그 -->
<%@page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Write</title>

<!-- 기본 CSS 처리 시작 -->
<%@ include file="/WEB-INF/views/include/basic.jsp"%>
<!-- 기본 CSS 처리 끝-->

<script>
	
</script>

</head>
<body>

	<!-- 해더 시작 -->
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<!-- 해더 끝 -->

	<!-- 메인 컨텐트 시작 -->
	<main role="main" class="container">
		<div
			class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
			<img class="mr-3"
				src="https://getbootstrap.com/assets/brand/bootstrap-outline.svg"
				alt="" width="48" height="48">
			<div class="lh-100">
				<h6 class="mb-0 text-white lh-100">로그인</h6>
				<small>Since 2020</small>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">로그인 상태</h6>
			<div class="media text-muted pt-3">
				<p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
					<c:if test="${loginChk}">
						<!--  true = 로그인 된 것. -->
				              로그인이 완료되었습니다.
				</c:if>
					<c:if test="${!loginChk}">
						<!-- 로그인이 안되었을때. -->
						<script>
							alert('아이디 혹은 비밀번호가 틀립니다.\n확인 후 다시 로그인 해주세요.');
							location.href = '../member/login';
						</script>

					</c:if>
				</p>
			</div>
		</div>
	</main>

	<!-- 메인 컨텐트 끝 -->



	<!-- 푸터 시작 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
	<!-- 푸터 끝-->

</body>
</html>