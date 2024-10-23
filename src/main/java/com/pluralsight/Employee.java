package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String employeeId, name, department;
    float payRate, hoursWorked;

    public Employee(String employeeId, String name, String department, float payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getTotalPay() {
        return (this.getRegularHours() * this.payRate) + (getOvertimeHours()* 1.5f);
    }


    public float getRegularHours()
    {
        if (hoursWorked <= 40){
            return hoursWorked;
        }
        return 40;
    }


    public float getOvertimeHours() {
        if(this.hoursWorked > 40){
            return this.hoursWorked - 40;
        }
        return 0;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                ", totalPay=" + getTotalPay() +
                ", regularHours=" + getRegularHours()+
                ", overtimeHours=" + getOvertimeHours() +
                '}';
    }

    public double punchTimeCard(double in, double out) {
        double lunch;
        if (this.hoursWorked > 6)
        {
            lunch = 0.5;
        }else {lunch = 0;}

        return (out - in) + this.hoursWorked - lunch;
    }



}
