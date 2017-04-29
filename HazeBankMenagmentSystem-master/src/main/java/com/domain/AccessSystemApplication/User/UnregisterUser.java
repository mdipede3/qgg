
package com.domain.AccessSystemApplication.User;

import com.domain.AccessSystemApplication.Rules.iAccessRules;

public class UnregisterUser extends User {
String typeUser = "anomyous";

    @Override
    public void setRules(iAccessRules rules) {
        super.setRules(rules); 
    }

    @Override
    public iAccessRules getRules() {
        return super.getRules();
    }
  

    
}
