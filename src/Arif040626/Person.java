package Arif040626;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class Person {

    protected String name;
    protected String address;

    /**
     * Default constructor
     */
    public Person() {
        System.out.println("Inside Person:Constructor");
        name = "Anna";
        address = "Padang";
    }

    /**
     * Constructor dengan dua parameter
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Method accessor
     */
    public String getName() {
        System.out.println("getName() Person");
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String add) {
        this.address = add;
    }
}
