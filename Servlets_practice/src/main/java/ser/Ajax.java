package ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ajax")
public class Ajax extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:postgresql://192.168.110.48:5432/plf_training", "plf_training_admin", "pff123");
			PreparedStatement ps=con.prepareStatement("select * from kiran_emp");
			ResultSet rs=ps.executeQuery();
			PrintWriter pw=response.getWriter();
			System.out.println("connection established");
			 pw.println("[");
	            boolean f= true;
		
	    	while(rs.next()) {
	    		if(!f) {
	    			pw.println(",");
	    		}
	    		
	    			 pw.println("{");
	    			 pw.println("\"id\": " + rs.getInt(1) + ",");
	                 pw.println("\"firstName\": \"" + rs.getString(2)+"\"" );
	                pw.println("}");
	                 f = false;
	                
	    		
	    		
				
			} pw.println("]");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	

}
