<!-- This is the top menu bar that appears on top of every JSP page. -->

<div class="topMenuBar" id="topMenuBar">
	<img alt="avatar" src="<%= BASE %>/images/default avatar.png" class="avatarOnTopMenuBar" />
	
	<p class="loggedInUser">Hey there, Visitor</p>
	<ul class="topMenuBarLeftList">
		<li><a class="topMenuBarMenuLink" href="/myAccount" title="Account">Account</a></li>
		<li><a class="topMenuBarMenuLink" href="/myPreferences" title="Preferences">Preferences</a></li>
	</ul>
	<ul class="topMenuBarRightList">
		<li><a class="topMenuBarMenuLink" href="<%= BASE %>/pages/account/login.jsp" title="Login">Login</a></li>
		<li><a class="topMenuBarMenuLink" href="/Register" title="Register">Register</a></li>
		<li><a class="topMenuBarMenuLink" href="/About" title="About">About</a></li>
		<li><a class="topMenuBarMenuLink" href="/Help" title="Help">Help</a></li>
		<li><a class="topMenuBarMenuLink" href="/ContactUs" title="Contact Us">Contact Us</a></li>
	</ul>
</div>