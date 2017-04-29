
package com.Controlers.RestControler;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesAdministrator;
import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesNormalUser;
import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesPremiumUser;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import com.domain.AuthorizeSystemApplication.AuthorizeAction.AuthorizeToAdministrator;
import com.domain.AuthorizeSystemApplication.AuthorizeAction.AuthorizeToNormalUser;
import com.domain.AuthorizeSystemApplication.AuthorizeAction.AuthorizeToPremiumUser;
import com.domain.AuthorizeSystemApplication.AuthorizeAction.iAuthorizeAction;
import javax.servlet.http.HttpServletRequest;

public class RestControler {
private iRegisterUser sessionUser;
private iAccessRules rules;
private iAuthorizeAction action;
private HttpServletRequest request;
    public void changeStateObject(iRegisterUser foundUser) {
        sessionUser = foundUser;
        decideWhichChange();
    }

    private void decideWhichChange() {
           if (isNormalUser(sessionUser)){
           rules = new AccessRulesNormalUser();
           action = new AuthorizeToNormalUser();
           action.doAction(rules, request, sessionUser);
       }
       else if (isPremiumUser(sessionUser)){
           rules = new AccessRulesPremiumUser();
           action = new AuthorizeToPremiumUser();
           action.doAction(rules, request, sessionUser);
       }
        else if (isAdministratorUser(sessionUser)){
           rules = new AccessRulesAdministrator();
           action = new AuthorizeToAdministrator();
           action.doAction(rules, request, sessionUser);
       }
    }

    public void setRequest(HttpServletRequest request) {
       this.request = request;
    }
      private boolean isNormalUser(iRegisterUser user){
       return sessionUser.getTypeUser().equals("Normal");
   }

    private boolean isPremiumUser(iRegisterUser user) {
      return sessionUser.getTypeUser().equals("Premium");
    }

    private boolean isAdministratorUser(iRegisterUser user) {
      return sessionUser.getTypeUser().equals("Administrator");
    }
    
}
