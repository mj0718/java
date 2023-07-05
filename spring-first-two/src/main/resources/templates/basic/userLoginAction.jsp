<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO" %>
<%@ page import="user.UserDTO" %>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>blog입니다.</title>
<link rel="stylesheet" href="./css/bootstrap.css">
<link rel="stylesheet" href="./css/custom.min.css">
</head>

	<%
	request.setCharacterEncoding("UTF-8");
	String userID = null;
	String userPassword = null;
	String userEmail = null;
	
	if(!request.getParameter("userID").isEmpty()){
		userID = request.getParameter("userID");
		System.out.println("userID 설정 완료!");
	}
	if(!request.getParameter("userPassword").isEmpty()){
		userPassword = request.getParameter("userPassword");
		System.out.println("userPassword 설정 완료!");
	}
	
 	if(userID==null || userPassword==null){
		System.out.println("userID 또는 userPassword가 null이다!");
		/* PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('입력되지 않은 항목이 있습니다.');");
		script.println("history.back();");
		script.println("</script>");
		script.close(); */
	} 
	
	UserDAO userDAO = new UserDAO();
	int result = userDAO.join(new UserDTO(userID, userPassword));
	if(result==1){
		session.setAttribute("userID", userID);
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("location.href='index.jsp';");
		script.println("history.back();");
		script.println("</script>");
		script.close();	
	}else if(result==0){
		session.setAttribute("userID", userID);
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('아이디, 패스워드를 다시 확인하세요.');");
		script.println("history.back();");
		script.println("</script>");
		script.close();	
	}

%>

<!-- 네비게이션 -->	
<div class="navbar navbar-expand-lg fixed-top navbar-light bg-light">
	<div class="container">
	  <a href="../" class="navbar-brand">Blog</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarResponsive">
	    <ul class="navbar-nav">
	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" id="themes">회원관리<span class="caret"></span></a>
	        <div class="dropdown-menu" aria-labelledby="dropdown">
	          <a class="dropdown-item" href="../default/">로그인</a>
	          <a class="dropdown-item" href="../default/">회원가입</a>
	          <a class="dropdown-item" href="../default/">로그아웃</a>
	        </div>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="../help/">Help</a>
	      </li>
	    </ul>
	  </div>
	</div>
</div>

<section class="container mt-3" style="max-width: 560px">
	<form method="post" action="./userLoginAction.jsp">
		<div class="form-group">
			<label for="userID">아이디</label>
			<input type="text" name="userID" id="userID" class="form-control" >
		</div>
		<div class="form-group">
			<label for="userPassword">비밀번호</label>
			<input type="password" name="userPassword" id="userPassword" class="form-control" > 
		</div>
		<button type="submit" class="btn btn-primary">로그인</button>
	</form>
</section>

<!-- Footer -->
<footer class="py-5 bg-dark mt-4">
  <div class="container">
    <p class="m-0 text-center text-white">Copyright &copy; Your Website 2020</p>
  </div>
  <!-- /.container -->
</footer>

<script src="./js/jquery.min.js"></script>
<script src="./js/bootstrap.bundle.min.js"></script>
<script src="./js/custom.js"></script>
</body>
</html>