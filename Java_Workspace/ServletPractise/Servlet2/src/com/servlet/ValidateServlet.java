package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String userName;
		String password;
		String userType;
		
		userName=request.getParameter("userName");
		password=request.getParameter("password");	
		
		userType=getUserTyep(userName,password);
		
		RequestDispatcher requestDispacher=null;
		
		if(userType.endsWith("Admin")) {
			requestDispacher=request.getRequestDispatcher("/admin");
		}
		else if (userType.equals("User")) {
			requestDispacher=request.getRequestDispatcher("/user");


		}
		else {
			requestDispacher=request.getRequestDispatcher("/invalid");
		}
		
		
	}

	private String getUserTyep(String userName,String password) {
		UserDAO dao=new UserDAO();
		return dao.getUserType(userName, password);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
