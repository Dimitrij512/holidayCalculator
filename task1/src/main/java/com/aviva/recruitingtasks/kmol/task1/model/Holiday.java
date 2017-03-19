package com.aviva.recruitingtasks.kmol.task1.model;

import java.time.LocalDate;

public class Holiday {

    private Employee employee;
    private LocalDate dateFrom;
    private LocalDate dateTo;

    public Holiday(Employee employee, LocalDate dateFrom, LocalDate dateTo) {
        this.employee = employee;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }
}
