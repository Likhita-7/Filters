package ser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession s=request.getSession();
		 Integer c=(Integer)s.getAttribute("c");
		 if(c==null) {
			 c=1;
		 }
		 else {
			 c++;
		 }
		 s.setAttribute("c",c );
		 response.getWriter().printf("<p>count is %d </p>",c);
	}

	
}
