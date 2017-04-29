/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserTypeTest;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesPremiumUser;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import com.domain.AccessSystemApplication.User.RegisterUser;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author User
 */
public class PremiumRegisterUserTest implements iUserTest {
    iRegisterUser user = new RegisterUser();
    iAccessRules rules = new AccessRulesPremiumUser();
    @Test
    public void User_Get_Access_LoginPage() {
        user.setAccessRules(rules);
        boolean result = user.getAccessRules().isAccessLoginPage();
        assertEquals(false, result);
    }

    @Test
    public void User_Get_Access_RegisterPage() {
        user.setAccessRules(rules);
        boolean result = user.getAccessRules().isAccessRegisterPage();
        assertEquals(false, result);
    }

    @Test
    public void User_Get_Access_SubPage() {
        user.setAccessRules(rules);
        boolean result = user.getAccessRules().isAccessSubPage();
        assertEquals(true, result);
    }

    @Test
    public void User_Get_Access_PremiumPage() {
        user.setAccessRules(rules);
        boolean result = user.getAccessRules().isAccessPremiumPage();
        assertEquals(true, result);
    }

    @Test
    public void User_Get_Access_ChangePrivileges() {
        user.setAccessRules(rules);
        boolean result = user.getAccessRules().isAccessChangePrivilegesPage();
        assertEquals(false, result);
    }
    
}
