
package com.Controlers.AuthorizedControler;

import com.Controlers.RestControler.RestControler;
import com.Models.AuthorizeSystem;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import com.domain.AuthorizeSystemApplication.FakeUserRepository;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

public class AuthorizedControler {
 private AuthorizeSystem authorizeSystem = new AuthorizeSystem();
 private RestControler restControler = new RestControler();
 
 public boolean isAuthorize(HttpServletRequest request){
     if (isSuccessfull(request)){
      moveToRestControler(request);
      return true;
 }
     return false;
 }
 private boolean isSuccessfull(HttpServletRequest request){
    return authorizeSystem.check(request);
 }

    private void moveToRestControler(HttpServletRequest request) {
      restControler.setRequest(request);
      restControler.changeStateObject(authorizeSystem.getFoundUser());
    }
}