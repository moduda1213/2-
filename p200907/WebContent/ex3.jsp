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
		//add �޼��� ȣ��
		Mtest mtest = new Mtest(); // Ŭ��������(��ü����) mtest
		int result = mtest.add(3,5);
		
		//Math.random(); -- static �޼��� random -> public static double random(....)
		Mtest.hello();// -- static �޼��� ȣ��
	%>
	<div><%=result %></div>
</body>
</html>