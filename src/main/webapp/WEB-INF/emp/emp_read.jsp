<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="emp.dto.*"%>

<!DOCTYPE html>
<html>
<head> 
 <title>인사관리시스템</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
<body>
<!-- top에 보여질 메뉴 -->
<%-- <jsp:include page="../layout/top.jsp"></jsp:include> --%>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
    <%-- 	<jsp:include page="../layout/emp_menu.jsp"></jsp:include> --%>
    </div>
	<div class="col-sm-10">
	
			<form role="form" class="form-horizontal"
		action="/insaPro/read.do?id=${user.id}&action=UPDATE" 
		method="post">
				<fieldset>
					<div id="legend">
						<legend>아래 양식을 작성해주세요.</legend>
					</div>
					
					<div class="form-group">
						<!-- 부서코드-->
						<label class="control-label col-sm-2" for="orgtel">부서코드</label>
						<div class="col-sm-3">
							<!-- 부서코드 -->
							${user.deptNo }
						</div>
					</div>
					
					<div class="form-group">
						<!-- 사원코드 -->
						<label class="control-label col-sm-2" for="orgcode">사원코드</label>
						<div class="col-sm-3">
							<!-- 부서코드를 이곳에 출력하세요 -->
							${user.id}
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- 사원명-->
						<label class="control-label col-sm-2" for="orgname">사원명</label>
						<div class="col-sm-3">
							<!-- 사원명을 이곳에 출력하세요 -->
							${user.name }
						</div>
					</div>



				


					
					<div class="form-group">
						<!-- 패스워드-->
						<label class="control-label col-sm-2" for="orgloc">패스워드</label>
						<div class="col-sm-3">
							<!-- 부서위치를 이곳에 출력하세요 -->
								${user.pass }
						</div>
					</div>
					<div class="form-group">
						<!-- 입사일-->
						<label class="control-label col-sm-2" for="orgtel">입사일</label>
						<div class="col-sm-3">
							<!-- 부서전화번호를 이곳에 출력하세요 -->
								${user.hiredate }
						</div>
					</div>

					<div class="form-group">
						<!-- 등급과 급여-->
						<label class="control-label col-sm-2" for="orgtel">등급 및 급여</label>
						<div class="col-sm-3">
							<!-- 관리자를 이곳에 출력하세요 -->
								${user.grade }(${user.point })
						</div>
					</div>
					
					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="button" value="목록" class="btn btn-success" onclick="location.href='list.do'"/>
							<input type="submit" value="수정" class="btn btn-success"/>
						</div>
					</div>
				</fieldset>
			</form>
	</div>
	  </div>
</div>

<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>
	
</body>
</html>