/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Filters;

import com.Controlers.AuthorizedControler.AuthorizedControler;
import com.Controlers.SessionControler;
import com.Controlers.accessControler.ProfileAccessControler;
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

@WebFilter ("/profile")
public class AccessProfileFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ProfileAccessControler accessControler = new ProfileAccessControler();
        SessionControler sessionControler = new SessionControler();
        AuthorizedControler authorizeControler = new AuthorizedControler();
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        sessionControler.setRequest(httpRequest);
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        if (sessionControler.isSessionKeyExist("user")){
             accessControler.setRequest(httpRequest);
             accessControler.setResponse(httpResponse);
             accessControler.doAccess();
             response.getWriter().print("Stay here?");
             chain.doFilter(request, response);
        }
        else{
            if (authorizeControler.isAuthorize(httpRequest)){
             accessControler.setRequest(httpRequest);
             accessControler.setResponse(httpResponse);
             accessControler.doAccess();
             chain.doFilter(request, response);
             
             
             
        }
        accessControler.setRequest(httpRequest);
        accessControler.setResponse(httpResponse);
        accessControler.doAccess();
        
        
        }
     
    }

    @Override
    public void destroy() {
        
    }
   
    
}
