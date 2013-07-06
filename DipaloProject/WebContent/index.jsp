<!-- Page Path Name: /index.jsp | Created: June 6, 2013
	 Description: ?
	 Author: Maleka, T
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
		
		<link type="text/css" rel="stylesheet" href="styles/stylesheet.css" />
		<script type="text/javascript" src="scripts/jquery-1.9.1.js"></script>
		
	</head>
	<body>
	
		<!-- the top menu bar  -->
		<div class="topMenuBar" id="topMenuBar">
			<img alt="avatar" src="images/default avatar.png" class="avatarOnTopMenuBar" />
			<p class="loggedInUser">Hey there, Visitor</p>
			<ul class="topMenuBarLeftList">
				<li><a class="topMenuBarMenuLink" href="/myAccount" title="Account">Account</a></li>
				<li><a class="topMenuBarMenuLink" href="/myPreferences" title="Preferences">Preferences</a></li>
			</ul>
			<ul class="topMenuBarRightList">
				<li><a class="topMenuBarMenuLink" href="/Login" title="Login">Login</a></li>
				<li><a class="topMenuBarMenuLink" href="/Register" title="Register">Register</a></li>
				<li><a class="topMenuBarMenuLink" href="/About" title="About">About</a></li>
				<li><a class="topMenuBarMenuLink" href="/Help" title="Help">Help</a></li>
				<li><a class="topMenuBarMenuLink" href="/ContactUs" title="Contact Us">Contact Us</a></li>
			</ul>
		</div>
		
		<!-- the main division -->
		<div class="main">
			<!-- the bubbles menu division -->
			<div class="bubbleHeaderArea">
				<img alt="dipalo logo" src="images/dipalo logo.png" class="dipaloLogoInBubbleArea" />
				<img alt="chapters" src="images/chapters bubble.png" class="chaptersBubbleImage" />
				<img alt="my progress" src="images/my progress bubble.png" class="myProgressBubbleImage" />
				<img alt="assessments" src="images/assessments bubble.png" class="assessmentsBubbleImage" />
				<img alt="milestones" src="images/milestones bubble.png" class="milestonesBubbleImage" />
			</div>
			<!-- the main content area -->
			<div class="mainContent"></div>
		</div>
	
	</body>
</html>