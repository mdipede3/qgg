/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.AccessSystemApplication.Rules.AccessRules;

import com.domain.AccessSystemApplication.Rules.iAccessRules;

/**
 *
 * @author User
 */
public class AccessRulesNormalUser implements iAccessRules  {

    @Override
    public boolean isAccessPremiumPage() {
        return false;
    }

    @Override
    public boolean isAccessSubPage() {
        return true;
    }

    @Override
    public boolean isAccessLoginPage() {
        return false;
    }

    @Override
    public boolean isAccessRegisterPage() {
        return false;
    }

    @Override
    public boolean isAccessChangePrivilegesPage() {
       return false;
    }

   
    
}
