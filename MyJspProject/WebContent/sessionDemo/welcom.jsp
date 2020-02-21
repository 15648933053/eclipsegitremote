<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	欢迎您：<br>
	<%
		String name = (String)session.getAttribute("uname");
		if(name != null){
			out.print(name);
		System.out.println("");
	%>
	
	<a href="invalidate.jsp">注销</a>
	
	<%
		}
		else{
			request.getRequestDispatcher("login.jsp");
		}
		
	%>
</body>
</html>