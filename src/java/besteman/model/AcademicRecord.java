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
    private String instructor;
    private String courseTitle;
    private String dayNtime;
    private String term;
    private int credits;
    private String grade;
    
    public AcademicRecord(String studentNumber, String courseTitle, String instructor, String dayNtime, String term, int credits, String grade)
    {
        this.studentNumber = studentNumber;
        this.courseTitle = courseTitle;
        this.instructor = instructor;
        this.dayNtime = dayNtime;
        this.term = term;
        this.credits = credits;
        this.grade = grade;
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

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getDayNtime() {
        return dayNtime;
    }

    public void setDayNtime(String dayNtime) {
        this.dayNtime = dayNtime;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    
}
