<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>스프링에서 응답한 뷰</h1>
	<hr/>
	<h2>jsp코드로 출력하기:<%=request.getAttribute("msg") %></h2>
	<h2>EL로 출력하기: ${msg }</h2>
</body>
</html>