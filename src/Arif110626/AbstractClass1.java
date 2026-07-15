/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arif110626;

/**
 *
 * @author LAB-SI-PC
 */
//Abstract Class
abstract class Kendaraan {
    public abstract String getNama();
    public abstract int getMaxSpeed();
}

class Mobil extends Kendaraan {
       
        public String getNama(){
            return "Mobil";
        }
        
        @Override
        public int getMaxSpeed(){
            return 220;
}
}
class Motor extends Kendaraan {
        
        public String getNama(){
            return "Motor";
        }
        
        @Override
        public int getMaxSpeed(){
            return 100;
 }
}

//main class
public class AbstractClass1 {

    public static void main(String[] args) {

        Kendaraan mobil = new Mobil();
        Kendaraan motor = new Motor();

        System.out.println("Inova : " + mobil.getNama());
        System.out.println("Maksimal Kecepatan : "
                + mobil.getMaxSpeed() + " km/jam");
        System.out.println();
        System.out.println("beat : " + motor.getNama());
        System.out.println("Maksimal Kecepatan : "
                + motor.getMaxSpeed() + " km/jam");
    }
}
