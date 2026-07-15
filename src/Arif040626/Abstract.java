package Arif040626;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class Abstract {
     public static void main(String[] args){
        Shape circle = new Circle(7);
        Square square = new Square(5);

        System.out.println(circle.getName() + " Area: " + circle.getArea());
        System.out.println(square.getName() + " Area: " + square.getArea());
    }
}
