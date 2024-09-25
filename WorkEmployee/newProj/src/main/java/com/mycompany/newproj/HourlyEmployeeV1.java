/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newproj;

/**
 *
 * @author User
 */
public class HourlyEmployeeV1{
    private float hoursWorked;
    private double hourlyRate;
    private String empName;
    private int empID;
       
    
public HourlyEmployeeV1(){
    
}

public HourlyEmployeeV1(int hourlyRate, int hoursWorked, String empName, int empID){
    this.empID = empID;
    this.hoursWorked = (float) hoursWorked;
    this.hourlyRate = hourlyRate;
    this.empName = empName;
}


public HourlyEmployeeV1(double hourlyRate, String empName) {
        this.hourlyRate = hourlyRate;
        this.empName = empName;
}


    public HourlyEmployeeV1(float hoursWorked, int empID) {
        this.hoursWorked = hoursWorked;
        this.empID = empID;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    
    public double computeSalary(){
        double hw = hoursWorked;
        double salary;
        double bonus = 1.5;
        if(hw > 40){
            salary = hoursWorked * hourlyRate * bonus;
        }
        else{
            salary = hoursWorked * hourlyRate;
        }
        return salary;
    }
    
    public void displayHourlyEmployee(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployee ID: ").append(empID);
        sb.append("\nEmployee Name: ").append(empName);
        sb.append("\nHours Worked: ").append(hoursWorked);
        sb.append("\nHourly Rate: ").append(hourlyRate);
        sb.append("\nComputed Piece Salary: ").append(computeSalary());
        return sb.toString();
    }
    

}
