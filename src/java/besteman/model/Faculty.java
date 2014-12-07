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
public class Faculty implements Serializable {
    private String faculty_name;
    private String dept;
    private String p_word;
    
    
    public Faculty(String faculty_name, String dept, String p_word)
    {
        this.faculty_name = faculty_name;
        this.dept = dept;
        this.p_word = p_word;
        
    }
    
    public Faculty()
    {
        
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getP_word() {
        return p_word;
    }

    public void setP_word(String p_word) {
        this.p_word = p_word;
    }
    
    
    
}
