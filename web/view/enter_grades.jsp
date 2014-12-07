<%-- 
    Document   : enter_grades
    Created on : Dec 6, 2014, 3:41:00 PM
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
        <h4>Welcome Professor     </h4>
        <h4>Term: <%=request.getAttribute("term")%> Course: <%=request.getAttribute("courseTitle")%></h4>

        <table>
            <thead>
                <tr>
                    <th>Student Name</th>
                    <th>Grade</th>
                </tr>
            </thead>
            <tbody>



            </tbody>




        </table>

        <form action="enterGradesServlet" method="post"> 

            <label>Student: </label>
            <input type="text" name="student_name" required>
            <label>Grade: </label>
            <input type="text" name="grade" required>

            <input class="button" type="submit" name="action" value="Enter Grade">
        </form>

        <c:import url="footer.jsp" />

    </body>
</html>    

