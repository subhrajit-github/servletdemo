package servletdemo.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/register")
@SuppressWarnings("serial")
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {
    	
    	String id=req.getParameter("id"); 
    	String name=req.getParameter("name"); 
    	String age=req.getParameter("age"); 
    	
    	System.out.println(id+" "+name+" "+age);
    	System.out.println("Welcome to servlet");
    }
}
