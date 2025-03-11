/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12032025;

/**
 *
 * @author Lif Rdwn
 */
public class AksiMobil {
    public static void main(String[] args){
        //buat object baru
        Mobil mobilku=new Mobil();
        mobilku.merk="Toyota";
        mobilku.plat="BA 1234 L";
        mobilku.tahun=2004;
        mobilku.warna="Hitam";
        System.out.println("--------------");
        System.out.println("Data Mobil 1 : ");
        System.out.println("Merk Mobil = "+mobilku.merk);
        System.out.println("Plat Mobl = "+mobilku.plat);
        System.out.println("Warna Mobil = "+mobilku.warna);
        System.out.println("Tahun Keluaran = "+mobilku.tahun);
        System.out.println("Suara Mobil = "+mobilku.SuaraMobil());
        ///pemanggilan method
        mobilku.MobilAktif();//tanpa return(
        System.out.println(mobilku.SuaraMobil());
        
        Mobil mobilku2=new Mobil();
        mobilku2.merk="Avanza";
        mobilku2.plat="BA 4567 W";
        mobilku2.tahun=2006;
        mobilku2.warna="Silver";
        System.out.println("--------------");
        System.out.println("Data Mobil 2 = ");
        System.out.println("Merk Mobil = "+mobilku2.merk);
        System.out.println("Plat Mobil = "+mobilku2.plat);
        System.out.println("Warna Mobil = "+mobilku.warna);
        System.out.println("Tahun keluaran Mobil = "+mobilku2.tahun);
        ///pemanggilan method
        mobilku.MobilAktif();//tanpa return(
        System.out.println(mobilku.SuaraMobil());
    }
}
