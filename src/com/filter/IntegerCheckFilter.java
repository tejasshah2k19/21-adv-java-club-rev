package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class IntegerCheckFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// logic
		System.out.println("IntegerCheckFilter --called");

		// logic --> back
		boolean isError = false;
		try {
			Integer.parseInt(request.getParameter("n1"));

		} catch (Exception e) {
			isError = true;
		}

		if (isError == true) {
			request.getRequestDispatcher("InputNumbers.jsp").forward(request, response);
		} else {
			chain.doFilter(request, response);// go ahead
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
