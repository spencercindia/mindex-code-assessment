package com.mindex.challenge.data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Compensation {

    private Employee employee;
    private BigDecimal salary;
    private LocalDateTime effectiveDate;

    public Compensation(Employee emp, int salary, LocalDateTime effectiveDate) {
        this.employee = emp;
        this.salary = new BigDecimal(salary);
        this.effectiveDate = effectiveDate;
    }

    public Compensation() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = new BigDecimal(salary);
    }

    public LocalDateTime getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
}
