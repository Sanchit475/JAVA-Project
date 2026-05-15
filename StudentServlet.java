package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int serial =
                Integer.parseInt(request.getParameter("serial"));

        String course =
                request.getParameter("course");

        String name =
                request.getParameter("name");

        String roll =
                request.getParameter("roll");

        int semester =
                Integer.parseInt(request.getParameter("semester"));

        String gender =
                request.getParameter("gender");

        String address =
                request.getParameter("address");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "INSERT INTO students VALUES(?,?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, serial);
            ps.setString(2, course);
            ps.setString(3, name);
            ps.setString(4, roll);
            ps.setInt(5, semester);
            ps.setString(6, gender);
            ps.setString(7, address);

            int result = ps.executeUpdate();

            if(result > 0){
                out.println("<h2>Data Submitted Successfully!</h2>");
            } else {
                out.println("<h2>Submission Failed</h2>");
            }

            con.close();

        } catch(Exception e){
            out.println(e);
        }
    }
}