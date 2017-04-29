
package com.Filters;

import com.Controlers.accessControler.PremiumAccessControler;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/premium")
public class AccessPremiumFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        PremiumAccessControler accessControler = new PremiumAccessControler();
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        accessControler.setRequest(httpRequest);
        accessControler.setResponse(httpResponse);
        accessControler.doAccess();
        chain.doFilter(request, response);
        
    }

    @Override
    public void destroy() {
        
    }
    
}
