
package com.Controlers.accessControler;

import com.domain.AccessSystemApplication.Action.AccessAction;
import com.domain.AccessSystemApplication.Action.SendRedirectProfileAction;
import com.domain.AccessSystemApplication.Action.iAction;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAccessControler extends AccessControler implements iAccessControler {
    private HttpServletResponse response;
    public void doAccess() {
        decideWhatIdo();
    }
 
   public void decideWhatIdo(){
         iRegisterUser user = (iRegisterUser) super.getSession().getAttribute("user");
        if (!super.isRegisterUser()){
            iAction action = new AccessAction();
            super.setAction(action);
        }
         else if (!user.getAccessRules().isAccessLoginPage()  && user.isIsLogged()){
             iAction action = new SendRedirectProfileAction(); 
             action.doAction(response);
        }
         
        else if (user.getAccessRules().isAccessLoginPage() && !user.isIsLogged()){
           iAction action = new AccessAction();
           action.doAction(response);
        }
        else if (!user.getAccessRules().isAccessLoginPage() && !user.isIsLogged()){
           iAction action = new AccessAction ();
           action.doAction(response);
        }
       
    }
    

    @Override
    public void setResponse(HttpServletResponse response) {
        this.response = response;
        super.setResponse(response);
    }

    @Override
    public void setRequest(HttpServletRequest request) {
        super.setRequest(request);
    }
    
    
    
}
