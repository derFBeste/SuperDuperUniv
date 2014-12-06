<%-- 
    Document   : review_academic_records
    Created on : Oct 9, 2014, 8:49:49 PM
    Author     : Fred Besteman
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="styles/main.css" type="text/css"/>

<html>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SDU: Academic Records</title>
    <c:import url="header.jsp" />

    <body>
        <form action="ReviewAcademicServlet" method="post">
            <h2>Academic Records:</h2>
            Student Number: <input type="text" name="student_number" required>
            <input type="submit" name="action" value="Submit"><br><br>
        </form>
        <form action="ReviewAcademicServlet" method="post">
            <input type="submit" name="action" value="Go Back">
        </form>
    <c:import url="footer.jsp" />


</body>
</html>
