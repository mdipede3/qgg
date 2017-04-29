
package com.Servlets;

import com.Models.UserRepository;
import com.domain.registerApplication.FormRegisterUser;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
    private FormRegisterUser formRegisterUser = new FormRegisterUser();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     formRegisterUser.setUserName(req.getParameter("username"));
     formRegisterUser.setPassword(req.getParameter("password"));
     formRegisterUser.setEmail(req.getParameter("email"));
     UserRepository userRepository = new UserRepository();
     userRepository.setFormRegisterUser(formRegisterUser);
     userRepository.commit();
     resp.sendRedirect("/profile");
     
    }
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        moveToView(req,resp);
    }
     private void moveToView(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/register.jsp");
    view.forward(req, resp);
    }
    
}
