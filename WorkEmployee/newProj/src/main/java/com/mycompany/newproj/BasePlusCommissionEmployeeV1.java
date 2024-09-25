/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newproj;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployeeV1 {
    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empID;

    public BasePlusCommissionEmployeeV1(int empID, int baseSalary, String empName, int totalSales) {
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
        this.empName = empName;
        this.empID = empID;
    }

    public BasePlusCommissionEmployeeV1(double totalSales, double baseSalary) {
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployeeV1(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
  

    public double getTotalSales() {
        return totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double computeSalary(){
        float rate = 0; 
        if(this.totalSales < 10000){
            rate = 0.05f;
        } else if(this.totalSales >= 10000 && this.totalSales < 100000){
            rate = 0.1f;
        } else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            rate = 0.2f;
        } else {
           rate = 0.3f;
        }
        return rate * totalSales + this.baseSalary;
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


