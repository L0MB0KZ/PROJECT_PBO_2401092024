/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arif180626;

/**
 *
 * @author LAB-SI-PC
 */
public class MahasiswaNilaiController {
    private final MahasiswaNilaiDao dao;

    public MahasiswaNilaiController() {
        this.dao = new MahasiswaNilaiDao(10);
    }
    
    public String insert(MahasiswaNilai mhsBaru){
        if(dao.getByNim(mhsBaru.getNIM()) !=null){
            return "Mahasiswa Sudah Ada";
        }
        boolean hasil = dao.Simpan(mhsBaru);
        if(hasil){
            return "Sukses";
        }else{
            return "Gagal";
        }
    }
    
    public String update(String nim, MahasiswaNilai mhs, boolean hasil){
        boolean hasik = dao.update(nim, mhs);
        if(hasil){
            return "Sukses";
        }else {
            return "Gagal";
        }
    }
    
    public MahasiswaNilai[] getAll(){
        return dao.getAll();
    }
    
    public MahasiswaNilai getByNIM(String nim){
        return dao.getByNim(nim);
    }
}
