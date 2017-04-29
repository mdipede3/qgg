
package UserTypeTest;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesAdministrator;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import com.domain.AccessSystemApplication.User.RegisterUser;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import static junit.framework.Assert.assertEquals;

public class AdministratorRegisterUserTest implements iUserTest {
    private iRegisterUser user = new RegisterUser();
    private iAccessRules rules = new AccessRulesAdministrator();
    @Override
    public void User_Get_Access_LoginPage() {
        user.setAccessRules(rules);
        boolean result = user.getAccessRules().isAccessLoginPage();
        assertEquals(false, result);
    }

    @Override
    public void User_Get_Access_RegisterPage() {
        user.setAccessRules(rules);
        boolean result = user.getAccessRules().isAccessRegisterPage();
        assertEquals(false, result);
    }

    @Override
    public void User_Get_Access_SubPage() {
        user.setAccessRules(rules);
        boolean result = user.getAccessRules().isAccessSubPage();
        assertEquals(true, result);
    }

    @Override
    public void User_Get_Access_PremiumPage() {
        user.setAccessRules(rules);
        boolean result = user.getAccessRules().isAccessPremiumPage();
        assertEquals(true, result);
    }

    @Override
    public void User_Get_Access_ChangePrivileges() {
        user.setAccessRules(rules);
        boolean result = user.getAccessRules().isAccessChangePrivilegesPage();
        assertEquals(true, result);
    }
    
}
