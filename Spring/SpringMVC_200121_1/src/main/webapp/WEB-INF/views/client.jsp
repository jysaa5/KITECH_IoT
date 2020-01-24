<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>client</title>
<!-- jQuery 사용하기 위한 것. -->
<script src="http://code.jquery.com/jquery-1.12.4.js"></script>

</head>
<body>
	<input type="button" value="저장" id="btn">


	<script>
		$(document).ready(function() {
			
			var obj = {
					id:1,
					name:'cool',
					email:'cool@hot.com',
					photo: 'cool.png'
			};

			//버튼 이벤트 연결 // .on / .click 둘 다 할 수 있음.
			$('#btn').click(function() {
				
				$.ajax({
					url:'api/members',
					type: 'POST',
					data: JSON.stringify(obj),
					contentType: 'application/json; charset=utf-8',
					/* dataType: 'json', */
					
					success: function(res){
						alert(res);	
					}
					
				});

			});

		});
	</script>

</body>
</html>