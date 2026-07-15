package Arif140426;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class StudentRecord {

    private String nama;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;

    // Constructor
    public StudentRecord() {
        studentCount++;
    }
    public StudentRecord(String temp){
        this.nama = temp;
    }
        
    public StudentRecord(String nama, String address){
        this.nama = nama;
        this.address = address;
        studentCount++;
    }
    
    public StudentRecord(double mGrade, double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
    }

    // Getter & Setter nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter & Setter address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter & Setter age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter & Setter mathGrade
    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    // Getter & Setter englishGrade
    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    // Getter & Setter scienceGrade
    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    // Hitung rata-rata
    public double getAverage() {
        return (mathGrade + englishGrade + scienceGrade) / 3;
    }

    // Static method
    public static int getStudentCount() {
        return studentCount;
    }
    
    public void print(String temp){
        System.out.println("Name                " +nama);
        System.out.println("Address             " +address);
        System.out.println("Age                 " +age);
    }
    
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name :" +nama);
        System.out.println("Math Grade :" +mGrade);
        System.out.println("English Grade :" +eGrade);
        System.out.println("Science Grade :" +sGrade);
    }
}