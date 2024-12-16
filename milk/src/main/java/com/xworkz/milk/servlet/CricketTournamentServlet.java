
package com.xworkz.milk.servlet;
import com.xworkz.milk.dto.CricketTournamentFormDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/TournamentService", loadOnStartup = 1)
public class CricketTournamentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tournamentName = req.getParameter("tournamentName");
        String organizerName = req.getParameter("organizerName");
        String location = req.getParameter("location");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        int totalTeams = Integer.parseInt(req.getParameter("totalTeams"));
        String contactNumber = req.getParameter("contactNumber");
        String email = req.getParameter("email");

        CricketTournamentFormDto tournamentFormDto = new CricketTournamentFormDto(tournamentName, organizerName, location, startDate, endDate, totalTeams, contactNumber, email);
        req.setAttribute("tournamentOrder", tournamentFormDto);
        req.getRequestDispatcher("CricketTournamentResult.jsp").forward(req, resp);
    }
}
