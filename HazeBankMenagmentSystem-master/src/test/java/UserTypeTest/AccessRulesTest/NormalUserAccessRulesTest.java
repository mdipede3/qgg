
package UserTypeTest.AccessRulesTest;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesNormalUser;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;

public class NormalUserAccessRulesTest extends Mockito implements iRulesTest {
    private iAccessRules rules = new AccessRulesNormalUser();
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
       assertEquals(false, result);
    }

    @Test
    public void Access_Rules_isCorect_ChnagePrivilegesPage() {
       boolean result = rules.isAccessChangePrivilegesPage();
       assertEquals(false, result);
    }
    
}
