
package com.Servlets;

import com.domain.AccessSystemApplication.User.iRegisterUser;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/logout")
public class logoutServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       iRegisterUser user = (iRegisterUser) req.getSession().getAttribute("user");
       user.setIsLogged(false);
       req.setAttribute("user", user);
       resp.sendRedirect("/");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.getSession().removeAttribute("user");
       resp.sendRedirect("index.jsp");
    }
    
}
