/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fred Besteman
 */
public class ActionControllerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");

        String url = "/view/index.jsp";
        
        String action= request.getParameter("action");
//        String action_2 = request.getParameter("payment");
//        String action_3 = request.getParameter("fin_records");
//        String action_4 = request.getParameter("academic_records");
//        String action_5 = request.getParameter("grades");
        
        
        if (action.equals("Select Courses"))
        {
            ///trigger the SelectCourseServlet so that it then redirects to select_course.jsp
            //url = "/view/select_course.jsp";
            //<a href= "SelectCourseServlet?homepage=on">
            
            url = "/SelectCourseServlet";
            
        }
        
        else if (action.equals("Make a Payment"))
        {
            url = "/view/payment_message.jsp";
        }
        
        else if (action.equals("Review Financial Records"))
        {
            url = "/view/review_financial_message.jsp";
        }
        
        else if (action.equals("Review Academic Records"))
        {
            url = "/view/review_academic.jsp";

        }

        else if (action.equals("Enter Grades"))
        {
            url = "/view/enter_grades.jsp";
        }
                
               
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
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
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }

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
