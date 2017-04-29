
package com.domain.AccessSystemApplication.Action;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendRedirectProfileAction implements iAction {

    @Override
    public void doAction(HttpServletResponse response) {
        try {
            response.sendRedirect("profile");
        } catch (IOException ex) {
            Logger.getLogger(SendRedirectProfileAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    
}
