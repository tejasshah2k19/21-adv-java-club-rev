package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCookieServlet")
public class AddCookieServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");

		// now set name in cookie

		// create cookie object with cookie name and value
		Cookie c = new Cookie("userName", name);

		
		c.setMaxAge(60*60*24);//seconds
		// set cookie into browser
		response.addCookie(c);

		response.sendRedirect("index.jsp");// go to index.jsp

	}
}
