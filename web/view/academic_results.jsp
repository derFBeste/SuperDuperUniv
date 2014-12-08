<%-- 
    Document   : academic_results
    Created on : Dec 7, 2014, 7:58:17 PM
    Author     : freddybeste
--%>

<%@page import="besteman.model.StudentInfo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="styles/main.css" type="text/css"/>

<html>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SDU: Academic Records</title>
    <c:import url="header.jsp" />

    <body>
        <form action="AcademicRecordsServlet" method="post">
            <h2>Academic Records:</h2><br>
            <%
                
                
            %>
            
            <h4>Student Number:  ${student.studentNumber}  Name:  ${student.studentName}</h4>
            <h4>GPA:      Credits:    </h4>
            <table>  
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Instructor</th>
                        <th>Days & Time</th>
                        <th>Grade</th>
                    </tr>
                </thead>            
            
            </table>
        </form>
    <c:import url="footer.jsp" />


</body>
</html>
