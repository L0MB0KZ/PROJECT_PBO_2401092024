/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arif300426;

/**
 *
 * @author LAB-SI-PC
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MenuRentalMobil {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DataRentalMobil data = new DataRentalMobil();

        int pilihan;

        do {
            System.out.println("\n===== MENU rENTAL MOBIL =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = Integer.parseInt(input.readLine());

            if (pilihan == 1) {

                System.out.print("Index (0-4): ");
                int index = Integer.parseInt(input.readLine());

                System.out.print("ID SEWA: ");
                String idPenyewa = input.readLine();

                System.out.print("NAMA: ");
                String nama = input.readLine();

                System.out.print("JENIS MOBIL: ");
                String jenisMobil = input.readLine();

                System.out.print("LAMA SEWA: ");
                String lamaSewa = input.readLine();

                RentalMobil b = new RentalMobil (idPenyewa, nama, jenisMobil, lamaSewa);
                data.insert(b, index);

            } else if (pilihan == 2) {
                data.view();

            } else if (pilihan == 3) {

                System.out.print("Index yang diupdate (0-4): ");
                int index = Integer.parseInt(input.readLine());

                System.out.print("ID PENYEWA BARU: ");
                String idPenyewa = input.readLine();

                System.out.print("NAMA BARU: ");
                String nama = input.readLine();

                System.out.print("JENIS MOBIL BARU: ");
                String jenisMobil = input.readLine();

                System.out.print("LAMA SEWA BARU: ");
                String lamaSewa = input.readLine();

                RentalMobil b = new RentalMobil(idPenyewa, nama, jenisMobil, lamaSewa);
                data.update(b, index);

            } else if (pilihan == 4) {
                System.out.print("Index yang dihapus (0-4): ");
                int index = Integer.parseInt(input.readLine());

                data.delete(index);
            }

        } while (pilihan != 5);

        System.out.println("Program selesai.");
    }
}

