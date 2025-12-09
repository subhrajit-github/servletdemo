package servletdemo.demo;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ellipse extends HttpServlet {
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	int a=Integer.parseInt(req.getParameter("horizontal_direction"));   
        	int b=Integer.parseInt(req.getParameter("vertical_direction"));  
        	ServletConfig config=getServletConfig();
        	double pii=Double.parseDouble(config.getInitParameter("pi"));
        	double res=pii*a*b;
        	System.out.println(res);
        	resp.getWriter().print("<h1>Area of Eclipse is :"+res+"</h1>");
        }
}

