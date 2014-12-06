<%-- 
    Document   : select_course_message
    Created on : Oct 9, 2014, 8:48:03 PM
    Author     : Fred Besteman
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="besteman.model.Course"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="styles/main.css" type="text/css"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>

        <title>SDU: Course Selection</title>
        <c:import url="header.jsp" />
    </head>
    <body>
        <h2>Winter 2015</h2>
        <h2>Select Courses Below:</h2>

        <form action ="SelectCourseServlet" method="post">
            <table>
                <thead>
                    <tr>
                        <th></th>
                        <th>Dept</th>
                        <th>Number</th>
                        <th>Title</th>
                        <th>Days & Time</th>
                        <th>Room</th>
                        <th>Instructor</th>
                        <th>Credits</th>
                        <th>Course Code</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        ArrayList<Course> courseList = (ArrayList<Course>) session.getAttribute("courseList");

                        for (int i = 0; i < courseList.size(); i++) {
                    %>

                    <tr>
                        <td><input type="checkbox" name='<%="check" + i%>' value='ON'</td>

                        <td><%=courseList.get(i).getCourseDept()%></td>
                        <td><%=courseList.get(i).getCourseNumber()%></td>
                        <td><%=courseList.get(i).getCourseTitle()%></td>
                        <td><%=courseList.get(i).getCourseDayNTime()%></td>
                        <td><%=courseList.get(i).getCourseRoom()%></td>
                        <td><%=courseList.get(i).getCourseInstructor()%></td>
                        <td><%=courseList.get(i).getCourseCredit()%></td>
                        <td><%=courseList.get(i).getCourseCode()%></td>
                    </tr>
                    <% }%>

                </tbody>
            </table>
            <input type="submit" name="submit_courses" value="Submit">
            <input type="submit" name="go_home" value="Home">

            <c:import url="footer.jsp" />

        </form>    
    </body>
</html>
