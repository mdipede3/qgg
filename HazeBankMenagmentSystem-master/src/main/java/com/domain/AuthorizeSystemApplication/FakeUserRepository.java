
package com.domain.AuthorizeSystemApplication;

import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesAdministrator;
import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesNormalUser;
import com.domain.AccessSystemApplication.Rules.AccessRules.AccessRulesPremiumUser;
import com.domain.AccessSystemApplication.Rules.iAccessRules;
import com.domain.AccessSystemApplication.User.RegisterUser;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import com.domain.registerApplication.FormRegisterUser;
import java.util.ArrayList;
import java.util.List;

public class FakeUserRepository {
  
private List<iRegisterUser> userList = new ArrayList<iRegisterUser>();

 private int count = 2;

    public FakeUserRepository() {
        createUserList();
    }
 

public void createUserList (){
 iRegisterUser user1 = new RegisterUser();
 user1.setId(0);
 user1.setUserName("Test1");
 user1.setPassword("test1");
 user1.setEmail("test1@hazebank.pl");
 iAccessRules rules1 = new AccessRulesNormalUser();
 user1.setTypeUser("Normal");
 userList.add(user1);
 iRegisterUser user2 = new RegisterUser();
 user2.setId(1);
 user2.setUserName("Test2");
 user2.setPassword("test2");
 user2.setEmail("test2@hazebank.pl");
 iAccessRules rules2 = new AccessRulesPremiumUser();
 user2.setTypeUser("Premium");
 userList.add(user2);
 iRegisterUser user3 = new RegisterUser();
 user3.setId(2);
 user3.setUserName("Test3");
 user3.setPassword("test3");
 user3.setEmail("test3@hazebank.pl");
 iAccessRules rules3 = new AccessRulesAdministrator();
 user3.setTypeUser("Administrator");
 userList.add(user3);
}
  public List<iRegisterUser> getUserList() {
        return userList;
    }

    public void setUserList(List<iRegisterUser> userList) {
        this.userList = userList;
    }

    public iRegisterUser getRow(int indexUser) {
        iRegisterUser user = userList.get(indexUser);
        return user;
    }

    public void addRow(FormRegisterUser formRegisterUser) {
        iRegisterUser user = new RegisterUser();
        user.setUserName(formRegisterUser.getUserName());
        user.setPassword(formRegisterUser.getPassword());
        user.setEmail(formRegisterUser.getEmail());
        user.setTypeUser("Normal");
        user.setId(count);
        count++;
        userList.add(user);
        
    }

    public void updateRow(iRegisterUser user) {
        userList.get(user.getId()).setTypeUser(user.getTypeUser());
    }

}
