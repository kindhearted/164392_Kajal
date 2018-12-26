package com.table;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableServlet
 */
@WebServlet(description = "Table Representation Of Registration Form", urlPatterns = { "/tableservlet" })
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String gender = request.getParameter("gender");
		String hobbies=request.getParameter("hobbies");
		String city=request.getParameter("city");
		
		
		PrintWriter out=response.getWriter();
		
		out.print("<html><body><table border=1><tr><td>FirstName:</td><td>"+firstName+"</td></tr><tr><td>LastName:</td><td>"+lastName+"</td></tr><tr><td>Gender:</td><td>"+gender+"</td></tr><tr><td>Hobbies:</td><td>"+hobbies+"</td></tr><tr><td>City</td><td>"+city+"</td></tr></table></body></html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
