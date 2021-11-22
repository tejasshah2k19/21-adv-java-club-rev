package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/AddNumController")
public class InputValidationFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");

		boolean isError = false;

		if (n1 == null || n1.trim().length() == 0) {
			isError = true;
			request.setAttribute("n1Error", "Please Enter No.1 ");
		}
		if (n2 == null || n2.trim().length() == 0) {
			isError = true;
			request.setAttribute("n2Error", "Please Enter No.2 ");
		}

		if (isError == true) {
			request.getRequestDispatcher("InputNumbers.jsp").forward(request, response);
		} else {
			chain.doFilter(request, response);// go ahead --> next filter --> servlet
		}

	}
}
