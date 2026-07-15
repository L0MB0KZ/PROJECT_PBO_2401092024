package Arif040626;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class Student extends Person{
    
    public Student(){
        super("Anna", "Padang");
        System.out.println("Inside Student:Constructor");
    } 
    
    @Override
    public String getName() {
        System.out.println("getName() Person");
        return name;
    }
    
    public static void main(String[] args){
        Student anna = new Student();
        System.out.println(anna.name);
        System.out.println(anna.address);
    }
}
