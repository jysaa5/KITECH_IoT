<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>회원가입</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"
	integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="191203_01.css">

<style>
* {
	margin: 0;
	padding: 0;
}

select.byear {
	width: 200px;
	height: 30px;
	font-size: 1.3em;
}

#nav {
	overflow: hidden;
	list-style: none;
	margin: 10px 0;
	border-top: 1px solid #999;
	border-bottom: 1px solid #999;
}

#nav>li {
	float: left;
	padding: 3px 30px;
}

.color_red {
	color: red;
}

.color_blue {
	color: blue;
}

#idcheck {
	display: none;
}
</style>

</head>
<body>
	<%@ include file="/WEB-INF/views/frame/header.jsp"%>
	<!-- 2em: 배수 표현, 기본 사이즈 16px -> 32px -->
	<h1 class="title">회원가입</h1>
	<hr>
	<form action="reg" method="post" id="form">
		<!-- 상대 경로: /op/member/regForm -> /op/member/reg -->
		<table class="inputBox">
			<tr>
				<td>아이디(이메일)</td>
				<td><input type="text" name="uid" id="uid"> <input
					type="checkbox" id="idcheck"> <span id="idchk_msg"></span>
				</td>
			</tr>

			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw" id="pw"></td>
			</tr>

			<tr>
				<td>이름</td>
				<td><input type="text" name="uname" id="uname"></td>
			</tr>

			<tr>
				<td>성별</td>
				<td>남성<input type="radio" name="gender" value="m" id="gender1">
					여성<input type="radio" name=gender value="w" id="gender2">
				</td>
			</tr>

			<tr>
				<td>태어난 년도</td>
				<td><select id="byear" class="byear" name="byear">
						<!--  <option value="2000">2000</option>
                    <option>1999</option>
                    <option>1998</option>
                    <option>1997</option>
                    <option>1996</option>
                    <option>1995</option>-->
				</select></td>
			</tr>

			<tr>
				<td>프로필 사진</td>
				<td><input type="file" name="pflie"></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="회원가입"></td>
			</tr>
		</table>
	</form>

	<script>
		$(document).ready(function() {

			var selectOption = '';

			for (var i = 2019; i >= 1950; i--) {

				selectOption += '<option value='+i+'>' + i + '</option>\n';
			}

			//회원가입시 빈 공란인 것을 체크하는 것.
			$('#form').submit(function() {

				var f_uid = $('#uid');

				if (f_uid.val().length < 1) {
					alert('아이디(이메일) 데이터를 입력해야 합니다.');
					f_uid.focus();
					return false;
				}

				var f_pw = $('#pw');
				if (f_pw.val().length < 1) {
					alert('비밀번호 입력은 필수 항목입니다.');
					f_pw.focus();
					return false;
				}

				var f_uname = $('#uname');
				if (f_uname.val().length < 1) {
					alert('이름은 입력은 필수 항목입니다.');
					f_uname.focus();
					return false;
				}

				var f_gender1 = $('#gender1').prop('checked');
				var f_gender2 = $('#gender2').prop('checked');

				if (f_gender1 == false && f_gender2 == false) {
					alert('성별체크는 필수 사항입니다.');
					return false; //submit이 처리되지 않게 한다.
				}

				var f_idcheck = $('#idcheck');
				if (!f_idcheck.prop('checked')) {
					alert('사용자의 아이디가 사용가능 유무를 체크해주셔야합니다.');
					return false;
				}

				$.ajax({

					url: 'reg_ajax',
					type: 'post',
					data: $(this).serialize(),
					success: function(data){
						if (data == 'success'){
							alert('회원가입되었습니다.');
							location.href = '../'; //index.jsp로 보냄.
						} else {
							alert('회원 가입 처리중에 오류가 발생했습니다.');
						}

					}
				});

				return false;

			});

			$('#byear').html(selectOption);

			//아이디 쓰는 칸에서 커서를 안으로 옮겼을 때.
			$('#uid').focusin(function() {

				//아이디 쓰는 칸에 공백문자 넣어주기
				$(this).val('');

				//아이디 쓰는 칸 옆에 글에 공백문자 넣어주기.
				$('#idchk_msg').text('');

				$('#idcheck').prop("checked", false);
			});

			//아이디 쓰는 칸에서 밖으로 커서를 빼내었을 때.
			$('#uid').focusout(function() {
				//alert("focusout 이벤트");

				var param = $(this).val();

				if (param.length < 3) {
					//alert('아이디는 12자리 이상의 문자만 가능합니다.');
					$('#idchk_msg').text('아이디는 12자리 이상의 문자만 가능합니다.');
					$('#idchk_msg').addClass('color_red');
					return false;
				}

				//비동기 통신: id 값을 전송 후 Y 또는 N의 값을 받는 통신.
				$.ajax({
					/* url: '/op/member/idChk', : 절대 경로*/
					url : 'idChk',
					type : 'get',
					data : {
						uid : param
					},
					success : function(data) {
						//Y or N
						//alert(data);

						//클래스 삭제
						$('#idchk_msg').removeClass('color_blue');
						$('#idchk_msg').removeClass('color_red');

						//클래스 추가
						if (data == "Y") {
							$('#idchk_msg').text('사용가능한 아이디(이메일) 입니다.');
							$('#idcheck').prop("checked", true);
							$('#idchk_msg').addClass('color_blue');

						} else {
							$('#idchk_msg').text('사용 불가한 아이디(이메일) 입니다.');
							$('#idcheck').prop("checked", false);
							$('#idchk_msg').addClass('color_red');
						}
					}

				});

			});

		});
	</script>




</body>
</html>