
package com.Models;

import com.domain.AccessSystemApplication.User.iRegisterUser;
import com.domain.AuthorizeSystemApplication.FakeUserRepository;
import com.domain.registerApplication.FormRegisterUser;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

private FormRegisterUser formRegisterUser;
private FakeUserRepository repository = new FakeUserRepository(); 
    
    

    public FormRegisterUser getFormRegisterUser() {
        return formRegisterUser;
    }

    public void setFormRegisterUser(FormRegisterUser formRegisterUser) {
        this.formRegisterUser = formRegisterUser;
    }
    public FakeUserRepository getUserRepository(){
        return repository;
    }
    public void commit() {
       repository.addRow(formRegisterUser);
    }
    public List<iRegisterUser> getUserWhereTypeUser(String typeUser){
        List<iRegisterUser> result = new ArrayList<iRegisterUser>();
        for (iRegisterUser user : repository.getUserList()){
            if (isEqual(user,typeUser)){
                result.add(user);
            }
        }
       return result;
    }
    private boolean isEqual(iRegisterUser user, String typeUser){
       if (user.getTypeUser().equals(typeUser)) return true; return false;
    }
    public iRegisterUser selectUserWhereId( int findIndex){
       return repository.getRow(findIndex);
    }

    void updateUserType(iRegisterUser user) {
        repository.updateRow(user);
    }

   



}
