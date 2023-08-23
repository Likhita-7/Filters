package filter_empcrud;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/Ser")
public class Firstfilter extends HttpFilter implements Filter {
	
	public void init()
	{
		
	}
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String s1=request.getParameter("par1");
		System.out.println(s1);
		chain.doFilter(request, response);
	}

	
	
}
