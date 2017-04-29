
package com.Servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/premium")
public class PremiumServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       moveToView(req,resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      moveToView(req,resp);
    }
     private void moveToView(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/premium.jsp");
    view.forward(req, resp);
    }
    
}
