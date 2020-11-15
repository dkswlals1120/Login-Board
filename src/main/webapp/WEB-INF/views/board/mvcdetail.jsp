<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");  %>
<% response.setContentType("text/html; charset=UTF-8"); %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>DETAIL</h1>
	<table border="1">
		<tr>
			<th>WRITER</th>
			<td>${dto.myname }</td>
		</tr>
		<tr>
			<th>TITLE</th>
			<td>${dto.mytitle }</td>
		</tr>
		<tr>
			<th>CONTENT</th>
			<td>
				<textarea cols="50" rows="10" readonly="readonly">
				${dto.mycontext }
				</textarea>
			</td>
		</tr>
		<tr>
			<th>DATE</th>
			<td>${dto.mydate }</td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<input type="button" value="LIST" onclick="location.href='list.do'" />
				<input type="button" value="UPDATE" onclick="location.href='updatescreen.do?myno=${dto.myno}'" />
				<input type="button" value="DELETE" onclick="location.href='deleteres.do?myno=${dto.myno}'" />
			</td>
		</tr>
	</table>
</body>
</html>