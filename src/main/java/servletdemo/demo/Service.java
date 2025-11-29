package servletdemo.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Service {
private static Connection con;
	
	public static String url="jdbc:postgresql://localhost:5432/school?user=postgres&password=123";
  static {
	  try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded");
		 con=DriverManager.getConnection(url);
			System.out.println("connection established");
	  } catch (ClassNotFoundException e) {
		e.printStackTrace();
	  } catch (SQLException e) {
		e.printStackTrace();
	}
		
		

  }
  public void save() {
	  
  }
  public void update() {
	  
  }
}
