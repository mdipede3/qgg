
package UserTypeTest.AccessRulesTest;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesAnomyousUser;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import com.domain.AccessSystemApplication.User.UnregisterUser;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;

public class AnomyousAccessRulesTest extends Mockito implements iRulesTest {
     private UnregisterUser user = mock (UnregisterUser.class);
@Test
public void Access_Rules_isCorect_LoginPage(){
 
  iAccessRules rules = new AccessRulesAnomyousUser();
  boolean result = rules.isAccessLoginPage();
  assertEquals(true, result);
}
@Test
public void Access_Rules_isCorect_RegisterPage(){
 
  iAccessRules rules = new AccessRulesAnomyousUser();
  boolean result = rules.isAccessRegisterPage();
  assertEquals(true, result);
}
@Test
public void Access_Rules_isCorect_SubPage(){
 
  iAccessRules rules = new AccessRulesAnomyousUser();
  boolean result = rules.isAccessSubPage();
  assertEquals(false, result);
}
@Test
public void Access_Rules_isCorect_PremiumPage(){
 
  iAccessRules rules = new AccessRulesAnomyousUser();
  boolean result = rules.isAccessPremiumPage();
  assertEquals(false, result);
}
@Test
public void Access_Rules_isCorect_ChnagePrivilegesPage(){
 
  iAccessRules rules = new AccessRulesAnomyousUser();
  boolean result = rules.isAccessChangePrivilegesPage();
  assertEquals(false, result);
}
    
}
