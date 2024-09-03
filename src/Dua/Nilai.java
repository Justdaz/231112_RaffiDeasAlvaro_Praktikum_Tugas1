/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dua;

/**
 *
 * @author hp
 */
public class Nilai {
    String Nim;
    String Nama;
    float NilaiAbs;
    float NilaiTgs;
    float NilaiUts;
    float NilaiUas;
    float NilaiAkhir;
    
    float Nilai(){
        NilaiAkhir=(float)(0.1*NilaiAbs+ 0.2*NilaiTgs+ 0.3*NilaiUts + 0.4*NilaiUas);
        return NilaiAkhir;
    }
    void CtkNilai(){
        System.out.println("Biodata");
        System.out.println("Nim         : "+Nim);
        System.out.println("Nim         : "+Nim);
        System.out.println("Nama        : "+Nama);
        System.out.println("Nilai Absen : "+NilaiAbs);
        System.out.println("Nilai Tugas : "+NilaiTgs);
        System.out.println("Nilai UTS   : "+NilaiUts);
        System.out.println("Nilai UAS   : "+NilaiUas);
        System.out.println("Nilai Akhir : "+NilaiAkhir);     
    }
}
