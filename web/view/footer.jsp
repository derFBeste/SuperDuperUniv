<%-- 
    Document   : footer
    Created on : Nov 16, 2014, 8:57:05 PM
    Author     : besteman
--%>

<%@page import="java.util.GregorianCalendar, java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);   
%>
<p>&copy; Copyright <%= currentYear %> Super Duper University</p>


