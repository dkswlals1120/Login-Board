<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");  %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	
	//아이디
	var idJ = /^[A-Za-z0-9][A-Za-z0-9_\-]{3,19}$/;
	//비밀번호
	var pwJ = /^[A-Za-z0-9]{4,12}$/;
	
	$(document).ready(function(){
		//아이디
		$("#memberId").blur(function(){
			if($("#memberId").val()==''){
				$("#id_check").text('아이디를 입력하세요');
				$("#id_check").css('color','red');
			}else if(idJ.test($("#memberId").val())==false){
				$("#id_check").text('4~12자의 영문,숫자만 사용 가능합니다.');
				$("#id_check").css('color','red');
			}else if($("#memberId").val()!='' && idJ.test($("#memberId").val())==true){
				$("#id_check").hide();
			}
		})
		
		//비밀번호
		$("#memberPw").blur(function(){
			if($("#memberPw").val()==''){
				$("#pw_check1").text('비밀번호를 입력하세요');
				$("#pw_check1").css('color','red');
			}else if(pwJ.test($("#memberPw").val())==false){
				$('#pw_check1').text('4~12자의 영문, 숫자만 사용 가능합니다.');
				$('#pw_check1').css('color', 'red');
			}else if($("#memberPw").val()!='' && pwJ.test($("#memberPw").val())==true){
				$("#pw_check1").hide();
			}
		})
		
		//비밀번호 중복 확인
		$("#memberPw_check").blur(function(){
			if($("#memberPw_check").val()==''){
				$("#pw_check2").text('비밀번호를 입력하세요');
				$("#pw_check2").css('color','red');
			}else if($("#memberPw_check").val() != $("#memberPw").val()){
				$('#pw_check2').text('비밀번호가 다릅니다.');
				$('#pw_check2').css('color', 'red');
			}else if($("#memberPw_check").val() == $("#memberPw").val()){
				$('#pw_check2').css('color', 'blue');
				$('#pw_check2').text('비밀번호가 일치합니다.');
			}
		})
		
		//이름
		$("#memberName").blur(function(){
			if($("#memberName").val() ==''){
				$("#name_check").text('이름을 입력하세요');
				$("#name_check").css('color','red');
			}else if($("#memberName").val() !=''){
				$('#name_check').css('color', 'blue');
				$('#name_check').text('이름 확인 완료!');
			}
		})
		
		//휴대폰
		$("#memberPhone").blur(function(){
			if($("#memberPhone").val() == ''){
				$("#phone_check").text('번호를 입력하세요');
				$("#phone_check").css('color','red');
			}else if($("#memberPhone").val() !=''){
				$('#phone_check').css('color', 'blue');
				$('#phone_check').text('번호 확인 완료!');
			}
		})
		
		//주소
		$("#memberAddr").blur(function(){
			if($("#memberAddr").val() == ''){
				$("#addr_check").text('주소를 입력하세요');
				$("#addr_check").css('color','red');
			}else if($("#memberAddr").val() !=''){
				$('#addr_check').css('color', 'blue');
				$('#addr_check').text('주소 확인 완료!');
			}
		})
		
		//submit 버튼시 확인
		$("#submit").on("click",function(){
			if($("#memberId").val()==""){
				alert("아이디를 입력해주세요.");
				$("#memberId").focus();
				return false;
			}
			if($("#memberPw").val()==""){
				alert("비밀번호를 입력해주세요.");
				$("#memberPw").focus();
				return false;
			}
			if($("#memberPw_check").val()==""){
				alert("비밀번호를 일치시켜주세요.");
				$("#memberPw_check").focus();
				return false;
			}
			if($("#memberName").val()==""){
				alert("이름을 입력해주세요.");
				$("#memberName").focus();
				return false;
			}
			if($("#memberPhone").val()==""){
				alert("휴대폰 번호를 입력해주세요.");
				$("#memberPhone").focus();
				return false;
			}
			if($("#memberAddr").val()==""){
				alert("주소를 입력해주세요.");
				$("#memberAddr").focus();
				return false;
			}
		})
		
	})
	
	
	

	
</script>
</head>
<body>
	<h1>회운가입하세요</h1>
	<form action="signupres.do" method="POST" id="memberCheck">
	<div>
	<label>ID</label>
	<input type="text" name="memberId" id="memberId"><br>
	<div id="id_check"></div>
	</div>
	
	<div>
	<label>PASSWORD</label><br>
	<input type="password" name="memberPw" id="memberPw"><br>
	<div id="pw_check1"></div>
	</div>
	
	<div>
	<label>PASSWORD CONFIRM</label><br>
	<input type="password"  id="memberPw_check"><br>
	<div id="pw_check2"></div>
	</div>
	
	<div>
	<label>NAME</label>
	<input type="text" name="memberName" id="memberName"><br>
	<div id="name_check"></div>
	</div>
	
	<div>
	<label>PHONE</label>
	<input type="text" name="memberPhone" id="memberPhone"><br>
	<div id="phone_check"></div>
	</div>
	
	<div>
	<label>ADDR</label>
	<input type="text" name="memberAddr" id="memberAddr">
	<div id="addr_check"></div>
	</div>
	
	<p>
	<input type="submit" value="OK" id="submit">
	<input type="button" value="CANCEL" onclick="location.href='loginform.do'">
	</p>
	
	</form>
</body>
</html>