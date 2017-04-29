
package com.Models;

import com.domain.AccessSystemApplication.User.iRegisterUser;

public class RestService {
  private int findIndex;
  private String action;
  private iRegisterUser User;
  private UserRepository repository = new UserRepository();

    public int getFindInedex() {
        return findIndex;
    }

    public void setFindInedex(int findInedex) {
        this.findIndex = findInedex;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String Action) {
        this.action = Action;
    }
  public void changeStateObject(){
    iRegisterUser user = getUser();
    decideWhatIdo(user);
  }

    private iRegisterUser getUser() {
        
        return repository.selectUserWhereId(findIndex);
    }

    private void decideWhatIdo(iRegisterUser user) {
        if (isActionAdd()){
           addPremiumType(user); 
        }
        if (isActionRemove()){
            removePremiumType(user);
        }
    }

    private boolean isActionAdd() {
        return action.equals("add");
    }
    private boolean isActionRemove() {
        return action.equals("remove");
    }
    private void addPremiumType(iRegisterUser user) {
        user.setTypeUser("Premium");
       repository.updateUserType(user);
        
    }

    private void removePremiumType(iRegisterUser user) {
        user.setTypeUser("Normal");
        repository.updateUserType(user);
    }
    
}
