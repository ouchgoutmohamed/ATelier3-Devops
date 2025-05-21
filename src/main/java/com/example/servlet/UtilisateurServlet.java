package com.example.servlet;

import com.example.dao.UtilisateurDAO;
import com.example.model.Utilisateur;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UtilisateurDAO dao = new UtilisateurDAO();
        List<Utilisateur> utilisateurs = dao.getAll();
        req.setAttribute("utilisateurs", utilisateurs);
        req.getRequestDispatcher("utilisateurs.jsp").forward(req, resp);
    }
}
