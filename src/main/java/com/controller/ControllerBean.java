package com.controller;

import com.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ControllerBean", urlPatterns = {"/home"})
public class ControllerBean extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void dispatch(HttpServletRequest request,
                            HttpServletResponse response, String page)
            throws javax.servlet.ServletException, java.io.IOException {
        response.sendRedirect(page);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Belepett");
        User user = new User();
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        user.setName(name);
        user.setPass(pass);
        user.saveUser();

        dispatch(request, response, "index.xhtml");
    }
}
