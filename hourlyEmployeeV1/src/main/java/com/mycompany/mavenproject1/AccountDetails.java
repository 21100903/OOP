/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */
public class AccountDetails {
    private double currentBalance;
    private double availableBalance;
    private String accountName;
    private int accountNumber;
    
    public AccountDetails(){
    }
    
  public AccountDetails(double currentBalance, double availableBalance, String accountName, int accountNumber){
    this.currentBalance = currentBalance;
    this.availableBalance = availableBalance;
    this.accountNumber = accountNumber;
    this.accountName = accountName;
}
  //methods  
    public double checkCurr(){
        return this.currentBalance;
}
    public double checkAvail(){
        return this.availableBalance;
    }     
    
    public boolean divisibleby100(double amount){
        return amount % 100 == 0;
    }
    
    public boolean deposit(double amount){
      
        if(amount > 0 && divisibleby100(amount)){
            this.availableBalance += amount;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean withdraw(double amount){
        if(availableBalance - amount < 0 && divisibleby100(amount)){
            return false;
        }
        else{
            this.availableBalance -= amount;
            return true;
        }
    }
    
    public boolean transfer(AccountDetails a, double amount){
        a.deposit(amount);
        withdraw(amount);
        return true; 
   }

    @Override
    public String toString() {
        return  "\nAccount Number: "+ accountNumber + "\nAccount Name: " + accountName + "\nCurrent Balance: " + currentBalance + "\nAvailable Balance: "+availableBalance;
    }
    
    public void display(){
        System.out.println(this.toString());
        
}
   
}




