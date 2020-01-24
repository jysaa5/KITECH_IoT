<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>파일업로드</h1>
	<h2>@RequestParam 이용한 파일처리</h2>
	<hr>
	<form action="submit1" method="post" enctype="multipart/form-data">
		<!-- 파일을 보낼때는 get을 보내지 않는다.(get은 아스키코드로 보내짐. 그래서 양이 조금밖에 안됨.) 무조건 post로 바이너리 코드로 보내야 된다.  -->
		<!--"multipart/form-data" 멀티파트형식/폼 안에 있는 데이터 -->
		<!-- method와 enctype은 무조건 들어가야됨. 필수임. -->

		학번: <input type="text" name="sno"> <br> 리포트 파일: <input
			type="file" name="report"> <br> <input type="submit">

	</form>


	<h2>MulipartHttpServletRequest 이용한 파일처리</h2>
	<hr>
	<form action="submit2" method="post" enctype="multipart/form-data">
		<!-- 파일을 보낼때는 get을 보내지 않는다.(get은 아스키코드로 보내짐. 그래서 양이 조금밖에 안됨.) 무조건 post로 바이너리 코드로 보내야 된다.  -->
		<!--"multipart/form-data" 멀티파트형식/폼 안에 있는 데이터 -->
		<!-- method와 enctype은 무조건 들어가야됨. 필수임. -->

		학번: <input type="text" name="sno"> <br> 리포트 파일: <input
			type="file" name="report"> <br> <input type="submit">

	</form>


	<h2>커맨드 객체를 이용한 파일처리</h2>
	<hr>
	<form action="submit3" method="post" enctype="multipart/form-data">
		<!-- 파일을 보낼때는 get을 보내지 않는다.(get은 아스키코드로 보내짐. 그래서 양이 조금밖에 안됨.) 무조건 post로 바이너리 코드로 보내야 된다.  -->
		<!--"multipart/form-data" 멀티파트형식/폼 안에 있는 데이터 -->
		<!-- method와 enctype은 무조건 들어가야됨. 필수임. -->

		학번: <input type="text" name="sno"> <br> 리포트 파일: <input
			type="file" name="report"> <br> <input type="submit">

	</form>



</body>
</html>