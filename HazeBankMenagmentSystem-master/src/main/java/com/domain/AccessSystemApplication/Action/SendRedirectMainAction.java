
package com.domain.AccessSystemApplication.Action;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;

public class SendRedirectMainAction implements iAction{

    @Override
    public void doAction(HttpServletResponse response) {
        try {
            response.sendRedirect("index.jsp");
        } catch (IOException ex) {
            Logger.getLogger(SendRedirectMainAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
