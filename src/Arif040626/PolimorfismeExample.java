package Arif040626;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class PolimorfismeExample {
    public static void main(String[] args){
        Student student = new Student();
        Employee employee = new Employee();
        
        employee.name = "Budi";
        employee.address = "Padang";
        printInformation(employee);
        printInformation(student);
    }
    public static void printInformation(Person p){
        System.out.println("Nama    :" + p.getName());
        System.out.println("Alamat  :" + p.getAddress());
    }
}
