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
public class Student {
    
    protected String student_number;
    protected String student_name;
    private String address;
    private String zip;
    private String phone_number;
    
    public Student(String student_number, String student_name, String address, String zip, String phone_number)
    {
        this.student_number = student_number;
        this.student_name = student_name;
        this.address = address;
        this.zip = zip;
        this.phone_number = phone_number;
        
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
    
}
