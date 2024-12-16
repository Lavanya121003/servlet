package com.xworkz.milk.servlet;

import com.xworkz.milk.dto.MuseumTicketFormDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/TicketService", loadOnStartup = 1)
public class MuseumTicketServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerName = req.getParameter("customerName");
        int totalAdultMembers = Integer.parseInt(req.getParameter("totalAdultMembers"));
        int totalChildMembers = Integer.parseInt(req.getParameter("totalChildMembers"));
        String mobileNo = req.getParameter("mobileNo");
        String email = req.getParameter("email");

        MuseumTicketFormDto ticketFormDto = new MuseumTicketFormDto(customerName, totalAdultMembers, totalChildMembers, mobileNo, email);
        req.setAttribute("ticketOrder", ticketFormDto);
        req.getRequestDispatcher("MuseumResult.jsp").forward(req, resp);
    }
}



