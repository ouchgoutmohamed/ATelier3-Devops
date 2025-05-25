package com.example.servlet;

import com.example.dao.LivreDAO;
import com.example.model.Livre;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/livres")
public class ListeLivresServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        LivreDAO dao = new LivreDAO();
        List<Livre> livres = dao.getAll();
        req.setAttribute("livres", livres);
        req.getRequestDispatcher("liste_livres.jsp").forward(req, res);
    }
}