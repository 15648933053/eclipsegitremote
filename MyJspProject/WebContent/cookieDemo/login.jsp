<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		String uname;
	%>

	<%
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("uname")){
				uname = cookie.getValue();
			}
		}
	
	%>

	<form action="check.jsp" method="post">
			用户名：<input type="text" name="uname" value="<%=(uname==null?"":uname) %>" />
			密码：<input type="password" name="upwd" />
		 	<input type="submit" value="登录" />
	</form>
</body>
</html>