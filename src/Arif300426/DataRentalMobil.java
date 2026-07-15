/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arif300426;

/**
 *
 * @author LAB-SI-PC
 */
public class DataRentalMobil {
    RentalMobil[] data = new RentalMobil[5];
    
    public void insert(RentalMobil rental, int index){
        if(index >=0 && index < data.length){
            data[index] = rental;
        }else {
            System.out.println("index tidak valid");
        }
    }
    
    public void update(RentalMobil rentalBaru, int index){
        if(index >=0 && index < data.length){
            data[index] = rentalBaru;
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }
    
    public void delete(int index){
        if(index >=0 && index < data.length){
            data[index] = null;
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }
    
    public void view(){
        for(int i = 0; i<data.length;i++){
            if(data[i]!=null){
                System.out.println("Data ke--> "+(i+1));
                System.out.println("id penyewa      : "+data[i].getIdPenyewa());
                System.out.println("Nama            : "+data[i].getNama());
                System.out.println("Jenis Mobil     : "+data[i].getJenisMobil());
                System.out.println("Lama Sewa       : "+data[i].getLamaSewa());
                System.out.println("-------------------------------------------");
            }
        }
    }
}
