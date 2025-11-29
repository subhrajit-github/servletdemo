package servletdemo.demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Registerr")
public class Registerr extends HttpServlet {
      protected void doPost(HttpServletRequest req,HttpServletResponse res){
    	   
    	  req.getParameter("id");
    	  req.getParameter("name");
    	  req.getParameter("age");
       }
}
