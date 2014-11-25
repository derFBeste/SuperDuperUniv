/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.controller;

import besteman.model.Course;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author Fred Besteman
 */
@WebServlet(name = "SelectCourseServlet", urlPatterns = {"/SelectCourseServlet"})

public class SelectCourseServlet extends HttpServlet {

    //array of objects used to hold database data
    ArrayList<Course> courseList = new ArrayList<Course>();
    ArrayList<Course> coursesSelected = new ArrayList<Course>();
    String url;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        url = "/view/index.jsp";

        //String action = request.getParameter("action");
        HttpSession session = request.getSession();

        //session.setAttribute("courseList", courseList);
        if (request.getParameter("homepage") != null) {
            courseList.clear();
            courseList.add(0, new Course("Art", "110", "Intro to Art", "MW, 2:00-3:00", "A256", "Bosch", "3", "111111"));
            courseList.add(1, new Course("CIS", "110", "Intro to Programming", "TBD", "F115", "Turing", "3", "222221"));
            courseList.add(2, new Course("ENG", "100", "Freshmen English", "TBD", "A130", "Forster-Wallace", "3", "333331"));
            courseList.add(3, new Course("HIST", "110", "Intro to History", "TBD", "C253", "Pettibone", "3", "444441"));
            
            session.setAttribute("courseList", courseList);
            url = "/view/courseList.jsp";
            
            for (int i = 0; i < courseList.size(); i++)
            {
                coursesSelected.add(courseList.get(i));
            }
            
            session.setAttribute("coursesSelected", coursesSelected);
            url = "/view/select_course_results.jsp";

        } 
        //to do: add code as needed like lines 34-50 of example
        else {
            url = "/view/index.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}
