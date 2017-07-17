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


@WebServlet(urlPatterns = "/firstServlet")
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
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().println("This finally works");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		
		request.setAttribute("firstname", firstName);
		request.setAttribute("lastname", lastName);
		
		
		String genderMale = request.getParameter("Male");
		String genderFemale = request.getParameter("Female");
		
		if(request.getParameter("Male") != null){
			request.setAttribute("Message", "Shocker!!!, You are a " + genderMale + "!");
		}
		else {
			request.setAttribute("Message", "You are a " + genderFemale + ".");
		}
		
		//response.getWriter().println("This finally works");
		request.getRequestDispatcher("WEB-INF/services/success.jsp").forward(request, response);
	}
 
}