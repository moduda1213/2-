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
		mtest.m1(); // 호출 -> 실행 -> "m1 test.."출력
		
		int result = mtest.m2(); // int result = 2;
		System.out.println("result : " + result);
		
		String result2 = mtest.getName(); // result = 구디아카데미
		System.out.println("result2 : " + result2);
	%>
</body>

</html>