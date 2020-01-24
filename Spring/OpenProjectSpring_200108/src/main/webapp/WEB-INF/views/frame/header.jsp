<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!-- 수정해야됨. -->
<div id="header">

	<h1>Member Manager: MVC 패턴 이용</h1>

	<ul id="nav">
		<li><a href="<c:url value="/" />">홈</a></li>
		<li><a href="<c:url value="/member/list" />">회원 리스트</a></li>
		<li><a href="<c:url value="/member/regForm" />">회원 가입</a></li>

		<c:if test="${loginInfo eq null}">
			<li><a href="<c:url value="/login/loginForm" />">로그인</a></li>
		</c:if>
		<li><a href="<c:url value="/users/mypage" />">마이페이지</a></li>

		<c:if test="${loginInfo ne null}">
			<li><a href="javascript:logout();">로그아웃</a></li>
		</c:if>
	</ul>
</div>

<!-- 구글로그인 -->
<!-- Insert these scripts at the bottom of the HTML, but before you use any Firebase services -->
<!-- Firebase App (the core Firebase SDK) is always required and must be listed first -->
<script src="https://www.gstatic.com/firebasejs/6.2.0/firebase-app.js"></script>
<!-- Add Firebase products that you want to use -->
<script src="https://www.gstatic.com/firebasejs/6.2.0/firebase-auth.js"></script>
<!-- <script src="https://www.gstatic.com/firebasejs/6.2.0/firebase-firestore.js"></script> -->

<script>
//구글 로그인//
// Your web app's Firebase configuration
  var firebaseConfig = {
    apiKey: "AIzaSyCRvSUzk-3w9x6IoD18yQJKczEEwwWQ9Z4",
    authDomain: "kite-iot-9325e.firebaseapp.com",
    databaseURL: "https://kite-iot-9325e.firebaseio.com",
    projectId: "kite-iot-9325e",
    storageBucket: "kite-iot-9325e.appspot.com",
    messagingSenderId: "325321039250",
    appId: "1:325321039250:web:60f1fd1ad74261724fb54b"
  };
  // Initialize Firebase
  firebase.initializeApp(firebaseConfig);
  
  //google
  var provider = new firebase.auth.GoogleAuthProvider();

  provider.setCustomParameters({
	  'login_hint': 'user@example.com'
	});
  
  //사용자의 로그인 여부 확인: 사용자 정보를 출력
  function userInfoGoogle(){
	  
	  firebase.auth().onAuthStateChanged(function(user) {
		  if (user) {
		    // User is signed in.
		    var displayName = user.displayName;
		    var email = user.email;
		    var emailVerified = user.emailVerified;
		    var photoURL = user.photoURL;
		    var isAnonymous = user.isAnonymous;
		    var uid = user.uid;
		    var providerData = user.providerData;
		    
		   alert(displayName+':'+email);
		   
		    $('#login').css('display','none');
		    $('#logout').css('display','block');
		    $('#info').css('display','block');
		    // ...
		  } else {
		    // User is signed out.
		    // ...
		    //alert('로그인이 필요합니다.');
		    //location.href='google_1.html';
		  }
		});
  }
  
  
  
  
  //구글 로그아웃
  function signOutGoogle(){
	  
	  firebase.auth().signOut().then(function() {
		  
		  // Sign-out successful.
		    $('#login').css('display','block');
		    $('#logout').css('display','none');
		    $('#info').css('display','none');
			alert('정상적으로 로그아웃 되었습니다.');
		}).catch(function(error) { //여기 오류 아님.
		  // An error happened.
		});
  }
  
 
  //구글 로그인 팝업(popup)
  function signInGoogle(){
	  
	  firebase.auth().signInWithPopup(provider).then(function(result) {
		  // This gives you a Google Access Token. You can use it to access the Google API.
		  var token = result.credential.accessToken; //로그인 가능하게 함. 
		  // The signed-in user info.
		  var user = result.user;
		  //alert(JSON.stringify(user));
		  
		  $.ajax({
			
			  url: 'kakaoLogin', // /op/login/kakaoLogin
			  data: {
				  email: user.email,
				  nickname: user.displayName,
				  gender: null,
				  birthday: 0,
				  photo: user.photoURL
			  },
			  
			  success: function (data){
				  if(data == 'login'){
					  
					  location.href = '../users/mypage';
				  }
				  
			  }
			  
		  });  
		  
		  // ...
		}).catch(function(error) {//오류발생처리
		  // Handle Errors here.
		  var errorCode = error.code;
		  var errorMessage = error.message;
		  // The email of the user's account used.
		  var email = error.email;
		  // The firebase.auth.AuthCredential type that was used.
		  var credential = error.credential;
		  // ...
		});
  }

</script>


<!-- 카카오로그인 -->
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
<script type='text/javascript'>
		Kakao.init('3b150aba63158d11bc6d99366b133c55');
		
		//로그인 상태 표시.
		function statusWithKakao() {
			Kakao.Auth.getStatusInfo(function(statusObj) {
				alert(JSON.stringify(statusObj));

				if (statusObj.status=='connected') {
					alert('로그인 상태입니다.');

				} else if (statusObj.status=='not_connected') {
					alert('로그인이 필요합니다.');
					logInWithKakao();
				}

			});
		}
		
		
		//로그아웃
		function logoutWithKako(){
			
			Kakao.Auth.logout(function(){

				$('#btn_login').css('display', 'block');
				$('#btn_logout').css('display', 'none');
				//$('#status').css('display', 'none');
				$('#info').css('display', 'none');
				alert('로그아웃 되었습니다.');
			});
		}
		
		
		
		//로그인유저 정보 가져오기.
		function infoWithKako() {

			Kakao.API.request({
				url : '/v2/user/me',
				success : function(user) {
					
					alert(user.kakao_account.email);
					alert(user.kakao_account.profile.nickname);
					alert(user.kakao_account.profile.thumbnail_image_url);
					alert(user.kakao_account.profile.profile_image_url);
					alert(user.kakao_account.birthday);
					alert(user.kakao_account.gender);
					alert(user.kakao_account.age_range);
				},
				fail : function(error) {
					alert(JSON.stringify(error));

				}

			});

		}

	

		//로그인 함수
		function logInWithKakao() {
			Kakao.Auth.login({
				success : function(Obj) {//매개변수 규칙을 따로 없다.
				
					alert('로그인되었습니다.');
				
					Kakao.API.request({
						url : '/v2/user/me',
						success : function(user) {
							//서비스의 서버쪽으로 사용자의 데이터를 전송
							
							$.ajax({
								url: 'kakaoLogin', // /op/login/kakaoLogin
								data: {
									
									email: user.kakao_account.email,
									nickname: user.kakao_account.profile.nickname,
									gender: user.kakao_account.gender,
									birthday: user.kakao_account.birthday,
									//photo: user.kakao_acccount.profile.profile_image
								},
								
								success: function(data){
									
									if(data=='login'){
										location.href = '../users/mypage';
									}
								}
								
							});
							},
							fail: function(error){
							alert(JSON.stringify(error));
							}
							});
				},
	
				fail : function() {
					alert('error');
				}

			});

		}


function logout(){
	location.href='<c:url value="/login/logout"/>';	
	logoutWithKako();
	signOutGoogle();
}

</script>



