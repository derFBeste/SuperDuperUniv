<%-- 
    Document   : enter_grades
    Created on : Dec 6, 2014, 3:41:00 PM
    Author     : freddybeste
--%>


<%@page import="besteman.model.Grades"%>
<%@page import="java.util.ArrayList"%>
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
        <h4>Term: <%=session.getAttribute("term")%> Course: <%=session.getAttribute("courseTitle")%></h4>

        <table>
            <thead>
                <tr>
                    <th>Student Name</th>
                    <th>Grade</th>
                </tr>
            </thead>
            <tbody>
                <%
                    ArrayList<Grades> gradeList = (ArrayList<Grades>) session.getAttribute("gradeList");
                    
                    for (int i = 0; i < gradeList.size(); i++){
                %>

                <tr>
                    <td><%=gradeList.get(i).getStudent_name()%></td>
                    <td><%=gradeList.get(i).getGrade()%></td>                    
                </tr>
                
            </tbody>

            <% } %>


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

