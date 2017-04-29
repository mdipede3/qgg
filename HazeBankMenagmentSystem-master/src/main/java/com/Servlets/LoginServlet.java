
package com.Servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     resp.getWriter().println(req.getServletContext());
     resp.getWriter().println("WTF");
    moveToView(req,resp); 
    }

    private void moveToView(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/login.jsp");
    view.forward(req, resp);
    }
    
    
    
}
