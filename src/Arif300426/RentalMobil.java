/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arif300426;

/**
 *
 * @author LAB-SI-PC
 */
public class RentalMobil {
    private String idPenyewa;
    private String nama;
    private String jenisMobil;
    private String lamaSewa;
    private double harga;
    private double biayaTambahan;
    private double total;
    
    public RentalMobil(String idPenyewa, String nama, 
            String jenisMobil, String lamaSewa){
        this.idPenyewa = idPenyewa;
        this.nama = nama;
        this.jenisMobil = jenisMobil;
        this.lamaSewa = lamaSewa;
    }
    
    public String getIdPenyewa(){
        return idPenyewa;
    }
    public String getNama(){
        return nama;
    }
    public String getJenisMobil(){
        return jenisMobil;
    }
    public String getLamaSewa(){
        return lamaSewa;
    }
}
