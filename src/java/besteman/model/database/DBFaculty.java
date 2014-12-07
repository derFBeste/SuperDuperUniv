/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.model.database;

import besteman.model.Faculty;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author freddybeste
 */
public class DBFaculty {
    
    public static Faculty passwordCheck(String password)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM faculty WHERE p_word = ? ";
        
        String name = "";
        
        try
        {
            ps = connection.prepareStatement(query);
            ps.setString(1, password);
            rs = ps.executeQuery();
            Faculty faculty = null;
            
            if(rs.next())
            {
                faculty = new Faculty();
                faculty.setFaculty_name("name");
                faculty.setDept("dept");
                faculty.setP_word("p_word");
                
                name =  faculty.getFaculty_name();
            }
            
            
            return faculty;
        }catch(SQLException e){
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
