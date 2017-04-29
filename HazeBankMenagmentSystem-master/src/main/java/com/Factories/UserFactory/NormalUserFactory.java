
package com.Factories.UserFactory;

import com.domain.AccessSystemApplication.User.UnregisterUser;
import com.domain.AccessSystemApplication.User.iRegisterUser;

public class NormalUserFactory implements AbstractUserFactory {

 

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
