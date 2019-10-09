/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan27hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Freza
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan Huruf Besar Kecil

 */
public class PBO210118084Latihan27HurufBesarKecil {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        Scanner Scanner = new Scanner (System.in);
        System.out.print("Masukkan Kalimat :");
        kalimat=Scanner.nextLine();
        System.out.println("===Hasil Formatting====");
        System.out.println("Huruf Besar :"+kalimat.toUpperCase());
        System.out.println("Huruf Kecil :"+kalimat.toLowerCase());
        
    }
    
}
