<%-- 
    Document   : enter_grades
    Created on : Oct 19, 2014, 5:26:23 PM
    Author     : freddybeste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>

        <title>Grade Entry</title>
    </head>
    <body>
        <h2>Select Courses Below:</h2>
        
        <table>
            <tr>
                <th>DEPT</th>
                <th>NUMBER</th>
            </tr>
            <tr>
                <th>
                    <select name="DEPT">
                        <option value="CIS">CIS</option>
                        <option value="ENG">ENG</option>
                        <option value="JPN">JPN</option>
                    </select>
                </th>
                
                <th>
                    <select name="NUMBER">
                        <option value="1000">1000</option>
                        <option value="2000">2000</option>
                        <option value="3000">3000</option>
                    </select>                    
                    
                </th>
                                       
            </tr>                        
        </table>
            <br>
            <form action="enterGradesServlet" method="post">    
            <label>Student Number: </label>
            <input type="text" name="studentNumber" required=""><br>
            <label>Enter Grade: </label>
            <input type="text" name="grade"><br> 
        </form>
            
        <form action="enterGradesServlet" method="post">    
            <input type="submit" name="action" value="Submit">
            <input type="submit" name="action" value="Go Back">
        </form>    
    </body>
</html>