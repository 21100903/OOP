package com.mycompany.employeeseries;

public class CE extends Employee {
    private double TotalSales;

    
    public CE(){}


    public CE(int empID){
        super(empID);
    }
    public CE(double totalSales) {
        TotalSales = totalSales;
    }

    public CE(int empID, double totalSales) {
        super(empID);
        TotalSales = totalSales;
    }

    public CE(int empID, String empName, double totalSales) {
        super(empID, empName);
        TotalSales = totalSales;
    }

    public double getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(double totalSales) {
        TotalSales = totalSales;
    }

    public double computeSalary() {
        if (TotalSales <= 10000) {
            return TotalSales * 0.05;
        } else if (TotalSales <= 100000) {
            return TotalSales * 0.10;
        } else if (TotalSales <= 1000000) {
            return TotalSales * 0.20;
        } else {
            return TotalSales * 0.30;
        }
    }


    public void displayEmployee() {
        System.out.println(toString() + computeSalary());
    }

    @Override
    public String toString() {
        return String.format("[\nEmployee ID = %d | \nEmployee Name = %s | \nTotal Sales = %.2f]",
                getEmpID(), getEmpName(), TotalSales);
    }
}
