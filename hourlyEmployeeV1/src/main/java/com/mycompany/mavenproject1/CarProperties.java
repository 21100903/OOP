/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */
public class CarProperties {
    private int topSpeed;
    private int currSpeed;
    private String color;
    private String model;
    private String Manufacturer;
    private String PlateNumber;
    
    public CarProperties(){ 
}
    public CarProperties(int topSpeed, int currSpeed, String color, String model, String Manufacturer, String PlateNumber){
        this.topSpeed = topSpeed;
        this.currSpeed = currSpeed;
        this.color = color;
        this.model = model;
        this.Manufacturer = Manufacturer;
        this.PlateNumber = PlateNumber;
    }
    
    public boolean Accelerate(){
        if(this.currSpeed < this.topSpeed){
            this.currSpeed+=10;
            System.out.println("The "+color+" "+Manufacturer+" "+model+"with a plate no. "+PlateNumber+" is accelerating from "+currSpeed +" to " + topSpeed);
            return true;
        }
        else{
            System.out.print("Vehicle dead ahh bro");
            return false;
        }
    }
    
    public boolean Deccelerate(){
        if(currSpeed > 0){
        currSpeed -= 10;
        return true;
        }
        else{
            System.out.print("Vehicle dead ahh slow  tf cuh");
            return false;
        }
                
    }

    @Override
    public String toString() {
        return "\nTop Speed: "+ topSpeed + "\nCurrent Speed: " + currSpeed + "\nColor: " + color + "\nModel: "+model + "\nManufacturer: "+Manufacturer +  "\nPlate Number: "+PlateNumber;
    }
    
    public void display(){
    System.out.println(toString());
}
    
}

