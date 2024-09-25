package com.mycompany.employeeseries;

public class BPCE extends Employee {
    private double totalSales;
    private double baseSalary;

    public BPCE(){}
    
    public BPCE(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BPCE(double totalSales, double baseSalary) {
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }
    public BPCE(int empID, double totalSales, double baseSalary) {
        super(empID);
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }
    public BPCE(int empID, String empName, double totalSales, double baseSalary) {
        super(empID, empName);
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public double getTotalSales() {
        return totalSales;
    }
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary(){
        if (totalSales < 10000) {
            return (totalSales * 0.05) + baseSalary;
        } else if (totalSales < 100000 && totalSales >= 10000) {
            return (totalSales * 0.10) + baseSalary;
        } else if (totalSales < 1000000) {
            return (totalSales * 0.15) + baseSalary;
        } else { 
            return (totalSales * 0.20) + baseSalary;
        }
    }
    public void displayEmployeeDetails() {
        System.out.println(toString() + computeSalary());
    }

    @Override
    public String toString() {
        return String.format("\nEmployee[ID=%d, Name=%s, Total Sales=%.2f, Base Salary=%.2f]", getEmpID(), getEmpName(), totalSales, baseSalary);
    }


    
}

