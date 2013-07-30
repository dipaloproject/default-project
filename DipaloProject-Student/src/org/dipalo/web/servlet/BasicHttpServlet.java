package org.dipalo.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dipalo.model.User;
import org.dipalo.model.enumeration.UserRole;

/**
 * Servlet implementation class BasicHttpServlet
 */
@WebServlet("/basicHttpService")
public abstract class BasicHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected User currentlyLoggedInUser;
	protected final static String USER_TAG = "LOGGED_IN_USER";
    
    public BasicHttpServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* check if the user is currently logged in */
		User user = getCurrentlyLoggedInUser(request);
		if (user == null || user.getRole() == UserRole.GuestUser) {
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* check if the user is currently logged in */
	}
	
	private User getCurrentlyLoggedInUser(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		currentlyLoggedInUser = (User)session.getAttribute(USER_TAG);
		return currentlyLoggedInUser;
	}
}
