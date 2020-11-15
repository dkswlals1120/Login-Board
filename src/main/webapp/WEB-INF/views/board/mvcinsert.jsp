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
	<h1>WRITE</h1>
	<form action="insertres.do" method="POST">
		
		<table border="1">
			<tr>
				<th>WRITER</th>
				<td>
					<input type="text" name="myname">
				</td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td>
					<input type="text" name="mytitle">
				</td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td>
					<textarea rows="10" cols="50" name="mycontext"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="WRITE" />
					<input type="button" value="CANCEL" onclick="location.href='list.do'"/>
				</td>
			</tr>
			
			
			
			
			
			
			
			
			
			
			
			
		</table>
		
	</form>
</body>
</html>