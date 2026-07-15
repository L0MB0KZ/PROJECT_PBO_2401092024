package Arif040626;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class AbstractExample {

    public static void main(String[] args) {
        Manusia m = new Manusia();
        m.breath();
        m.eat();
        m.walk();

        Kuda k = new Kuda();
        k.breath();
        k.eat();
        k.walk();
    }
}
