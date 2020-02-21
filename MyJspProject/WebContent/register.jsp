<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="show.jsp">
		用户名：<input type="text" name="uname" /><br>
		密码：<input type="password" name="upwd"/><br>
		年龄：<input type="text" name="uage"/><br>
		爱好:<br>
		<input type="checkbox" name="uhobbies" value="足球"/>足球、
		<input type="checkbox" name="uhobbies" value="蓝球"/>篮球、
		<input type="checkbox" name="uhobbies" value="乒乓球"/>乒乓球<br>
		<input type="submit" value="注册">
	</form>
</body>
</html>