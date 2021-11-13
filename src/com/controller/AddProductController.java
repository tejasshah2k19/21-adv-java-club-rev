package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

@WebServlet("/AddProductController")
public class AddProductController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		int qty = Integer.parseInt(request.getParameter("qty"));

		ProductBean product = new ProductBean();
		product.setPrice(price);
		product.setName(productName);
		product.setQty(qty);

		ProductDao productDao = new ProductDao();
		productDao.saveProduct(product);

		response.sendRedirect("Home.jsp");

	}
}
