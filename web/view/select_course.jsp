<%-- 
    Document   : select_course_message
    Created on : Oct 9, 2014, 8:48:03 PM
    Author     : Fred Besteman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>

        <title>Course Selection</title>
    </head>
    <body>
        <h2>Select Courses Below:</h2>

        <form action ="SelectCourseServlet" method="post">
            <table>
                <thead>
                <tr>
                    <th></th>
                    <th>Dept</th>
                    <th>Number</th>
                    <th>Title</th>
                    <th>Days & Time</th>
                    <th>Room</th>
                    <th>Instructor</th>
                    <th>Credits</th>
                    <th>Course Code</th>
                </tr>
                </thead>
                
                
                <tr>
                    <th><input type="checkbox" name="course" value="111111"></th>
                    <th>Art</th>
                    <th>110</th>
                    <th>Intro to Art</th>
                    <th>MW, 2:00-3:00</th>
                    <th>A256</th>
                    <th>Bosch</th>
                    <th>3</th>
                    <th>111111</th>
                </tr>

                <tr>
                    <th><input type="checkbox" name="course" value="222221"></th>
                    <th>CIS</th>
                    <th>110</th>
                    <th>Intro to Programming</th>
                    <th>TBD</th>
                    <th>F115</th>
                    <th>Turing</th>
                    <th>3</th>
                    <th>222221</th>
                </tr> 

                <tr>
                    <th><input type="checkbox" name="course" value="333331"></th>
                    <th>ENG</th>
                    <th>100</th>
                    <th>Freshmen English</th>
                    <th>TBD</th>
                    <th>A130</th>
                    <th>Foster-Wallace</th>
                    <th>3</th>
                    <th>333331</th>
                </tr> 

                <tr>
                    <th><input type="checkbox" name="course" value="444441"></th>
                    <th>HIST</th>
                    <th>110</th>
                    <th>Intro to History</th>
                    <th>TBD</th>
                    <th>C253</th>
                    <th>Pettibone</th>
                    <th>3</th>
                    <th>444441</th>
                </tr> 

                <tr>
                    <th><input type="checkbox" name="course" value="555551"></th>
                    <th>JPN</th>
                    <th>125</th>
                    <th>Beginning Japanese</th>
                    <th>TBD</th>
                    <th>F167</th>
                    <th>Hosotani</th>
                    <th>3</th>
                    <th>555551</th>
                </tr> 

                <tr>
                    <th><input type="checkbox" name="course" value="666661"></th>
                    <th>MTH</th>
                    <th>100</th>
                    <th>Alegbra I</th>
                    <th>TBD</th>
                    <th>C188</th>
                    <th>Viete</th>
                    <th>3</th>
                    <th>666661</th>
                </tr> 
            </table>
            <input type="submit" name="action" value="Submit">
            <input type="submit" name="action" value="Go Back">
        </form>    
    </body>
</html>
