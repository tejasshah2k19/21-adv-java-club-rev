package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupController")
public class SignupController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String firstName = request.getParameter("firstName");
		String password = request.getParameter("password");

		boolean isError = false;
		if (email == null || email.trim().length() == 0) {
			request.setAttribute("emailError", "Please Enter Email");
			isError = true;
		}else {
			request.setAttribute("emailValue", email);
		}

		if (password == null || password.trim().length() == 0) {

			request.setAttribute("passwordError", "Please Enter Password");
			isError = true;
		}else {
			request.setAttribute("passwordValue", password);
		}
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}else {
			request.setAttribute("firstNameValue", firstName);
		}

		// isError => true => Signup
		// isError => false => Home

		RequestDispatcher rd = null;
		if (isError == true) {
			rd = request.getRequestDispatcher("Signup.jsp");
		} else {
			rd = request.getRequestDispatcher("Home.jsp");
		}

		rd.forward(request, response);
	}
}
