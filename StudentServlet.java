package com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String course = request.getParameter("course");
        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        int semester =
                Integer.parseInt(request.getParameter("semester"));
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");

        try {
            Connection con = DBConnection.getConnection();

            String sql =
                    "INSERT INTO students(course,name,roll,semester,gender,address) VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, course);
            ps.setString(2, name);
            ps.setString(3, roll);
            ps.setInt(4, semester);
            ps.setString(5, gender);
            ps.setString(6, address);

            int result = ps.executeUpdate();

            if(result > 0){

                HttpSession session = request.getSession();

                session.setAttribute("course", course);
                session.setAttribute("name", name);
                session.setAttribute("roll", roll);
                session.setAttribute("semester", semester);
                session.setAttribute("gender", gender);
                session.setAttribute("address", address);

                response.sendRedirect("success.jsp");

            } else {
                response.getWriter().println("Data not saved");
            }

            con.close();

        } catch(Exception e){
            response.getWriter().println(e);
        }
    }
}
