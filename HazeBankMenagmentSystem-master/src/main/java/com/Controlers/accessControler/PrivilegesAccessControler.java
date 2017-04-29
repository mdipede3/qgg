/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controlers.accessControler;

import com.domain.AccessSystemApplication.Action.AccessAction;
import com.domain.AccessSystemApplication.Action.SendRedirectMainAction;
import com.domain.AccessSystemApplication.Action.SendRedirectProfileAction;
import com.domain.AccessSystemApplication.Action.iAction;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class PrivilegesAccessControler extends AccessControler implements iAccessControler {

    @Override
    public void doAccess() {
        decideWhatIdo();
    }

    @Override
    public void decideWhatIdo() {
       iRegisterUser user = (iRegisterUser) super.getSession().getAttribute("user");
        if (!super.isRegisterUser()){
            iAction action = new SendRedirectMainAction();
            super.setAction(action);
        }
         else if (user.getAccessRules().isAccessChangePrivilegesPage() && user.isIsLogged()){
             iAction action = new AccessAction(); 
             super.setAction(action);
        }
        else if (user.getAccessRules().isAccessChangePrivilegesPage() && !user.isIsLogged()){
           iAction action = new SendRedirectMainAction();
           super.setAction(action);
        }
        else if (!user.getAccessRules().isAccessChangePrivilegesPage() && !user.isIsLogged()){
           iAction action = new SendRedirectMainAction ();
           super.setAction(action);
        }
        else if (!user.getAccessRules().isAccessChangePrivilegesPage() && user.isIsLogged()){
           iAction action = new SendRedirectProfileAction();
           super.setAction(action);
        }
        super.doAction();  
    }

    @Override
    public void setResponse(HttpServletResponse response) {
        super.setResponse(response); 
    }

    @Override
    public void setRequest(HttpServletRequest request) {
        super.setRequest(request);
    }
    
    
}
