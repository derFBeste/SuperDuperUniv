<%-- 
    Document   : select_course_results
    Created on : Oct 13, 2014, 9:19:41 PM
    Author     : Fred Besteman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="besteman.model.Course"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
        <title>Selected Courses</title>
    </head>
    <body>
        <h2>Congratulations! You are now enrolled in:</h2>
        <table>    
        <tr>
            <th>Dept</th>
            <th>Number</th>
            <th>Title</th>
            <th>Days & Time</th>
            <th>Room</th>
            <th>Instructor</th>
            <th>Credits</th>
            <th>Course Code</th>
        </tr>
        <%
        ArrayList<Course> coursesSelected = (ArrayList<Course>) session.getAttribute("coursesSelected");
        
        %>
        
        <tr>
            <th>${course.getCourseDept()}</th>
            <th>${course.getCourseNumber()}</th>
            <th>${course.getCourseTitle()}</th>
            <th>${course.getCourseDayNTime()}</th>
            <th>${course.getCourseRoom()}</th>
            <th>${course.getCourseInstructor()}</th>
            <th>${course.getCourseCredit()}</th>
            <th>${course.getCourseCode()}</th>
        </tr>
        </table>

</body>
</html>
