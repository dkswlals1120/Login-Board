<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>UPDATE</h1>
	<form action="updateres.do" method="POST">
	<input type="hidden" name="myno" value="${dto.myno }">
		<table border="1">
			<tr>
				<th>WRITER</th>
				<td>${dto.myname }</td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td><input type="text" value="${dto.mytitle }" name="mytitle"></td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td>
					<textarea cols="50" rows="10" name="mycontext">
					${dto.mycontext }
					</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="COMPLETE">
					<input type="button" value="CANCEL" onclick="location.href='list.do'">	
				</td>
			</tr>
		</table>
	</form>
</body>
</html>