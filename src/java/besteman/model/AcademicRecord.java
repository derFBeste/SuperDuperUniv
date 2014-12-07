/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.model;

import java.io.Serializable;

/**
 *
 * @author freddybeste
 */
public class AcademicRecord implements Serializable {
    private String studentNumber;
    private String studentName;
    private String courseNumber;
    private String grade;
    
    public AcademicRecord(String studentNumber, String studentName, String courseNumber, String grade)
    {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.courseNumber = courseNumber;
        this.grade = grade;
    }    
    
    public AcademicRecord(String studentNumber, String studentName, Course course)
    {
        
    }
    
        public AcademicRecord()
        {
            
        }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    
    
}
