package Arif180626;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class MahasiswaNilaiExample {
    public static void main(String[] args){
        MahasiswaNilai m = new MahasiswaNilai();
        m.setNIM("2401001");
        m.setNama("Ali");
        m.setAlamat("Padang");
        m.setTugas(80);
        m.setUas(80);
        m.setUts(70);
        
        System.out.println(m.getNIM());
        System.out.println(m.getNama());
        System.out.println(m.getAlamat());
        System.out.println(m.getTugas());
        System.out.println(m.getUts());
        System.out.println(m.getUas());
        System.out.println(m.getNilaiAngka());
        System.out.println(m.getNilaiHuruf());
    }
}
