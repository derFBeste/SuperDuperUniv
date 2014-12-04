/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.model;

/**
 *
 * @author besteman
 */
public class StudentAcademic {
    
    private String student_number;
    private String[] courses_taken;
    private String[] current_courses;
    private int credits;
    
    public StudentAcademic()
    {
        this.student_number = student_number;
        this.courses_taken = courses_taken;
        this.current_courses = current_courses;
        this.credits = credits;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String[] getCourses_taken() {
        return courses_taken;
    }

    public void setCourses_taken(String[] courses_taken) {
        this.courses_taken = courses_taken;
    }

    public String[] getCurrent_courses() {
        return current_courses;
    }

    public void setCurrent_courses(String[] current_courses) {
        this.current_courses = current_courses;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    
    
}
