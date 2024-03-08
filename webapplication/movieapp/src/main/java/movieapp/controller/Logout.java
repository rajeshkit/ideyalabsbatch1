package movieapp.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//String myUserName=null;
		Cookie[] cookies=request.getCookies();
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("user")) {
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
		}
	}

	
}
