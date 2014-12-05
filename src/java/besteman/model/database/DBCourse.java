/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.model.database;

import besteman.model.Course;
import java.sql.*;

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
    
}
