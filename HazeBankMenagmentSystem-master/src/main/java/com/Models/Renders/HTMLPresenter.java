
package com.Models.Renders;

import com.domain.AccessSystemApplication.User.iRegisterUser;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HTMLPresenter {
  private HttpServletRequest request;
  private HttpServletResponse response;
  private iRegisterUser user;
  private String key;

    public HTMLPresenter(HttpServletRequest request, HttpServletResponse response, String key) {
        this.request = request;
        this.response = response;
        this.key = key;
        loadSession();
    }

    private void loadSession() {
       user = (iRegisterUser) request.getSession().getAttribute(key);
    }
    public String presentName(){
        return user.getName();
    }
    public String presentPassword(){
        return user.getPassword();
    }
    public String presentEmail(){
        return user.getEmail();
    }
    
    
    
}
