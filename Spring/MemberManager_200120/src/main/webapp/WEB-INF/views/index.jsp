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
<title>Index</title>

<!-- 기본 CSS 처리 시작 -->
<%@ include file="/WEB-INF/views/include/basic.jsp" %>
<!-- mm: context 경로: 배포도중에 context 경로가 변경될수 있으므로 core태그를 사용함. -->
<!-- /mm/css/default.css -->
<%-- <c:url value ="/css/default.css/"/> : 절대경로임. 맨 앞에 슬래시 앞에 context 경로가 들어감 --%>

<%-- <link rel="stylesheet" href="<c:url value ="/css/default.css/"/>"> --%>

<!-- Bootstrap core CSS -->
<!-- <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet"> -->
<%-- <link href="<c:url value ="/css/bootstrap/bootstrap.min.css/"/>" rel="stylesheet"> --%>

<!-- Custom styles for this template -->
<!-- <link href="css/bootstrap/offcanvas.css" rel="stylesheet"> -->
<%-- <link href="<c:url value ="/css/bootstrap/offcanvas.css/"/>" rel="stylesheet"> --%>

<!-- 기본 CSS 처리 끝-->

<!-- <script src="https://code.jquery.com/jquery-1.12.4.js"></script> 부트스트랩과 버전이 다름, 그래서 생략함-->
<!-- jQuery 버전 -->

<script>
</script>

</head>
<body>

	<!-- 해더 시작 -->
	<%@ include file="/WEB-INF/views/include/header.jsp" %>
	<!-- <nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark">
		이 사이트/app의 타이틀이 됨.
		<a class="navbar-brand mr-auto mr-lg-0" href="#">MemberManager</a>
		모바일화면으로 변했을 때 보이는 부분
		<button class="navbar-toggler p-0 border-0" type="button" data-toggle="offcanvas">
			<span class="navbar-toggler-icon"></span>
		</button>
		메뉴
		<div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto"> "nav-item active 해주면 활성화된 거처럼 글자가 하얗게 변함.
				<li class="nav-item">
				<a class="nav-link" href="#">HOME
				<span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">회원가입</a></li>
				<li class="nav-item"><a class="nav-link" href="#">회원로그인</a></li>
				<li class="nav-item"><a class="nav-link" href="#">회원로그아웃</a></li>
				<li class="nav-item"><a class="nav-link" href="#">회원리스트</a></li>

				큰 메뉴의 작은 메뉴들
				<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="https://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">방명록</a>
					<div class="dropdown-menu" aria-labelledby="dropdown01">
						<a class="dropdown-item" href="#">방명록 작성</a> 
						<a class="dropdown-item" href="#">방명록 리스트 보기</a>
					</div>
				</li>
			</ul>

			오른쪽에 검색영역
				<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav> -->
	<!-- 해더 끝 -->

	<!--메뉴 구성 -->
	<%-- <a href="<c:url value ="/"/>">홈</a>
	<a href="">회원가입</a>
	<a href="">회원 로그인</a>
	<a href="">회원 로그아웃</a>
	<a href="">회원 리스트</a>
	<a href="">방명록(리스트)</a> --%>


	<!-- 메인 컨텐트 시작 -->
	<main role="main" class="container">
		<div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
			<img class="mr-3" src="https://getbootstrap.com/assets/brand/bootstrap-outline.svg" alt="" width="48" height="48">
			<div class="lh-100">
				<h6 class="mb-0 text-white lh-100">MemberManager</h6>
				<small>Since 2020</small>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">Recent updates</h6>
			<div class="media text-muted pt-3">
				<img data-src="holder.js/32x32?theme=thumb&bg=007bff&fg=007bff&size=1" alt="" class="mr-2 rounded">
				<p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
					<strong class="d-block text-gray-dark">@username</strong> 
					Donec id
					elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac
					cursus commodo, tortor mauris condimentum nibh, ut fermentum massa
					justo sit amet risus.
				</p>
			</div>
			<div class="media text-muted pt-3">
				<img data-src="holder.js/32x32?theme=thumb&bg=e83e8c&fg=e83e8c&size=1" alt="" class="mr-2 rounded">
				<p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
					<strong class="d-block text-gray-dark">@username</strong> 
					Donec id
					elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac
					cursus commodo, tortor mauris condimentum nibh, ut fermentum massa
					justo sit amet risus.
				</p>
			</div>
			<div class="media text-muted pt-3">
				<img data-src="holder.js/32x32?theme=thumb&bg=6f42c1&fg=6f42c1&size=1" alt="" class="mr-2 rounded">
				<p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
					<strong class="d-block text-gray-dark">@username</strong> 
					Donec id
					elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac
					cursus commodo, tortor mauris condimentum nibh, ut fermentum massa
					justo sit amet risus.
				</p>
			</div>
			<small class="d-block text-right mt-3"> 
			<a href="#">All updates</a>
			</small>
		</div>

		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">Suggestions</h6>
			<div class="media text-muted pt-3">
				<img data-src="holder.js/32x32?theme=thumb&bg=007bff&fg=007bff&size=1" alt="" class="mr-2 rounded">
				<div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
					<div class="d-flex justify-content-between align-items-center w-100">
						<strong class="text-gray-dark">Full Name</strong> <a href="#">Follow</a>
					</div>
					<span class="d-block">@username</span>
				</div>
			</div>
			<div class="media text-muted pt-3">
				<img data-src="holder.js/32x32?theme=thumb&bg=007bff&fg=007bff&size=1" alt="" class="mr-2 rounded">
				<div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
					<div class="d-flex justify-content-between align-items-center w-100">
						<strong class="text-gray-dark">Full Name</strong> <a href="#">Follow</a>
					</div>
					<span class="d-block">@username</span>
				</div>
			</div>
			<div class="media text-muted pt-3">
				<img data-src="holder.js/32x32?theme=thumb&bg=007bff&fg=007bff&size=1" alt="" class="mr-2 rounded">
				<div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
					<div class="d-flex justify-content-between align-items-center w-100">
						<strong class="text-gray-dark">Full Name</strong> <a href="#">Follow</a>
					</div>
					<span class="d-block">@username</span>
				</div>
			</div>
			<small class="d-block text-right mt-3"> 
			<a href="#">All suggestions</a>
			</small>
		</div>
	</main>

	<!-- 메인 컨텐트 끝 -->



	<!-- 푸터 시작 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<!-- <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery || document.write('<script src="js/assets/vendor/jquery-slim.min.js"><\/script>')
	</script>
	<script src="js/assets/vendor/popper.min.js"></script>
	<script src="js/bootstrap/bootstrap.min.js"></script>
	<script src="js/assets/js/vendor/holder.min.js"></script>
	<script src="js/bootstrap/offcanvas.js"></script> -->
	<!-- 푸터 끝-->
	
</body>
</html>