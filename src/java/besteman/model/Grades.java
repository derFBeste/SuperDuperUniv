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
    
    String title;
    String student_name;
    String grade;
    
    public Grades(String title, String student_name, String grade)
    {
        this.title = title;
        this.student_name = student_name;
        this.grade = grade;
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
