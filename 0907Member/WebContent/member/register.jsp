<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입</h2>
	
	<img src="../Icon.png" />
	<form autocomplete="off" action="insert" method="post">
		<label for="email">이메일</label>
		<input type="email" name="email" id="email"
		required="required" />
		<span id="emailmsg"></span><br />
		<label for="pw">비밀번호</label>
		<input type="password" name="pw" id="pw"
		required="required" /><br />
		<label for="name">이름</label>
		<input type="text" name="name" id="name"
		required="required" /><br />
		<label for="phone">전화번호</label>
		<input type="tel" name="phone" id="phone"
		required="required" /><br />
		<label for="addr">주소</label>
		<input type="text"size="100" 
		name="addr" id="addr"
		required="required" /><br />
		
		<input type="submit" value="회원가입" />
		<input type="button" value="메인으로"
		onclick="location.href='../'" />
		
	</form>
</body>
<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
<script>
	var email = document.getElementById("email")
	var emailmsg = document.getElementById("emailmsg")
	//이메일 중복검사 통과 여부를 저장할 변수
	var emailcheck = false;
	
	
	email.addEventListener("blur", function(){
		//alert("포커스 이동")
		
		//이메일에 입력된 값 가져오기
		var value = email.value
		
/* 		
		$.ajax({
			url:'emailcheck',
			data:{'email':value},
			dataType:'json',
			success:function(result){
				alert(result.result)
			}
		});
 */

		$.ajax({
			url:'emailcheck',
			data:{'email':value},
			dataType:'json',
			//success:function(result){
				success:function(data){
				if(result.result == true){
					emailmsg.innerHTML = 
						'사용 불가능한 아이디입니다.'
					emailmsg.style.color = "red";
					
					emailcheck = false;
				}else{
					emailmsg.innerHTML = 
						'사용 가능한 아이디입니다.'
					emailmsg.style.color = "blue";
					emailcheck = true
				}
			}
		});
	});
	
	//폼의 데이터를 전송할 때
	document.getElementById("registerform").addEventListener("submit", function(e)){
		var event = e || window.event
		if(emailcheck == false) {
			alert("이메일 중복체크를 하세요!!!")
			emailmsg.innerHTML="이메일 중복 체크를 다시 하세요"
			//이벤트 발생시 기본적으로 수행하는 내용하지 않기
			//폼의 데이터가 전송되지 않습니다.
			email.focus()
			event.preventDefault();
		}
	})
</script>
</html>

