package com.mycompany.employeeseries;

public class HE extends Employee {
    
    private float TotalHrsWrk;
    private float raterPerHr;

    public HE(){
        
    }
    public HE(float totalHrsWrk){
        this.TotalHrsWrk = totalHrsWrk;
    }

    public HE(float totalHrsWrk, float raterPerHr) {
        TotalHrsWrk = totalHrsWrk;
        this.raterPerHr = raterPerHr;
    }

    public HE(int empID, float totalHrsWrk, float raterPerHr) {
        super(empID);
        TotalHrsWrk = totalHrsWrk;
        this.raterPerHr = raterPerHr;
    }

    public HE(int empID, String empName, float totalHrsWrk, float raterPerHr) {
        super(empID, empName);
        TotalHrsWrk = totalHrsWrk;
        this.raterPerHr = raterPerHr;
    }

    // Getters and Setters
    public float getTotalHrsWrk() {
        return TotalHrsWrk;
    }

    public void setTotalHrsWrk(float totalHrsWrk) {
        TotalHrsWrk = totalHrsWrk;
    }

    public float getRaterPerHr() {
        return raterPerHr;
    }

    public void setRaterPerHr(float raterPerHr) {
        this.raterPerHr = raterPerHr;
    }

    public float computeSalary() {
        return TotalHrsWrk * raterPerHr;
    }

    public void displayEmployee() {
        System.out.println(toString() + computeSalary());
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nTotal Hours Worked: %.2f\nRate Per Hour: %.2f\n",
            getEmpID(), getEmpName(), TotalHrsWrk, raterPerHr);
    }
}
