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
        
    public static double getGPA(String studentNumber)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT grade FROM academic_records WHERE student_number = ?";
        
        try
        {
            double GPA = 0.0;
            int counter = 0;
            double points = 0;
            String grade;
            
            ps = connection.prepareStatement(query);
            ps.setString(1, studentNumber);
            rs = ps.executeQuery();
            AcademicRecord record = null;
            
            if(rs != null)
            {
                while(rs.next())
                {              
                    if(rs.getString("grade").equals("A") )
                    {
                        points = points + 4;
                    }
                    else if(rs.getString("grade").equals("B"))
                    {
                        points = points + 3;
                    }
                    else if(rs.getString("grade").equals("C"))
                    {
                        points = points + 2;
                    }
                    else if (rs.getString("grade").equals("D"))
                    {
                        points = points + 1;
                    }
                    
                    counter++;
                }
            
                GPA = points / counter;
            }
            
            return GPA;
            
        }catch (SQLException e) {
                System.out.println(e);
                return 0;
            }
            finally{
                DBUtil.closeResultSet(rs);
                DBUtil.closePreparedStatement(ps);
                pool.freeConnection(connection);
            }       
             
    }
    
    public static int getTotalCredits(String studentNumber)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT credits FROM academic_records WHERE student_number = ?";
        
        try
        {
            int totalCredits = 0;
            ps = connection.prepareStatement(query);
            ps.setString(1, studentNumber);
            rs = ps.executeQuery();
            AcademicRecord record = null;
            
            while(rs.next())
            {              
                totalCredits += rs.getInt("credits");
                
            }
                
            return totalCredits;
            
        }catch (SQLException e) {
                System.out.println(e);
                return 0;
            }
            finally{
                DBUtil.closeResultSet(rs);
                DBUtil.closePreparedStatement(ps);
                pool.freeConnection(connection);
            }       
               
        
    }
    
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
