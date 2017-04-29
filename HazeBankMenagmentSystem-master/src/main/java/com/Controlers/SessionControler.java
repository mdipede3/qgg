/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controlers;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesAdministrator;
import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesAnomyousUser;
import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesNormalUser;
import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesPremiumUser;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import com.domain.AccessSystemApplication.User.UnregisterUser;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionControler {
    private HttpServletRequest request;
    
    public void setRequest(HttpServletRequest httpRequest) {
        request = httpRequest;
    }

    public boolean isSessionKeyExist(String key) {
      if(request.getSession().getAttribute(key) == null)return false; return true;
    }
    
    
    
}
