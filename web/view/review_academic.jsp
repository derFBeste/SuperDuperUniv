<%-- 
    Document   : review_academic_records
    Created on : Oct 9, 2014, 8:49:49 PM
    Author     : Fred Besteman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Review Academic Records</title>
    </head>
    <body>
        <form action="ReviewAcademicServlet" method="post">
            <h2>Academic Records:</h2>
            Student Number: <input type="text" name="student_number" required>
            <input type="submit" name="action" value="Submit"><br><br>
        </form>
        <form action="ReviewAcademicServlet" method="post">
            <input type="submit" name="action" value="Go Back">
        </form>
        
        
    </body>
</html>
