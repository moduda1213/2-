<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "test.Mtest"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		Mtest mtest = new Mtest();
		mtest.m1(); // ȣ�� -> ���� -> "m1 test.."���
		
		int result = mtest.m2(); // int result = 2;
		System.out.println("result : " + result);
		
		String result2 = mtest.getName(); // result = �����ī����
		System.out.println("result2 : " + result2);
	%>
</body>

</html>