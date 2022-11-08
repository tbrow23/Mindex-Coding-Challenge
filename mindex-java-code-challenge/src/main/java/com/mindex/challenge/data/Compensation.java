/**
 * Data class for a Compensation.
 */
package com.mindex.challenge.data;

import java.util.Date;

public class Compensation {
    private String employee;
    private int salary;
    private Date effectiveDate;
    
    public Compensation(){
    }

    public String getEmployee() {
        return employee;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}
