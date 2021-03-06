/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.controller;

import besteman.model.AcademicRecord;
import besteman.model.StudentInfo;
import besteman.model.database.DBAcademicRecord;
import besteman.model.database.DBStudent;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author freddybeste
 */

@WebServlet(name = "AcademicRecordsServlet", urlPatterns = {"/AcademicRecordsServlet"})
public class AcademicRecordsServlet extends HttpServlet {
    
    ArrayList<AcademicRecord> record = new ArrayList<AcademicRecord>();
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
            throws ServletException, IOException 
    {
        url = "/view/review_academic.jsp";
        
        HttpSession session = request.getSession();
        
        if (request.getParameter("student_number") != null)
        {
            String student_number = request.getParameter("student_number");
            session.setAttribute("student_number", student_number);
            
            StudentInfo student = new StudentInfo();
            student = DBStudent.selectStudent(student_number);
            
            String studentNumber = student.getStudentNumber();
            String studentName = student.getStudentName();
            session.setAttribute("studentNumber", studentNumber);
            session.setAttribute("student", student);
            
            int totalCredits = DBAcademicRecord.getTotalCredits(studentNumber);
            session.setAttribute("totalCredits", totalCredits);
            
            double gpa = DBAcademicRecord.getGPA(studentNumber);
            session.setAttribute("gpa", gpa);
            
            record.clear();
            record = DBAcademicRecord.selectRecord(studentNumber);
            session.setAttribute("record", record);
            
            
            
            //session.setAttribute("totalCredits", totalCredits);
            
            url = "/view/academic_results.jsp";
        }
        else
        {
            url = "/view/review_academic.jsp";
        }
        
        getServletContext().getRequestDispatcher(url).forward(request, response);
        
    }
    
//    public static int addCredits(int credits)
//    {
//        int totalCredits = 0;
//        
//        totalCredits = credits++;
//        
//        return totalCredits;
//    }

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
