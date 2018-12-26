package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/config")
public class ServletConfigTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			ServletConfig cfg=getServletConfig();
			String managerName=cfg.getInitParameter("managerName");
			String managerEmailId=cfg.getInitParameter("managerEmailId");
			
			out.println("<center>Manager Name   :"+managerName+"</center>");
			out.println("<center>Manager Email Id   :"+managerEmailId+"</center>");

	}


	}


