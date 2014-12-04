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
public class StudentFinancial {
    
    String student_number;
    private String creditcard;
    private String current_due;
    private String past_payment;
    
    public StudentFinancial()
    {
        this.student_number = student_number;
        this.creditcard = creditcard;
        this.current_due = current_due;
        this.past_payment = past_payment;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }

    public String getCurrent_due() {
        return current_due;
    }

    public void setCurrent_due(String current_due) {
        this.current_due = current_due;
    }

    public String getPast_payment() {
        return past_payment;
    }

    public void setPast_payment(String past_payment) {
        this.past_payment = past_payment;
    }
    
}
