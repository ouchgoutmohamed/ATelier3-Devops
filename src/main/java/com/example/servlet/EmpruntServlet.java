package com.example.servlet;

import com.example.dao.EmpruntDAO;
import com.example.model.Emprunt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/emprunts")
public class EmpruntServlet extends HttpServlet {
    private EmpruntDAO empruntDAO = new EmpruntDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        // Get all emprunts and forward to JSP
        List<Emprunt> emprunts = empruntDAO.getAll();
        req.setAttribute("emprunts", emprunts);
        req.getRequestDispatcher("/emprunts.jsp").forward(req, resp);
    }
}

