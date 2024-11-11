/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseriesv4.version4;
/**
 *
 * @author User
 */
public class Employee {
    public Name name;
    public Date dateHired;
    public Date dob;
    public int id;

    public Employee() {
    }

    public Employee(Name name, int id) {
        this.name = new Name(name.getfName(), name.getlName(), name.getmName());
        this.id = id;
    }
    
    public Employee(Name name, Date dateHired, Date dob) {
        this.name = new Name(name.getfName(), name.getlName(), name.getmName());
        this.dateHired = new Date(dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
        this.dob = new Date(dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
    }

    public Employee(Name name, Date dateHired, Date dob, int id) {
        this(name, id);
        this.dateHired = new Date(dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
        this.dob = new Date(dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmployee Name: ").append(name.lName).append(", ").append(name.fName).append(", ").append("name.mName");
        sb.append("\nEmployee ID: ").append(id);
        sb.append("\nDate Hired: ").append(dateHired.month).append("/").append(dateHired.day).append("/").append(dateHired.year);    
        sb.append("\nDate of Birth: ").append(dob.month).append("/").append(dob.day).append("/").append(dob.year); 
        return sb.toString();
    }
    
}