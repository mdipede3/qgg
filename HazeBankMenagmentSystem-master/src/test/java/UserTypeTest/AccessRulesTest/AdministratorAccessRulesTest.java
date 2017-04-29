/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserTypeTest.AccessRulesTest;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesAdministrator;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;

/**
 *
 * @author User
 */
public class AdministratorAccessRulesTest extends Mockito implements iRulesTest {
    private iAccessRules rules = new AccessRulesAdministrator();
    @Test
    public void Access_Rules_isCorect_LoginPage() {
        boolean result = rules.isAccessLoginPage();
        assertEquals(false, result);
    }

    @Test
    public void Access_Rules_isCorect_RegisterPage() {
        boolean result = rules.isAccessRegisterPage();
        assertEquals(false, result);
    }

    @Test
    public void Access_Rules_isCorect_SubPage() {
        boolean result = rules.isAccessSubPage();
        assertEquals(true, result);
    }

    @Test
    public void Access_Rules_isCorect_PremiumPage() {    
        boolean result = rules.isAccessPremiumPage();
        assertEquals(true, result);
    }

    @Test
    public void Access_Rules_isCorect_ChnagePrivilegesPage() {
        boolean result = rules.isAccessChangePrivilegesPage();
        assertEquals(true, result);
    }
    
}
