/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.model.database;

import besteman.model.Course;
import besteman.model.Grades;
import static com.oracle.jrockit.jfr.ContentType.Class;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author freddybeste
 */
public class DBGrades {
    
    public static int insertGrades(Grades grade)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        
        String query = "INSERT INTO grades (course_code, title, student_name, grade)  " + "VALUES (?, ?, ?, ?)";
        
        try{
            ps = connection.prepareStatement(query);
            ps.setString(1, grade.getCourse_code());
            ps.setString(2, grade.getTitle());
            ps.setString(3, grade.getStudent_name());
            ps.setString(4, grade.getGrade());
            
            return ps.executeUpdate();
            
            
            
        }
                     catch (SQLException e) {
                System.out.println(e);
                return 0;
            } finally {
                DBUtil.closePreparedStatement(ps);
                pool.freeConnection(connection);
            }
        
        
    }
    
}
