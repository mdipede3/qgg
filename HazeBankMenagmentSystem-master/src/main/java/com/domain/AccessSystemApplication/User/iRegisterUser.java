/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.AccessSystemApplication.User;

import com.domain.AccessSystemApplication.Rules.iAccessRules;

/**
 *
 * @author User
 */
public interface iRegisterUser {
    void setUserName(String name);
    void setPassword(String password);
    void setEmail(String email);
    String getName();
    String getPassword();
    String getEmail();
    public void setAccessRules(iAccessRules rules);
    public iAccessRules getAccessRules();
    public int getId();
    public void setId(int id);
    public String getTypeUser();
    public void setTypeUser(String typeUser);
    public boolean isIsLogged();
    public String toString();
    public void setIsLogged(boolean isLogged);
}
