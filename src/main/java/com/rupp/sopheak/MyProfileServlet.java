package com.rupp.sopheak;


import model.User;
import model.UserList;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class MyProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private User authenticatedUser;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession(true);
		 if (session.getAttribute("userId") != null) {
			 	request.setAttribute("userId", session.getAttribute("userId"));
			 	request.setAttribute("email", session.getAttribute("email"));
			 	request.setAttribute("createdDate", session.getAttribute("createdDate"));
			 	request.setAttribute("urlPhoto", session.getAttribute("urlPhoto"));
			    request.getRequestDispatcher("/myProfile.jsp").forward(request, response);
		 }
		 response.sendRedirect("/login");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
	

}
