<%-- 
    Document   : index
    Created on : Oct 10, 2014, 6:47:26 PM
    Author     : Fred Besteman
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Course Actions</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <h1>Main Menu</h1>
    <p>Select from the actions below:</p>
    
    <form action="actionControllerServlet" method="post">
        <input type="submit" name="action" value="Select Courses"><br>
        <input type="submit" name="action" value="Make a Payment"><br>
        <input type="submit" name="action" value="Review Financial Records"><br>
        <input type="submit" name="action" value="Review Academic Records"><br>
        <input type="submit" name="action" value="Enter Grades(for instructors)"><br>    
    </form>
</body>
</html>
