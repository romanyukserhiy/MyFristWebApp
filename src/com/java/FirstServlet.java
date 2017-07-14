package com.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/first")
public class FirstServlet extends HttpServlet {
	// FirstServlet
	// LoginServlet
	// SecondServlet
	// ThirdServlet
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("attribute", "What's up?");
		request.getRequestDispatcher("WEB-INF/services/first.jsp").forward(request, response);
	}
}