/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.model;

import java.io.Serializable;

/**
 *
 * @author Fred Besteman
 */
public class Course implements Serializable
{
    private String courseDept;
    private String courseNumber;
    private String courseTitle;
    private String courseDayNTime;
    private String courseRoom;
    private String courseInstructor;
    private int courseCredit;
    private String courseCode;
    
    public Course(String courseCode, String courseDept, String courseNumber,String courseTitle,String courseDayNTime,String courseRoom, String courseInstructor, int courseCredit)
    {

        
        this.courseDept = courseDept;
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
        this.courseDayNTime = courseDayNTime;
        this.courseRoom = courseRoom;
        this.courseInstructor = courseInstructor;
        this.courseCredit = courseCredit;
        this.courseCode = courseCode;     
    }
    
    public Course()
    {
        courseDept = "";
        courseNumber = "";
        courseTitle = "";
        courseDayNTime = "TBA";
        courseRoom = "TBA";
        courseInstructor = "TBA";
        courseCredit = 0;
        courseCode = "";
        
        
    }  
    public String getCourseDept() {
        return courseDept;
    }

    public void setCourseDept(String courseDept) {
        this.courseDept = courseDept;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDayNTime() {
        return courseDayNTime;
    }

    public void setCourseDayNTime(String courseDayNTime) {
        this.courseDayNTime = courseDayNTime;
    }

    public String getCourseRoom() {
        return courseRoom;
    }

    public void setCourseRoom(String courseRoom) {
        this.courseRoom = courseRoom;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
  
}
