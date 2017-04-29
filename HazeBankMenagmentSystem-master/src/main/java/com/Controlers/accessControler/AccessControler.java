
package com.Controlers.accessControler;

import com.domain.AccessSystemApplication.Action.iAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

abstract class AccessControler {
  private HttpServletRequest request;
  private HttpSession session;
  private HttpServletResponse response;
  private iAction action;

    public HttpServletRequest getRequest() {
        return request;
    }

    public iAction getAction() {
        return action;
    }

    public void setAction(iAction action) {
        this.action = action;
    }
    
    public void setRequest(HttpServletRequest request) {
        this.request = request;
        setSession(request.getSession());
    }

    public HttpSession getSession() {
        return session;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }
    public void doAction(){
        action.doAction(response);
    }
    public boolean isRegisterUser(){
    if (session.getAttribute("user") == null) return false; return true;
    }
  
}
