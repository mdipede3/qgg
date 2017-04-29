
package com.Factories.UserFactory;

import com.domain.AccessSystemApplication.User.UnregisterUser;
import com.domain.AccessSystemApplication.User.iRegisterUser;

public interface AbstractUserFactory {
    public UnregisterUser createProductAnomyousUser();
    public iRegisterUser createProductNormalUser();
    public iRegisterUser createProductPremiumUser();
    public iRegisterUser createProductAdministrator();
}
