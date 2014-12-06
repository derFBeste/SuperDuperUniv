<%-- 
    Document   : enter_grades
    Created on : Oct 19, 2014, 5:26:23 PM
    Author     : freddybeste
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="styles/main.css" type="text/css"/>

<!DOCTYPE html>
<html>

    <title>SDU: Grade Entry</title>
    <c:import url="header.jsp" />
    <body>
        <h2>Grade Entry</h2>

        <br>
        <form action="enterGradesServlet" method="post"> 
            <label>Please enter your password: </label>
            <input type="text" name="password" required=""><br><br>
            <!--<input type="submit" name="action" value="submit"><br><br>--> 
            <label>Term: </label>
            <input type="text" name="term" required=""><br>
            <label>Course Title: </label>
            <input type="text" name="courseTitle"><br> 
        </form>

        <form action="enterGradesServlet" method="post">    
            <input class="button" type="submit" name="action" value="Submit">
            <input class="button" type="submit" name="action" value="Go Back">
        </form>
        <c:import url="footer.jsp" />

    </body>
</html>