<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
    	$(document).ready(function(){
    		document.getElementById("logout").onclick = function(){
    			if(confirm("로그아웃하시겠습니까?") == true){
    				location.href="logout.do";
    			}
    		}
    	})
    </script>
</head>
<body>
	<h1>LIST</h1>
	<input type="button" value="logout" id="logout">
	<table border="1">
		<colgroup>
			<col width="50"/>
			<col width="100"/>
			<col width="300"/>
			<col width="100"/>
		</colgroup>
		
		<tr>
			<th>NO</th>
			<th>WRITER</th>
			<th>TITLE</th>
			<th>DATE</th>
		</tr>
		
		<c:choose>
			<c:when test="${empty boardList }">
				<tr>
					<td colspan="4" align="center">
						작성글 없음
					</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${boardList}" var="list">
					<tr>
						<td align="center">${list.myno }</td>
						<td align="center">${list.myname }</td>
						<td align="center"><a href="detail.do?myno=${list.myno }">${list.mytitle }</a></td>
						<td align="center">${list.mydate }</td>						
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		
		<tr>
			<td colspan="4" align="right">
				<input type="button" value="WRITE" onclick="location.href='insertform.do'"/>
			</td>
		</tr>
	</table>
















</body>
</html>