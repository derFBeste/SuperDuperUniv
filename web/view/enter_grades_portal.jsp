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
        <form action="EnterGradesServlet" method="post"> 
            <label>Please enter your password: </label>
            <input type="password" name="password" required><br><br>
            <!--<input type="submit" name="action" value="submit"><br><br>--> 
            <label>Term: </label>
            <input type="text" name="term" required><br>
            <label>Course Title: </label>
            <input type="text" name="courseTitle" required><br> 
  
            <input class="button" type="submit" name="submit" value="Submit">
        </form>
        <c:import url="footer.jsp" />

    </body>
</html>