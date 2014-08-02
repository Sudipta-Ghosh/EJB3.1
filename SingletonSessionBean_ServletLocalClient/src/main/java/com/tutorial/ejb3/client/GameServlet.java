package com.tutorial.ejb3.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tutorial.ejb3.PlayerBean;
@WebServlet(name = "GameServlet", urlPatterns = { "/GameServlet" })
public class GameServlet extends HttpServlet {
@EJB
private PlayerBean player;
protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	try {
		player.setName(request.getParameter("name"));
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet GameServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Name: " + player.getName() + "</h3>");
		out.println("</body>");
		out.println("</html>");
	} finally {
	out.close();
	}
}

@Override
protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	processRequest(request, response);
}
@Override
protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
	processRequest(request, response);
}
}