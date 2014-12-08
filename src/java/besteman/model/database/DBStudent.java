/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.model.database;

import besteman.model.StudentInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author freddybeste
 */
public class DBStudent {
    
    public static StudentInfo selectStudent(String studentNumber)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM student_info WHERE student_number = ? ";
        

        try
        {
            ps = connection.prepareStatement(query);
            ps.setString(1, studentNumber);
            rs = ps.executeQuery();
            StudentInfo student = null;

        if(rs.next())
        {
            student = new StudentInfo();
            student.setStudentNumber(rs.getString("student_number"));
            student.setStudentName(rs.getString("student_name"));
            student.setStudentAddress(rs.getString("student_address"));
            student.setStudentZip(rs.getString("student_zip"));
            student.setStudentPhn(rs.getString("student_phn"));

        }
       
        return student;
        
        } catch (SQLException e) {
                    System.out.println(e);
                    return null;
                }
                finally{
                    DBUtil.closeResultSet(rs);
                    DBUtil.closePreparedStatement(ps);
                    pool.freeConnection(connection);
                }
    
    }
}
