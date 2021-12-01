package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewRequestHeadersController")
public class ViewRequestHeadersController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Enumeration<String> headerNames = request.getHeaderNames();//
		PrintWriter pw = response.getWriter();// send data to client==browser

		response.setContentType("text/html");
		//
		while (headerNames.hasMoreElements()) {
			String n = headerNames.nextElement();
			pw.print(n + " => " + request.getHeader(n) + "<br>");
		}

		if (request.getHeader("sec-ch-ua-platform ").toLowerCase().contains("windows")) {

		}

	}
}
