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
<title>Recommendation View</title>

<!-- 기본 CSS 처리 시작 -->
<%@ include file="/WEB-INF/views/include/basic.jsp"%>
<!-- 기본 CSS 처리 끝 -->
<script>
</script>
<style>
#click-home{

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

img.photo {
	width:500px;
}

#tableimg{
text-align: center;
}
</style>

</head>
<body>

	<!-- 해더 시작 -->
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<!-- 해더 끝 -->

	<!-- 메인 컨텐트 시작 -->
	<main role="main" class="container">
		<div class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
			<div class="lh-100">
				<h6 class="mb-0 text-white lh-100">스타일 추천</h6>
				<small>Since 2020</small>
			</div>
		</div>

		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">스타일 추천</h6>
			<%-- ${listView} --%>
			<table class="table">
			<%-- 	    <tr>
					<th>no</th>
					<td>${stylerRecommendationView.stylerIdx}</td>
					</tr>
					<tr>
					<th>촬영 날짜</th>
					<td><fmt:formatDate value="${stylerRecommendationView.stylerOn}" pattern="yyyy. MM. dd" /></td>
					</tr>
					<tr>
					<th>사용자</th>
					<td>${stylerRecommendationView.stylerUser}</td>
					<tr>
					<th colspan="2">사진 제목</th>
					</tr>
					<tr>
					<td>${stylerRecommendationView.stylerPhoto}</td>
					</tr>
					<tr>
					<th colspan="2">사진</th>
					</tr> --%>
					<tr>
					<td id="tableimg" colspan="2"><img src="<c:url value="/uploadfile/userphoto/${stylerRecommendationView.stylerPhoto}"/>" class="photo" alt="사진"></td>
					</tr>
				</table>
	    <div><a href="<c:url value="/styler/userList"/>"><input type="button" class="btn btn-lg btn-block btn-outline-primary" value="뒤로가기" id="click-home"/></a></div>
				<!-- 리스트 시작 -->
				<%-- <c:forEach items="${listView.list}" var="boardArticle">
					<tr>
						<td>${boardArticle.idx}</td>
						<td><a href="#">${boardArticle.title}</a></td>
						<td>${boardArticle.writer}</td>
						<td><img src="<c:url value="/uploadfile/userphoto/${boardArticle.gphoto}"/>" class="photo" alt="사진"></td>
						<td><fmt:formatDate value="${boardArticle.regdate}" pattern="yyyy. MM. dd" /></td>
						<td>
						<a href="<c:url value ="/board/edit?idx=${boardArticle.idx}"/>" class="btn btn-primary">수정</a>
						<a href="<c:url value ="/board/passwordCheck?idx=${boardArticle.idx}"/>" class="btn btn-primary">수정/삭제</a>
						<a href="<c:url value ="/board/passwordCheck?idx=${boardArticle.idx}"/>" class="btn btn-danger">삭제</a>
						<a href="<c:url value ="/board/delete?idx=${boardArticle.idx}"/>" class="btn btn-danger">삭제</a>
						</td>
					</tr>
				</c:forEach>
				<!-- 리스트 끝-->
			</table>

			<div>
				<c:forEach begin="1" end="${listView.totalPageCount}" var="i">
					<a href="<c:url value ="/board/list?page=${i}"/>">[${i}]</a>
				</c:forEach>	
			</div>
		</div>
		<div class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">게임 추천 게시글</h6>

			<c:forEach items="${listView.list}" var="boardArticle">
			
				<div class="media text-muted pt-3">
					<!--<img data-src="holder.js/32x32?theme=thumb&bg=007bff&fg=007bff&size=1" alt="" class="mr-2 rounded"> -->
					<div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
						<div class="d-flex justify-content-between align-items-center w-100">
						
						<strong class="text-gray-dark">${boardArticle.title}</strong> 
						<a href="#">${boardArticle.writer}</a> 
						
						</div>
						<span class="d-block">${boardArticle.content}</span>
					</div>
				</div>
			</c:forEach> --%>
		</div>
	</main>

	<!-- 메인 컨텐트 끝 -->

	<!-- 푸터 시작 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
	<!-- 푸터 끝-->


</body>
</html>