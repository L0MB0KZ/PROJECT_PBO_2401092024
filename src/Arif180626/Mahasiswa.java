package Arif180626;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Alamat;
    
    public Mahasiswa(){
        
    }

    public Mahasiswa(String NIM, String Nama, String Alamat) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }
    
    

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
}
