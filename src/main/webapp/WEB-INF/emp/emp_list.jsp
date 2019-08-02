<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.*,emp.dto.*"%>
<!DOCTYPE html>
<html>
<head> 
<title>Bootstrap Example</title>
<meta charset="euc-kr">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
</head>
<body>
	<div class="container">
	<%ArrayList<EmpDTO> emplist =
			(ArrayList<EmpDTO>) request.getAttribute("emplist"); 
	 	 int size = emplist.size();
	  %>
		<table class="table">
			<thead>
				<tr>
					<th>사원코드</th>
					<th>사원명</th>
					<th>입사일</th>
					<th>등급</th>
					<th>주소</th>
					<th>부서코드</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
			<%for(int i=0;i<size;i++){ 
				EmpDTO emp =  emplist.get(i);%>
				<tr>
					<td><a
					 href="/firstPro/read.do?id=<%= emp.getId()%>"><%= emp.getId() %></a></td>
					<td><%= emp.getName() %></td>
					<td><%= emp.getHiredate() %></td>
					<td><%= emp.getGrade() %></td>
					<td><%= emp.getAddr() %></td>
					<td><%= emp.getDeptNo()%></td>
					<td><a href="/firstPro/delete.do?id=<%= emp.getId()%>">삭제</a></td>
				</tr>
			<%}%>
			</tbody>
		</table>
	</div>

</body>
</html>
