<%-- 
    Document   : index
    Created on : Oct 10, 2014, 6:47:26 PM
    Author     : Fred Besteman
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <title>SDU: Main Menu</title>
    <c:import url="header.jsp" />
    <body>
        <h2>Main Menu</h2>
        <p>Select from the actions below:</p>

        <form action="actionControllerServlet" method="post">
            <a href= "SelectCourseServlet?homepage=on">Select Courses</a><br/>


                <!--        <input type="submit" name="action" value="Select Courses"><br>-->
<!--                <input type="submit" name="action" value="Make a Payment"><br>
                <input type="submit" name="action" value="Review Financial Records"><br>
                <input type="submit" name="action" value="Review Academic Records"><br>
                <input type="submit" name="action" value="Enter Grades(for instructors)"><br>    
                </form>-->

                <c:import url="footer.jsp" />

                </body>
                </html>
