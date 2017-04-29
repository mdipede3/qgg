/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servlets;

import com.Models.RestService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/changePrivileges")
public class ChangePrivilegesServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       RestService service = new RestService();
       int index = Integer.parseInt(req.getParameter("userid"));
       String Action = req.getParameter("change");
       service.setAction(Action);
       service.setFindInedex(index);
       moveToView(req,resp);
    }
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        moveToView(req,resp);
    }
     private void moveToView(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/privileges.jsp");
    view.forward(req, resp);
    }    
    
}
