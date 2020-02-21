<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<%!
		public String bookname;//全局变量
		public void init(){
			Date date = new Date();
			bookname = "Java书"+date;
		}
	%>
	+++hello index1   你好.....+++
	
	<%
		String name = "zhangsan";
		out.print("<font color='red'>hello </font>"+name+"<br/>");
		init();
	%>
	
	<%="he<br/>llo "+bookname %>
</body>
</html>