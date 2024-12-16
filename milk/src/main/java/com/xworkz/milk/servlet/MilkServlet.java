package com.xworkz.milk.servlet;

import com.xworkz.milk.dto.MilkFormDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/MilkService" ,loadOnStartup = 1)
public class MilkServlet extends HttpServlet {

    Map<String, Double> map = new HashMap<>();

    @Override
    public void init() {
        System.out.println("init the milk servlet..");
        map.put("special", 56.0);
        map.put("ordinary", 54.0);
        map.put("goodlife", 67.0);
        map.put("goodlife_lite", 68.0);
        map.put("family", 56.0);
        map.put("buffalo", 70.0);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ordering a milk..");

        String brand=req.getParameter("brand");
        String type=req.getParameter("type");
        int convertedQuantity=Integer.parseInt(req.getParameter("quantity"));

        double priceResult=map.get(type);
        double total=priceResult*convertedQuantity;


        MilkFormDto milkFormDto=new MilkFormDto(brand,type,convertedQuantity,total);
        req.setAttribute("milkOrder",milkFormDto);
        req.getRequestDispatcher("MilkResult.jsp").forward(req,resp);
    }
}
