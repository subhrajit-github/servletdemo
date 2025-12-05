package servletdemo.demo;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class AreaofCircle extends HttpServlet {
      
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		int r=Integer.parseInt(req.getParameter("radius"));
		ServletConfig config = getServletConfig();
		Double pi=(Double.parseDouble(config.getInitParameter("pi")));
		
		
		double result=pi*r*r;
		System.out.println("<h1>The area of the circle is"+result+" ");
	}

}
