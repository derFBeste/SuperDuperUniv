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
    private String courseName;
    private String grade;
    
    public AcademicRecord(String studentNumber, String studentName, String courseName, String grade)
    {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.courseName = courseName;
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    
    
}
