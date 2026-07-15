/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arif300426;

/**
 *
 * @author LAB-SI-PC
 */
public class RentalMobilExample {
    public static void main(String[] args){
        DataRentalMobil data = new DataRentalMobil();
        
        RentalMobil b1 = new RentalMobil("001", "Ali", "Toyota", "5");
        data.insert(b1, 0);
        
        RentalMobil b2 = new RentalMobil("002", "Budi", "BMW", "4");
        data.insert(b2, 1);
        
        data.view();
    }
}
