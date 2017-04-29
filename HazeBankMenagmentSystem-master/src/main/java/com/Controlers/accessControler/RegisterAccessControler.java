
package com.Controlers.accessControler;

;
import com.domain.AccessSystemApplication.Action.AccessAction;
import com.domain.AccessSystemApplication.Action.SendRedirectProfileAction;
import com.domain.AccessSystemApplication.Action.iAction;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAccessControler extends AccessControler implements iAccessControler {

    private HttpServletResponse response;
    @Override
    public void doAccess() {
        decideWhatIdo();
    }

    @Override
    public void decideWhatIdo() {
        iRegisterUser user = (iRegisterUser) super.getSession().getAttribute("user");
        if (!super.isRegisterUser()){
            iAction action = new AccessAction();
            action.doAction(response);
        }
         else if (!user.getAccessRules().isAccessRegisterPage()  && user.isIsLogged()){
             iAction action = new SendRedirectProfileAction(); 
             action.doAction(response);
        }
        else if (user.getAccessRules().isAccessRegisterPage() && !user.isIsLogged()){
           iAction action = new AccessAction();
           action.doAction(response);
        }
        else if (!user.getAccessRules().isAccessRegisterPage() && !user.isIsLogged()){
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
