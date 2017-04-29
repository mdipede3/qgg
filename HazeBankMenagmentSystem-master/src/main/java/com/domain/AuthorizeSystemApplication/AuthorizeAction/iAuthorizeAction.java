/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.AuthorizeSystemApplication.AuthorizeAction;

import com.domain.AccessSystemApplication.Rules.iAccessRules;
import com.domain.AccessSystemApplication.User.iRegisterUser;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author User
 */
public interface iAuthorizeAction {
    public void doAction (iAccessRules rules, HttpServletRequest request, iRegisterUser user);
}
