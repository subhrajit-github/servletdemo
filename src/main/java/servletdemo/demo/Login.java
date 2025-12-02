package servletdemo.demo;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
         protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        	 
        	 
        	 String user=req.getParameter("username");
        	 String password=req.getParameter("password");
        	 
        	 //db logic to check user and password exist or not
        	 
        	 if("Subhra".equals(user) && "Subhra123".equals(password)) {
        		RequestDispatcher dispatcher= req.getRequestDispatcher("home.jsp");
        		dispatcher.forward(req, res);
        	 }
        	 else {
        		 res.getWriter().print("<h1>Login failed!!!</h1>");
        	 }
         }
}
