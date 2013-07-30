<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Login | Dipalo Mathematics Tool</title>
<%@include file="../../common/master/header.jsp" %>
</head>
<body>

		<!-- the top menu bar -->
		<%@include file="../../common/master/topMenuBar.jsp" %>
		
		
		<!-- the main division -->
		<div class="main">
			
			<%@include file="../../common/master/emptyBubbleArea.jsp" %>
		
			<!-- the main content area -->
			<div class="mainContent">
				<form id="loginForm" method="post" action="/accounts/authenticateUser">
				</form>
			</div>
		</div>
	
</body>
</html>