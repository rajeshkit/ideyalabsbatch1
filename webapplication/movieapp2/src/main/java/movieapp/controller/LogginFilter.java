package movieapp.controller;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
@WebFilter(urlPatterns = {"/book"})

public class LogginFilter implements Filter {

 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Client request intercepted Logging filter");
	
		System.out.println(request.getServletContext().getContextPath());
		System.out.println(request.getServletContext().getServerInfo());
		
		chain.doFilter(request, response);
		System.out.println("Booking servlet response intercepted Logging filter");
	}

	

}
