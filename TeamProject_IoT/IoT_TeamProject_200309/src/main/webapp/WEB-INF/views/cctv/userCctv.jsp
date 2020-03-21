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

<script src="https://code.jquery.com/jquery-1.12.4.js"
	integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
	crossorigin="anonymous"></script>

<style>
#btn_on, #btn_off {
	padding: auto 0px;
	margin: auto 0px;
	display: block;
	font-size: 24px;
	width: 200px;
	height: 60px;
	text-align: center;
	display: table;
	margin-left: auto;
	margin-right: auto;
}

#click-home {
	padding: auto 0px;
	margin: auto 0px;
	display: block;
	font-size: 24px;
	width: 200px;
	height: 60px;
	text-align: center;
	display: table;
	margin-left: auto;
	margin-right: auto;
}

#cctvSetting {
    width:auto;
	height: auto;
	padding: auto;
	margin: auto;
	text-align: center;
}

 tbody {
	padding: auto;
	margin: auto;
	text-align: center;
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
		<div
			class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
			<div class="lh-100">
				<h6 class="mb-0 text-white lh-100">실시간 CCTV 촬영본 보기</h6>
				<small>Since 2020</small>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">실시간 CCTV 촬영본 보기</h6>
			<div class="media text-muted pt-3">
				<p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray"> </p>
			</div>
			<table class="cctvSetting media text-muted pt-3">
				<tr>
					<td><iframe src="http://192.168.0.63:8033" height="540" width="898" scrolling="yes" frameborder="1">
					CCTV 연결을 확인해주세요.
					</iframe></td>
				</tr>
				<tr>
					<td><h3>카메라 실시간 컨트롤러</h3>
						<h3 style="font-size: 20px" style="cursor: hand;" title="카메라의 좌우방향을 조정합니다.">Left-------Right</h3> 
						<input type="range" id="br_val" min="2" max="25" value="0"> 
						<span id="num">0</span>
						<h3 style="font-size: 20px" style="cursor: hand" title="카메라의 상하방향을 조정합니다.">up-------down</h3> 
						
						<input type="range" id="br_val2" min="2" max="7" value="0"> <span id="num2">0</span>

					</td>

				</tr>
				<tr>
					<td>

						<h3 style="cursor: hand;"
							title="저장되는 사진과 영상의 화질 setting 값입니다.
                                     0=(320,240),
                                     1=(640,480), 
                                     2=(1024,768), 
                                     3=(1280, 960),
                                     4=(1440, 900),
                                     5=(1680, 1050), 
                                     6=(1920,1200)  ">Setting</h3>
						<h3 style="font-size: 20px">low-------highest</h3> <input
						type="range" id="s_val" min="0" max="6" value="0"> <span
						id="num3">0</span>



					</td>
				</tr>

			</table>
			<!-- 	<input type="button" value="CCTV on" id="cbtn_on"><br>
	        <input type="button" value="CCTV off" id="cbtn_off"><br> -->

			<div>
				<a href="<c:url value="/"/>"><input type="button"
					class="btn btn-lg btn-block btn-outline-primary" value="Home"
					id="click-home" /></a>
			</div>
		</div>
	</main>


	<br>
	<!-- 메인 컨텐트 끝 -->

	<script>
		$('#br_val').change(function() {
			$('#num').text($(this).val())
			$.ajax({
				url : 'http://192.168.0.78:5050/RL',
				data : {
					moter : 'm',
					p_val : $('#br_val').val()
				},
				method : 'get'

			});
		});

		$('#br_val2').change(function() {
			$('#num2').text($(this).val())
			$.ajax({
				url : 'http://192.168.0.78:5050/UD',
				data : {
					moter2 : 'm2',
					p_val2 : $('#br_val2').val()
				},
				method : 'get'

			});
		});

		$('#s_val').change(function() {
			$('#num3').text($(this).val())
			$.ajax({
				url : 'http://192.168.0.78:5050/setting',
				data : {
					moter3 : 'm3',
					p_val3 : $('#s_val').val()
				},
				method : 'get'

			});
		});
	</script>

	<!-- 푸터 시작 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
	<!-- 푸터 끝-->

</body>
</html>