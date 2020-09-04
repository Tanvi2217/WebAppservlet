package Myservlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import p1.DaoImplement;

public class Servlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	DaoImplement obj1 = new DaoImplement();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// We need email to validate user
		System.out.println(" inside servelt 2 ");
		
		String username = (String)req.getAttribute("user-name");
		String courselist = null;
		try {
			courselist = obj1.courseselect();
			System.out.println(courselist);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter out = resp.getWriter();
		
		out.print("List Of Courses for : "+username +" is: "+courselist);
		
	}
	
	
}