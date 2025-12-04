package servletdemo.demo;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Registerr")
public class Registerr extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.getParameter("id");
		req.getParameter("name");
		req.getParameter("age");

		// db logic
		boolean flag = true;// assume data is saved
		if (flag) {
			// give login page
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, res);
		} else {
			req.setAttribute("msg", "REGISTRATION FAILED");
			res.getWriter().print("<h1>DATA NOT SAVED</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.include(req, res);

		}
	}
}
