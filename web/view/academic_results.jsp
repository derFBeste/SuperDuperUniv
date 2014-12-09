<%-- 
    Document   : academic_results
    Created on : Dec 7, 2014, 7:58:17 PM
    Author     : freddybeste
--%>

<%@page import="besteman.model.AcademicRecord"%>
<%@page import="java.util.ArrayList"%>
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
            <h2>Academic Records:</h2>
            <h4>Student Number:  ${student.studentNumber}  Name:  ${student.studentName}</h4>
            <h4>GPA:      Credits:    </h4>
            <table>  
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Instructor</th>
                        <th>Days & Time</th>
                        <th>Grade</th>
                        <th>Credits</th>
                    </tr>
                </thead>            
                <tbody>
                    <%                      
                        ArrayList<AcademicRecord> record = (ArrayList<AcademicRecord>) session.getAttribute("record");
                        if (record != null) {
                            for (int i = 0; i < record.size(); i++){                       
                    %>
                    <tr>
                        <th><%=record.get(i).getCourseTitle()%></th>
                        <th><%=record.get(i).getInstructor()%></th>
                        <th><%=record.get(i).getDayNtime()%></th>
                        <th><%=record.get(i).getGrade()%></th>
                        <th><%=record.get(i).getCredits()%></th>                        
                    </tr>


                    <%  }
                        
                    }%>
                </tbody>
            </table>
        </form>
        <c:import url="footer.jsp" />

    </body>
</html>
