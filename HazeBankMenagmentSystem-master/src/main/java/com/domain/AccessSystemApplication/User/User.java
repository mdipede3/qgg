
package com.domain.AccessSystemApplication.User;

import com.domain.AccessSystemApplication.Rules.iAccessRules;
import javax.servlet.http.HttpSession;

abstract class User{

private iAccessRules rules;
private HttpSession session;
private boolean isLogged;

    public iAccessRules getRules() {
        return rules;
    }

    public void setRules(iAccessRules rules) {
        this.rules = rules;
    }

    public boolean isIsLogged() {
        return isLogged;
    }

    public void setIsLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }

    
    public void setSession(HttpSession session) {
        session = session;
    }

    public HttpSession getSession() {
      return session; 
    }

  

    
}
