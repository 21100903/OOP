package com.mycompany.employeeseries;

public class Employee{
    private  int empID;
    private String empName;

    public Employee(){

    }

    public Employee(int empID){
        this.empID = empID;
    }
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }



    public int getEmpID() {
        return empID;
    }



    public void setEmpID(int empID) {
        this.empID = empID;
    }



    public String getEmpName() {
        return empName;
    }



    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
}

