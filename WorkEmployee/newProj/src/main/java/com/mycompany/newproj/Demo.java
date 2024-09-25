/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newproj;

/**
 *
 * @author User
 */
public class Demo {

    public static void main(String[] args) {
        BasePlusCommissionEmployeeV1 bpce1;
        bpce1 = new BasePlusCommissionEmployeeV1(1, 500, "John", 10000);
        bpce1.displayHourlyEmployee();
        
        HourlyEmployeeV1 he1 = new HourlyEmployeeV1(20, 20, "Dusky Saballa", 1);
        he1.displayHourlyEmployee();
        HourlyEmployeeV1 he2 = new HourlyEmployeeV1(2, "Reitz");
        he2.displayHourlyEmployee();
        
        CommissionEmployeeV1 Ce1;
        Ce1 = new CommissionEmployeeV1(3000, "Jio", 3);
        Ce1.displayHourlyEmployee();
    }
}
