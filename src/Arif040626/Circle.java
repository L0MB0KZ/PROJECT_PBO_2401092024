package Arif040626;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String getName() {
        return "Lingkaran (Circle)";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    
    }
}

