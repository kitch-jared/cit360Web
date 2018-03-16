package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletsDemo
 */
@WebServlet("/ServletsDemo")
public class ServletsDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String usersName = firstName + " " + lastName;
		
		PrintWriter out = response.getWriter();
		String creatorFirstName = "Jared";
		String creatorLastName = "Kitch";
		String name = creatorFirstName + " " + creatorLastName;
		
		out.println("<html><body>");
		out.println("<p>This page created by " + name + "</p>");
		out.println("<br>");
		if (usersName.equals("null null")) {
			out.println("You did not pass in a name<br>");
			out.println("Use \"?firstName=-name-&lastName=-name-\"");
		} else {
			out.println("<p>Your name is " + usersName + "</p>");
		}
		
		out.println("</html></body>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("You went through the POST");
		doGet(request, response);
	}

}
