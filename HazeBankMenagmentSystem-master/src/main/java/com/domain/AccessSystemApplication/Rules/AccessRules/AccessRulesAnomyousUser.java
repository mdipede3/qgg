/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.AccessSystemApplication.Rules.AccessRules;

import com.domain.AccessSystemApplication.Rules.iAccessRules;

public class AccessRulesAnomyousUser implements  iAccessRules{

    @Override
    public boolean isAccessPremiumPage() {
        return false;
    }

    @Override
    public boolean isAccessSubPage() {
       return false;
    }

    @Override
    public boolean isAccessLoginPage() {
        return true;
    }

    @Override
    public boolean isAccessRegisterPage() {
        return true;
    }

    @Override
    public boolean isAccessChangePrivilegesPage() {
       return false;
    }

  


   
  
}
