package Arif140426;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class StudentRecordExample {
    public static void main( String[] args ){ 
        StudentRecord aliRecord = new StudentRecord();
        StudentRecord aniRecord = new StudentRecord();
        StudentRecord deniRecord = new StudentRecord("deni");
        deniRecord.print("");
        
        aliRecord.setNama("Ali");
        aliRecord.setAddress("Padang");
        aliRecord.setAge(20);
        aliRecord.setMathGrade(80);
        aliRecord.setEnglishGrade(70);
        aliRecord.setScienceGrade(90);
        
        System.out.println("Data 1");
        System.out.println("Nama                " + aliRecord.getNama()); 
        System.out.println("Alamat              " + aliRecord.getAddress()); 
        System.out.println("Umur                " + aliRecord.getAge()); 
        System.out.println("Matematika          " + aliRecord.getMathGrade()); 
        System.out.println("B. Inggris          " + aliRecord.getEnglishGrade()); 
        System.out.println("Ilmu Pengetahuan    " + aliRecord.getScienceGrade()); 
        System.out.println("Rata-rata           " + aliRecord.getAverage()); 
        
        aniRecord.setNama("Ani");
        aniRecord.setAddress("Bukittinggi");
        aniRecord.setAge(22);
        aniRecord.setMathGrade(80);
        aniRecord.setEnglishGrade(75);
        aniRecord.setScienceGrade(100);
        aniRecord.print("");
        
        System.out.println("Jumlah Siswa        "+
                StudentRecord.getStudentCount());
    }
}
