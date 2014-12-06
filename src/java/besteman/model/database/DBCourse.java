/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.model.database;

import besteman.model.Course;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author freddybeste
 */
public class DBCourse {
    
        public static int insert(Course course) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO course (course_code, dept, course_number,"+
                "title, day_and_time, room, instructor, credits) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, course.getCourseCode());
            ps.setString(2, course.getCourseDept());
            ps.setString(3, course.getCourseNumber());
            ps.setString(4, course.getCourseTitle());
            ps.setString(5, course.getCourseDayNTime());
            ps.setString(6, course.getCourseRoom());
            ps.setString(7, course.getCourseInstructor());
            ps.setInt(8, course.getCourseCredit());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
        
        public static Course selectCourse(String courseCode)
        {
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection connection = pool.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            String query = "SELECT * FROM course " + "WHERE course_code = ? ";
            
            try
            {
                ps = connection.prepareStatement(query);
                ps.setString(1, courseCode);
                rs = ps.executeQuery();
                Course course = null;
                
                if(rs.next())
                {
                    course = new Course();
                    course.setCourseCode(rs.getString("course_code"));
                    course.setCourseDept(rs.getString("dept"));
                    course.setCourseNumber(rs.getString("course_number"));
                    course.setCourseTitle(rs.getString("title"));
                    course.setCourseDayNTime(rs.getString("day_and_time"));
                    course.setCourseRoom(rs.getString("room"));
                    course.setCourseInstructor(rs.getString("instructor"));
                    course.setCourseCredit(rs.getInt("credits"));

                }
                return course;
                
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
        
        public static int deleteCourse(String course_code) {
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection connection = pool.getConnection();
            PreparedStatement ps = null;

            String query = "DELETE FROM course "
                    + "WHERE course_code = ?";
            try {
                ps = connection.prepareStatement(query);
                ps.setString(1, course_code);

                return ps.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
                return 0;
            } finally {
                DBUtil.closePreparedStatement(ps);
                pool.freeConnection(connection);
            }
        }
    
}
