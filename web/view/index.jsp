<%-- 
    Document   : index
    Created on : Oct 10, 2014, 6:47:26 PM
    Author     : Fred Besteman
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<link rel="stylesheet" href="styles/main.css" type="text/css"/>

<!DOCTYPE html>
<html>
    <title>SDU: Main Menu</title>
    <c:import url="header.jsp" />
    <body>
        <h2>Main Menu</h2>

        <!--        <h3>Student Menu:</h3>-->
        <!--        <a href= "SelectCourseServlet?homepage=on">Select Courses</a><br/>
                <a href= "ReviewAcademicServlet?homepage=on">Review Academic Records</a><br/>
                <a href= "">Review Financial Records</a></br>
                <a href= "">Make a Payment</a></br></br>-->
        <!--        <h3>Instructors:</h3>-->
        <!--        <a href= "EnterGradesServlet?homepage=on">Enter Grades</a></br></br>
                <h3>Administration:</h3>
                <a href= "DataOperationServlet?homepage=on">Data Operations</a>-->

        <form action="actionControllerServlet" method="post">

            <h3>Student Menu:</h3>
            <input class="button" type="submit" name="action" value="Select Courses"></br> </br>
            <input class="button" type="submit" name="action" value="Review Academic Records"></br>
        </form>
        <form action="http://localhost:8888/SuperDuperUniv/financial_portal.php" method="post">
            <input class="button" type="submit" name="action" value="Payments & Financial Recoords"></br>
        </form>
        <form action="actionControllerServlet" method="post">

            <h3>Instructors:</h3>
            <input class="button" type="submit" name="action" value="Enter Grades"></br></br>

            <h3>Administration:</h3>
            <input class="button" type="submit" name="action" value="Data Operations"></br>

        </form>

        <c:import url="footer.jsp" />

    </body>
</html>
