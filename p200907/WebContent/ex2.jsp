<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "test.Mtest" %>
<%@ page import = "test.MyData" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		Mtest mtest = new Mtest();
		MyData mydata = null;
		mydata = mtest.getMyData();
	%>
	<div><%=mydata.x %></div>
	<div><%=mydata.y %></div>
	<div><%=mydata.z %></div>
	
</body>
</html>