/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Factories.UserFactory;

import com.domain.AccessSystemApplication.User.UnregisterUser;
import com.domain.AccessSystemApplication.User.iRegisterUser;

/**
 *
 * @author User
 */
public class PremiumUserFactory implements AbstractUserFactory {

   

    @Override
    public iRegisterUser createProductNormalUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public iRegisterUser createProductPremiumUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public iRegisterUser createProductAdministrator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UnregisterUser createProductAnomyousUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
