/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.model.database;

import besteman.model.AcademicRecord;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author freddybeste
 */
public class DBAcademicRecord {
    
    
    
    public static ArrayList<AcademicRecord> selectRecord(String studentNumber)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM academic_records WHERE student_number = ?";
        
        try
        {
            ps = connection.prepareStatement(query);
            
            ps.setString(1, studentNumber);
            rs = ps.executeQuery();
            ArrayList<AcademicRecord> academicRecord = new ArrayList<>();
            AcademicRecord record = null;
            
            while(rs.next())
            {              
                academicRecord.add(new AcademicRecord(rs.getString("student_number"), rs.getString("course_title"), rs.getString("instructor"), rs.getString("days_and_time"),
                rs.getString("term"), rs.getInt("credits"), rs.getString("grade")));
                
            }
                
            return academicRecord;
            
        }catch (SQLException e) {
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
