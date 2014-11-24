<%-- 
    Document   : select_course_results
    Created on : Oct 13, 2014, 9:19:41 PM
    Author     : Fred Besteman
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="besteman.model.Course"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
        <title>SDU: Selected Courses</title>
        <c:import url="header.jsp" />
    </head>
    <body>
        <h2>You are now enrolled in:</h2>
        <form action="SelectCourseServlet" method="GET">
            <table>  
                <thead>
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
                </thead>
                <tbody>
                    <%
                        ArrayList<Course> coursesSelected = (ArrayList<Course>) session.getAttribute("coursesSelected");
                        if (coursesSelected != null) {
                            for (int i = 0; i < coursesSelected.size(); i++) {
                    %>

                    <tr>
                        <th><%=coursesSelected.get(i).getCourseDept()%></th>
                        <th><%=coursesSelected.get(i).getCourseNumber()%></th>
                        <th><%=coursesSelected.get(i).getCourseTitle()%></th>
                        <th><%=coursesSelected.get(i).getCourseDayNTime()%></th>
                        <th><%=coursesSelected.get(i).getCourseRoom()%></th>
                        <th><%=coursesSelected.get(i).getCourseInstructor()%></th>
                        <th><%=coursesSelected.get(i).getCourseCredit()%></th>
                        <th><%=coursesSelected.get(i).getCourseCode()%></th>
                    </tr>
                    <%    }
            }%>
                </tbody>
            </table>
            <c:import url="footer.jsp" />
        </form>
    </body>
</html>
