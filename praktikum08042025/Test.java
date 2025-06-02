/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum08042025;

/**
 *
 * @author Lif R
 */
public class Test {
    public static void main(String[] args){
        // Membuat objek 1 dari kelas Nasabah dan Tabungan
        Nasabah nasabah1 = new Nasabah("Alif", "Ridwan");
        Tabungan tabungan1 = new Tabungan(5000);
        
        // Membuat objek 2 dari kelas Nasabah dan Tabungan
        Nasabah nasabah2 = new Nasabah("Alif", "Baik");
        Tabungan tabungan2 = new Tabungan(7000);
        
        // Menampilkan informasi setiap objek
        System.out.println(nasabah1.toString());
        System.out.println(tabungan1.toString());
        System.out.println(nasabah2.toString());
        System.out.println(tabungan2.toString());
        
        // Objek 1 menabung 4000
        tabungan1.simpanUang(4000);
        System.out.println("\nAlif Ridwan menabung uang sebesar Rp.4000");
        System.out.println("Saldo Alif Ridwan: "+tabungan1+"+"+tabungan1.getSaldo());
        
        // Objek 2 menabung 7000
        tabungan2.simpanUang(7000);
        System.out.println("\nAlif Baik menabung uang sebesar Rp.7000");
        System.out.println("Saldo Alif Baik: "+tabungan2.getSaldo());
        
        // Objek 1 mengambil uang 5000
        tabungan1.ambilUang(5000);
        System.out.println("\nAlif Ridwan mengambil uang sebesar Rp.5000");
        System.out.println("Saldo Alif Ridwan: "+tabungan1.getSaldo());
        
        // Objek 2 mengambil 6000
        tabungan2.ambilUang(6000);
        System.out.println("\nAlif Baik mengambil uang sebesar Rp.6000");
        System.out.println("Saldo Alif Baik: "+tabungan2.getSaldo());
        
        // Objek 2 transfer ke objek 1 sebesar 1000
        System.out.println("\nAlif Baik mentransfer uang sebesar Rp.1000 kepada Alif Ridwan");
        tabungan2.transfer(tabungan1, 1000);
        
        // Menampilkan saldo dari objek 1 dan 2
        System.out.println("\nSaldo Alif Baik: "+tabungan1.getSaldo());
        System.out.println("Saldo akhir Alif Baik: "+tabungan2.getSaldo());
    }
}
