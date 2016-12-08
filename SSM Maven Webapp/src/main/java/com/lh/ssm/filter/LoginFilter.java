package com.lh.ssm.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * ClassName: LoginFilter 
 * @Description: 登录拦截器
 * @author Yuanlinhu
 * @date 2016年11月21日
 */
public class LoginFilter implements Filter {
	
	public void destroy() {
		// TODO Auto-generated method stub	
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletResponse hsr = (HttpServletResponse) res;
	    hsr.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	    hsr.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	    hsr.setDateHeader("Expires", 0); // Proxies.
	    chain.doFilter(req, res);
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub	
	}

	

}
