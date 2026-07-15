package Arif180626;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class Pegawai {
    private int NIP;
    private String Nama;
    private String Golongan;
    private double GajiPokok; // bedarsarkan gol
    private double Tunjangan; // 10%
    private double Potongan; 
    private double GajiBersih; // pokok + tunjang - potongan
    
    public Pegawai(){
        
    }
    
    public Pegawai(String temp){
        this.Nama = temp;
    }
    
    public Pegawai(String Nama,String Golongan){
        this.Nama = Nama;
        this.Golongan = Golongan;
    }
    
    public int getNIP(){
        return NIP;
    }
    
    public void setNIP(int NIP){
        this.NIP = NIP;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public String getGolongan(){
        return Golongan;
    }
    
    public void setGolongan(String Golongan){
        this.Golongan = Golongan;
        if(Golongan.equals("1A")){
            this.GajiPokok = 300000;    
        } else if(Golongan.equals("1B")){
            this.GajiPokok = 400000;
        } else{
            this.GajiPokok = 500000;
        }
        
    }
    public double getGajipokok(){
        return GajiPokok;
    }
    
    public void setGajipokok(double Gajipokok){
        this.GajiPokok = Gajipokok;
    }
    
    public double getTunjangan(){
        Tunjangan = GajiPokok * 0.1;
        return Tunjangan;
    }
    
    public void setTunjangan(double Tunjangan){
        this.Tunjangan = Tunjangan;
        this.Tunjangan = 0.10 * this.GajiPokok;
    }
    
    public double getPotongan(){
        return Potongan;
    }
    
    public void setPotongan(double Potongan){
        this.Potongan = Potongan;
    }  
    public double getGajibersih(){
        return GajiBersih;
    }
    
    public void setGajibersih(double Gajibersih){
        this.GajiBersih = GajiBersih;
        this.GajiBersih = (this.GajiPokok + this.Tunjangan) - this.Potongan;
    }  
    
    
}