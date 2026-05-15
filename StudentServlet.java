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

        String course = request.getParameter("course");
        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        int semester =
                Integer.parseInt(request.getParameter("semester"));
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "INSERT INTO students(course,name,roll,semester,gender,address) VALUES(?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, course);
            ps.setString(2, name);
            ps.setString(3, roll);
            ps.setInt(4, semester);
            ps.setString(5, gender);
            ps.setString(6, address);

            int result = ps.executeUpdate();

            if(result > 0){
                out.println("<h1 style='color:green;text-align:center;'>Data Saved Successfully</h1>");
            }else{
                out.println("<h1 style='color:red;text-align:center;'>Failed</h1>");
            }

            con.close();

        } catch(Exception e){
            out.println(e);
        }
    }
}
