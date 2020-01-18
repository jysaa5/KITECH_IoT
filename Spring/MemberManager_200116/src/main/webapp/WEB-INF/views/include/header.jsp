<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark">
	<!-- 이 사이트/app의 타이틀이 됨. -->
	<a class="navbar-brand mr-auto mr-lg-0" href="<c:url value ="/"/>">MemberManager</a>

	<!-- 모바일화면으로 변했을 때 보이는 부분 -->
	<button class="navbar-toggler p-0 border-0" type="button" data-toggle="offcanvas">
		<span class="navbar-toggler-icon"></span>
	</button>

	<!-- 메뉴 -->
	<div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault">
		<ul class="navbar-nav mr-auto">
			<!-- "nav-item active 해주면 활성화된 거처럼 글자가 하얗게 변함. -->
			<li class="nav-item"><a class="nav-link" href="<c:url value ="/"/>">HOME
			<span class="sr-only">(current)</span></a></li>
			<li class="nav-item"><a class="nav-link" href="<c:url value ="/member/insert"/>">회원가입</a></li>
			<li class="nav-item"><a class="nav-link" href="<c:url value ="/member/login"/>">회원로그인</a></li>
			<li class="nav-item"><a class="nav-link" href="#">회원로그아웃</a></li>
			<li class="nav-item"><a class="nav-link" href="<c:url value ="/member/list"/>">회원리스트</a></li>

			<!-- 큰 메뉴의 작은 메뉴들 -->
			<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="https://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">방명록</a>
				<div class="dropdown-menu" aria-labelledby="dropdown01">
					<a class="dropdown-item" href="<c:url value ="/guest/write/"/>">방명록 작성</a> 
					<a class="dropdown-item" href="<c:url value ="/guest/list/"/>">방명록 리스트 보기</a>
				</div>
			</li>
		</ul>

		<!-- 오른쪽에 검색영역 -->
		<!-- 	<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search"
					aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form> -->
	</div>
</nav>