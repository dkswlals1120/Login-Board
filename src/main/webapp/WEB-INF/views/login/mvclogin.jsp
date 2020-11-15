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
	$(function(){
		$("#loginChk").hide();
	})
	
	function login(){
		var memberId = $("#memberId").val().trim();
		var memberPw = $("#memberPw").val().trim();
		console.log(memberId+"/"+memberPw);
		
		var loginVal={
			"memberId":memberId,
			"memberPw":memberPw
		};
		
		if(memberId == null || memberId == "" || memberPw == null || memberPw == ""){
			alert("ID&PW를 확인하세요");
		}else{
			$.ajax({
				type:"POST",
				url:"ajaxlogin.do",
				data:JSON.stringify(loginVal),
				contentType:"application/json",
				dataType:"json",
				success:function(msg){
					if(msg.check == true){
						alert("로그인 성공");
						location.href="list.do";
					}else{
						$("#loginChk").show().html("ID or PW 잘못됨");
						
					}
				},
				error:function(){
					alert("통신 실패");
				}
			});
		}
	}
	
</script>
</head>
<body>
	<br>
	<h1>LOGIN</h1>
	<table>
		<tr>
			<th>ID</th>
			<td><input type="text" id="memberId"></td>
		</tr>
		
		<tr>
			<th>PW</th>
			<td><input type="password" id="memberPw"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" value="login" onclick="login();">
			<input type="button" value="sign up" onclick="location.href='signup.do'">
		</tr>
		<tr>
			<td colspan="2" align="center" id="loginChk">
		</tr>
	</table>
</body>
</html>