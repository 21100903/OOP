/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newproj;

/**
 *
 * @author User
 */
public class CommissionEmployeeV1 {
    private double totalSales;
    private String empName;
    private int empID;

    public CommissionEmployeeV1(double totalSales, String empName, int empID) {
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
    }

    public CommissionEmployeeV1(String empName) {
        this.empName = empName;
    }

    public CommissionEmployeeV1(double totalSales, int empID) {
        this.totalSales = totalSales;
        this.empID = empID;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }
    
    public double computeSalary(){
        if(this.totalSales < 10000){
            return this.totalSales * 0.05;
        } else if(this.totalSales >= 10000 && this.totalSales < 100000){
            return this.totalSales * 0.1;
        } else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            return this.totalSales * 0.2;
        } else {
           return this.totalSales * 0.3;
        }
    }    

    public void displayHourlyEmployee(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployee ID: ").append(empID);
        sb.append("\nEmployee Name: ").append(empName);
        sb.append("\nTotal Sales: ").append(totalSales);
        sb.append("\nComputed Salary: ").append(computeSalary());
        return sb.toString();
    }
}
