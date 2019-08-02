<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원 검색</title>
</head>

<body>
	<div align="center">
		<form method="post" action="/firstPro/search.do">
			<input type="hidden" name="test" value="paramtest">
			<h1>회원 검색</h1>
			<h3>
				주소:<input type="text" name="addr"/>
				 <input type="submit"
					value="검색">
			</h3>
		</form>
	</div>

</body>
</html>