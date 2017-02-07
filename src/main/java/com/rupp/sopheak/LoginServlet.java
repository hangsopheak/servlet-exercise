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
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private User authenticatedUser;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("/login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			if(this.authenticated(email, password)){
				response.sendRedirect("/myProfile");
				session.setAttribute("userId", this.authenticatedUser.getId());
				session.setAttribute("email", this.authenticatedUser.getEmail());
				session.setAttribute("createdDate", this.authenticatedUser.getCreatedDateToString());
				session.setAttribute("urlPhoto", this.authenticatedUser.getUrlPhoto());
			}else{
				response.sendRedirect("/login");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/login.jsp");
	}
	
	private boolean authenticated(String email, String password) throws ParseException{
		boolean state = false;
		List<User> users = (ArrayList<User>) UserList.getUsers();
		for(int i= 0; i < users.size(); i++){
			User u = users.get(i);
			if(u.getEmail().equals(email) && u.getPassword().equals(password)){
				state = true;
				this.authenticatedUser = u;
				break;
			}
		}
		return state;
	}

}
