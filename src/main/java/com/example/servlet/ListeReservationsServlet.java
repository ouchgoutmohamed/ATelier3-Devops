package com.example.servlet;

import com.example.dao.ReservationDAO;
import com.example.model.Reservation;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/reservations")
public class ListeReservationsServlet extends HttpServlet {
    private ReservationDAO dao = new ReservationDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Reservation> reservations = dao.getAll();
        req.setAttribute("reservations", reservations);
        req.getRequestDispatcher("liste_reservations.jsp").forward(req, resp);
    }
}