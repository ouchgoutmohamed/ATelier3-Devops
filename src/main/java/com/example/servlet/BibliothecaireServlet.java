
package com.example.servlet;

import com.example.dao.BibliothecaireDAO;
import com.example.model.Bibliothecaire;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class BibliothecaireServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        BibliothecaireDAO dao = new BibliothecaireDAO();
        List<Bibliothecaire> bibliothecaires = dao.getAll();
        req.setAttribute("bibliothecaires", bibliothecaires);
        req.getRequestDispatcher("bibliothecaires.jsp").forward(req, res);
    }
}
