/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.controller;

import besteman.model.Course;
import besteman.model.Grades;
import besteman.model.database.DBCourse;
import besteman.model.database.DBGrades;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author freddybeste
 */
public class DataOperationsServlet extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        
        
        String insertMessage = null;
        int insertResult;
        Course insertCourse;
        String insertCourseCode = "111113";
        
        Grades newGrade;
        int insertResultGrade;
        String insertGradeTitle = "Drawing I";
        
        String selectMessage;
        int selectResult;
        String selectCourseCode = "111112";
        
        String deleteMessage;
        int deleteResult;
        String deleteCourseCode = "111113";
        
        String selectAllMessage = null;
        int selectAllResult;
        
        
        try (PrintWriter out = response.getWriter()) {
            
            insertCourse = new Course(insertCourseCode, "Art", "200", "Drawing II", "MW 12:30-2:30", "A777", "Schiele", 3);
            insertResult = DBCourse.insert(insertCourse);
            if(insertResult != 0) insertMessage = "Course" + insertCourse.getCourseTitle() + " inserted successfully.";
            else insertMessage = "Course "+insertCourse.getCourseTitle() + " insert failed";

            String code = "999999";
            newGrade = new Grades(code, "Algebra", "Jack Black", "C");
            insertResultGrade = DBGrades.insertGrades(newGrade);
            if(insertResultGrade != 0) insertMessage = "Course " + newGrade.getTitle() + " inserted successfully.";
            else insertMessage = "Course "+ newGrade.getTitle() + " insert failed";
            
            
            
            //possibly have to change selectCourse to selectResult
            Course selectCourse = new Course();
            selectCourse = DBCourse.selectCourse(selectCourseCode);
            if(selectCourse != null) selectMessage = "Course " + selectCourseCode + " selected";
            else selectMessage = "Course " + selectCourseCode + " not selected";
            
            //select grades test
//            String selectCourseTitle = "Algebra";
//            String gradeMessage;
//            ArrayList<Grades> gradeList = new ArrayList<Grades>();
//            gradeList = DBGrades.selectCourseGrade(selectCourseTitle);
//            if(gradeList != null) gradeMessage = "Array has been made.";
//            else gradeMessage = "failed";
            
            
            Course deleteCourse = new Course();
            deleteResult = DBCourse.deleteCourse(deleteCourseCode);
            if(deleteResult != 0) deleteMessage = "Course " + deleteCourse.getCourseTitle() + " was deleted.";
            else deleteMessage = "Course " + deleteCourse.getCourseTitle() + " wasn't deleted.";
            
            ArrayList<Course> courseList = new ArrayList<Course>();
            courseList = DBCourse.selectAllCourses();
            if(courseList != null) selectAllMessage = "Array has been made.";
            else selectAllMessage = "failed";
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TestServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DataOperationsServlet at " + request.getContextPath() + "</h1>");
            out.println(insertMessage + "</br>");
            out.println(selectMessage + "</br>");
            out.println(deleteMessage + "</br>");
            out.println(selectAllMessage + "</br>");
//           out.println(gradeMessage + "</br>");

            out.println("</body>");
            out.println("</html>");
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DataOperationsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DataOperationsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
