/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.minggu2;

/**
 *
 * @author Sabil
 */
public class Persegi {
    public int sisi;
    public int luas;
    public int keliling;

    public void dataPersegi(){
        System.out.println("Panjang sisi = " + sisi);
    }

    public int hitungLuas(int sisi){
        luas = sisi*sisi;
        return luas;
    } 

    public int hitungKeliling(int sisi){
        keliling = 4*sisi;
        return keliling;
    }

    public static void main(String[] args) {
        Persegi psg = new Persegi();
        psg.sisi = 12;
        
        psg.dataPersegi();
        System.out.println("Luas Persegi = " + psg.hitungLuas(psg.sisi));
        System.out.println("Keliling persegi = " + psg.hitungKeliling(psg.sisi));
    }
}
