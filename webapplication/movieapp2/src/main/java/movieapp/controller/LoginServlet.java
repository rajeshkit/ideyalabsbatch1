package movieapp.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myUserName=request.getParameter("username");
		String myPassword=request.getParameter("password");
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("user", myUserName);
		response.setContentType("text/html");
		
		response.getWriter().append("Login Success:Welcome "+myUserName+"<br><br>")
		.append("My password is: "+myPassword+"<br><br>").append("<a  href='book'>Book Ticket</a><br><br>")
		.append("<a  href='history'>History</a><br><br>")
		.append("<a  href='logout'>Logout</a><br><br>");
	}

}
