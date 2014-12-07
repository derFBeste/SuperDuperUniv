/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.controller;

import besteman.model.Faculty;
import besteman.model.Grades;
import besteman.model.database.DBFaculty;
import besteman.model.database.DBGrades;
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
@WebServlet(name = "EnterGradesServlet", urlPatterns = {"/EnterGradesServlet"})
public class EnterGradesServlet extends HttpServlet {

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
        String url = "/index.jsp";
        
        String action = request.getParameter("action");
                
        HttpSession session = request.getSession();
        
        String password = request.getParameter("password");
        String term = request.getParameter("term");
        String courseTitle = request.getParameter("courseTitle");
                
        String student_name = request.getParameter("student_name");
        String grade = request.getParameter("grade");
        
        ArrayList<Grades> gradeList = new ArrayList<Grades>();
        //String instructor = DBFaculty.getInstructor("password");
        
        if (action.equals("Submit"))
        {
            session.setAttribute("password", password);
            session.setAttribute("term", term);
            session.setAttribute("courseTitle", courseTitle);
            
            Faculty faculty = new Faculty();
            faculty = DBFaculty.passwordCheck(password);
            //add logic here in case of incorrect password
            
            String instructor = faculty.getFaculty_name();
            
//            request.setAttribute("term", term);
//            request.setAttribute("courseTitle", courseTitle);
            session.setAttribute("instructor", instructor);
            gradeList.clear();
            gradeList = DBGrades.selectCourseGrade(courseTitle);
            session.setAttribute("gradeList", gradeList);
            
            url = "/view/enter_grades.jsp";

        }
        
        else if (action.equals("Enter Grade"))
        {
            String title = (String) session.getAttribute("courseTitle");
            request.setAttribute("student_name", student_name);
            request.setAttribute("grade", grade);
            
            Grades newGrade = new Grades(title, student_name, grade);
            DBGrades.insertGrades(newGrade);
            
            url = "/view/enter_grades.jsp";
        }
            
        else
        {
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
