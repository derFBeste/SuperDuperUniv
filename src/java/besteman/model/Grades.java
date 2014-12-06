/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.model;

/**
 *
 * @author freddybeste
 */
public class Grades {
    
    String course_code;
    String title;
    String student_name;
    String grade;
    
    public Grades(String course_code, String title, String student_name, String grade)
    {
        this.course_code = course_code;
        this.title = title;
        this.student_name = student_name;
        this.grade = grade;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
}
