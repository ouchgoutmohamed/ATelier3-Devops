package com.example.servlet;

import com.example.dao.CategorieDAO;
import com.example.model.Categorie;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class CategorieServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategorieDAO dao = new CategorieDAO();
        List<Categorie> categories = dao.getAll();
        req.setAttribute("categories", categories);
        req.getRequestDispatcher("categories.jsp").forward(req, resp);
    }
}