package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/FirstServlet"})

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String myName = request.getParameter("name");
		String myQualification = request.getParameter("qualification");
		String myPlace=request.getParameter("place");
		response.getWriter().append("Served at: "+myName+" "+myQualification+" "+myPlace).append("from my first servlet welcome to servlet");
	//	response.sendRedirect("http://www.google.com/");
//				RequestDispatcher rd=request.getRequestDispatcher("http://www.google.com/");
//		rd.forward(request, response);
	}
	


	

}
