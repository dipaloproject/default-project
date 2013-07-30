<!-- This JSP page must be called inside the <head> tag of any JSP
    page - includes links to common stylesheets and js scripts.     
 -->
    
<%! 
	private final String BASE = "http://localhost:8080/DipaloProject";
%>

<link type="text/css" rel="stylesheet" 
		href="<%= BASE %>/styles/stylesheet.css" />
		
<script type="text/javascript" 
src="<%= BASE %>/scripts/jquery-1.9.1.js"></script>