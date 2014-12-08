/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besteman.model;

import java.io.Serializable;

/**
 *
 * @author besteman
 */
public class StudentInfo implements Serializable{
    
    private String studentNumber;
    private String studentName;
    private String studentAddress;
    private String studentZip;
    private String studentPhn;
    
    public StudentInfo(String studentNumber, String studentName, String studentAddress, String studentZip, String studentPhn)
    {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentZip = studentZip;
        this.studentPhn = studentPhn;
        
    }

    public StudentInfo()
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

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentZip() {
        return studentZip;
    }

    public void setStudentZip(String studentZip) {
        this.studentZip = studentZip;
    }

    public String getStudentPhn() {
        return studentPhn;
    }

    public void setStudentPhn(String studentPhn) {
        this.studentPhn = studentPhn;
    }


    
    
}
