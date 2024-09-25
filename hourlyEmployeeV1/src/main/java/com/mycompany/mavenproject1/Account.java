/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */
public class Account {
    
    
    public static void main(String[] args) {
        
        AccountDetails a1 = new AccountDetails(1500, 2500, "Dusky Saballa", 21100903);
        AccountDetails a2 = new AccountDetails(1500, 2500, "John Lorenz Codilla", 21100904);
        
        a1.display();
        a2.display();
        a1.transfer(a2, 1000);
        a1.display();
        a2.display();
        CarProperties c1 = new CarProperties(100, 10, "Red", "Vios", "Toyota", "123ert");
        c1.display();
        c1.Deccelerate();
        c1.Deccelerate();
        
    }
}
