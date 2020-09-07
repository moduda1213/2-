<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "test.Mtest" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		//add 메서드 호출
		Mtest mtest = new Mtest(); // 클래스변수(객체변수) mtest
		int result = mtest.add(3,5);
		
		//Math.random(); -- static 메서드 random -> public static double random(....)
		Mtest.hello();// -- static 메서드 호출
	%>
	<div><%=result %></div>
</body>
</html>