package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddSessionServlet")
public class AddSessionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		HttpSession session = request.getSession(); // session -> current user 
		String name = request.getParameter("name");
		session.setAttribute("userName", name);
		
//		session.setMaxInactiveInterval(60*60*24);
		
		response.sendRedirect("index.jsp");
	
	}
}
