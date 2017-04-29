
package com.Models;

import com.domain.AccessSystemApplication.User.RegisterUser;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import com.domain.AuthorizeSystemApplication.FakeUserRepository;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorizeSystem {

private FakeUserRepository userRepository;
private boolean iFoundUser = false;
private int indexUser;
private iRegisterUser foundUser = new RegisterUser();
    
     public boolean check(HttpServletRequest request) {
      addRepository();
       if (checkUserLogin (request) ){
            if (checkPassword(request)){
                addFoundUser();
                return true;
            }
       }
       return false;
    }
    public boolean checkUserLogin(HttpServletRequest request) {
      String postLogin = request.getParameter("login");
      for (iRegisterUser user : userRepository.getUserList()){
          if (user.getName().equals(postLogin)){
              indexUser = user.getId();
              return true;
          }
      }
      return false;
    }

    private boolean checkPassword(HttpServletRequest request) {
     String postPassword = request.getParameter("password");
     iRegisterUser user = userRepository.getRow(indexUser);
        if (user.getPassword().equals(postPassword)){
            return true;
        }
       return false;
    }

    private void addFoundUser() {
        foundUser = userRepository.getRow(indexUser);
    }

    public iRegisterUser getFoundUser() {
        return foundUser;
    }

    public void setFoundUser(iRegisterUser foundUser) {
        this.foundUser = foundUser;
    }

    private void addRepository() {
        UserRepository repository = new UserRepository();
        userRepository = repository.getUserRepository();
    }
    
    
}
