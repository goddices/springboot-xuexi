package demoApp.filter;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

public class SimpleFilter implements Filter {
	private static Logger log = LoggerFactory.getLogger(SimpleFilter.class);

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		log.info("simple filter destroy");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest hsreq = (HttpServletRequest)request;
		log.info("{} {}",hsreq.getMethod() ,hsreq.getRequestURL() );
		log.info("simple filter do filter .... and it's empty ");
	 	arg2.doFilter(request, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		log.info("simple filter init");
	}

}
