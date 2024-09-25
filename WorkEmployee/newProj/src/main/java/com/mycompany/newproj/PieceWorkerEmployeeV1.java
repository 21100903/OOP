/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newproj;

/**
 *
 * @author User
 */
public class PieceWorkerEmployeeV1 {
    private int totalPiecesFinished; 
    private double ratePerPiece;
    private String empName;
    private int empID;

    public PieceWorkerEmployeeV1(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
        this.empName = empName;
        this.empID = empID;
    }

    public PieceWorkerEmployeeV1(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployeeV1(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double computeSalary(){
        if(this.totalPiecesFinished < 100){
            return this.ratePerPiece * this.totalPiecesFinished;
        } else {
            int temp = (this.totalPiecesFinished/100);
            return this.totalPiecesFinished*((temp*10)+this.ratePerPiece); 
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
        sb.append("\nRate per Piece: ").append(ratePerPiece);
        sb.append("\nTotal Pieces Finished: ").append(totalPiecesFinished);
        sb.append("\nComputed Piece Salary: ").append(computeSalary());
        return sb.toString();
    }
}