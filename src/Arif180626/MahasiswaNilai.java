package Arif180626;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class MahasiswaNilai extends Mahasiswa {
    private Double tugas;
    private Double uts;
    private Double uas;
    private Double nilaiAngka;
    private String nilaiHuruf;
    
    public MahasiswaNilai(){
    
    }

    public MahasiswaNilai(double tugas, double uts, double uas, double nilaiAngka) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.nilaiAngka = nilaiAngka;
    }

    public MahasiswaNilai(String nilaiHuruf) {
        this.nilaiHuruf = nilaiHuruf;
    }
    

    public double getTugas() {
        return tugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getNilaiAngka() {
        nilaiAngka = (0.3*tugas) + (0.3*uts) + (0.4 * uas);
        return nilaiAngka;
    }


    public String getNilaiHuruf() {
        if(nilaiAngka>85){
            nilaiHuruf = "A";
        }else if(nilaiAngka>65){
            nilaiHuruf = "B";
        }else if(nilaiAngka>50){
            nilaiHuruf = "C";
        }else if(nilaiAngka>40){
            nilaiHuruf = "D";
        }else{
            nilaiHuruf = "E";
        }
        return nilaiHuruf;
    }    
}
