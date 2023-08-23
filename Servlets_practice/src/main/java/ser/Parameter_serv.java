package ser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Parameter_serv")
public class Parameter_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		response.getWriter().printf("<p>hello,%s </p>",name);
		String email=request.getParameter("email");
		response.getWriter().printf("<p>email,%s </p>",email);
		 
	       
	}

	

}
