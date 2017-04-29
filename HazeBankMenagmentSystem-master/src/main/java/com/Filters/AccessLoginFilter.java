
package com.Filters;



import com.Controlers.AuthorizedControler.AuthorizedControler;
import com.Controlers.SessionControler;
import com.Controlers.accessControler.LoginAccessControler;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebFilter ("/login")
public class AccessLoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
      
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        LoginAccessControler accessControler = new LoginAccessControler();
        AuthorizedControler authorizedControler = new AuthorizedControler();
        SessionControler sessionControler = new SessionControler();
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        accessControler.setRequest(httpRequest);
        accessControler.setResponse(httpResponse);
        accessControler.doAccess();
        chain.doFilter(request, response);
    }

    public void destroy() {
        
    }

   
    
    
}
