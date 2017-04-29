
package com.Controlers.accessControler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface iAccessControler {
   public void doAccess();
   void decideWhatIdo();
   public void setResponse(HttpServletResponse response);
   public void setRequest(HttpServletRequest request);
   
}
