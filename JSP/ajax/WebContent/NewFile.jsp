<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-1.12.4.js"
  integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
  crossorigin="anonymous"></script>
<style>
*{
margin: 0;
padding: 0;
}
</style>
</head>
<body>
<form name="testForm" id="login">
    <input type="text" id="id"/>
    <input type="text" id="pw"/>
    <input type="submit"/>
</form>
<hr/>
<button id="btn">전송</button>
    <script>
$(document).ready(function() {
    $("form").submit(function(event) {
    var id = $('#id').val();
    var pw = $('#pw').val();
     
    if (id !="" && pw !="") {
        alert("id :: " + id +", pw :: " + pw);
    }
     
    if (id =="") {
        alert("id를 입력해주세요.");
        event.preventDefault();
      return;
    }
     
    if (pw =="") {
        alert("pw를 입력해주세요.");
        event.preventDefault();
      return;
    }  
  });
   
  $('#btn').click(function () {
    $("form").submit();
  });
});
</script>
</body>
</html>