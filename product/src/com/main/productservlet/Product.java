package com.main.productservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String product_id = request.getParameter("product_id");
		String product_name = request.getParameter("product_name");
		String price = request.getParameter("price");
		String avalibility = request.getParameter("avalibility");
		PrintWriter out = response.getWriter();
		System.out.println("printing the elements...");
		response.sendRedirect("Product-added-sucess.jsp");
// out.println("product_id " + product_id + "product_name " + product_name +  "price " + price + "avalibility "+ avalibility);

	}

}
