/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserTypeTest.AccessRulesTest;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesPremiumUser;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author User
 */
public class PremiumAccessRulesTest implements iRulesTest {
    private iAccessRules rules = new AccessRulesPremiumUser();
    @Override
    public void Access_Rules_isCorect_LoginPage() {
        boolean result = rules.isAccessLoginPage();
        assertEquals(false, result);
    }

    @Override
    public void Access_Rules_isCorect_RegisterPage() {
        boolean result = rules.isAccessRegisterPage();
        assertEquals(false, result);
    }

    @Override
    public void Access_Rules_isCorect_SubPage() {
         boolean result = rules.isAccessSubPage();
        assertEquals(true, result);
    }

    @Override
    public void Access_Rules_isCorect_PremiumPage() {
        boolean result = rules.isAccessPremiumPage();
        assertEquals(true, result);
    }

    @Override
    public void Access_Rules_isCorect_ChnagePrivilegesPage() {
        boolean result = rules.isAccessChangePrivilegesPage();
        assertEquals(false, result);
    }
    
}
