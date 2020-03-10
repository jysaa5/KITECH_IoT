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

<script src="https://code.jquery.com/jquery-1.12.4.js"
	integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
	crossorigin="anonymous"></script>


<style>
input[type=button] {
	background-color: #EEE;
	border: 1px solid #AAA;
	padding: 15px;
	margin: 10px;
	display: block;
	font-size: 24px;
}

.select_g {
	background-color: green;
	color: #FFF
}

</style>

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
	<div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
	<img class="mr-3" src="https://getbootstrap.com/assets/brand/bootstrap-outline.svg" alt="" width="48" height="48">
			<div class="lh-100">
				<h6 class="mb-0 text-white lh-100">게임 추천 글 작성 하기</h6>
				<small>Since 2020</small>
			</div>
		</div>
		
		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">웹캠 촬영하기</h6>
			<div class="media text-muted pt-3">
				<p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">	 </p>
			</div>
		</div>
	</main>

<input type="button" value="웹캠 촬영하기" id="btn_webcam" />
<h2 id="h"></h2>

<br>
	<!-- 메인 컨텐트 끝 -->

	<script>
		$(document).ready(function() {

			/*버튼 캐스팅 */
			$('#btn_webcam').click(function() {

				$.ajax({
					//와이파이 변경해야 함
					url : 'http://192.168.0.66:5000/webcam',

					/*res: 응답 데이터 -> 문자열로 들어옴.  */
					success : function(res) {
						console.log(res)
						if (res == 'File uploaded!') {
							$('#h').text('촬영이 완료되었습니다.');
						} else {
							$('#h').text('촬영을 다시 시도해주세요.');
						}

					}
				});

			});
		});
		
	</script>

	<!-- 푸터 시작 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
	<!-- 푸터 끝-->

</body>
</html>