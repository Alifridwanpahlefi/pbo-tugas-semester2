/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTSalifridwanpahlefi2401083002;

/**
 *
 * @author Lif Rdwn
 */
public class MainKendaraan {

    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.setJmlRoda(4);
        kendaraan.setWarna("Merah");

        System.out.println("Kendaraan:");
        System.out.println("Jumlah Roda: " + kendaraan.getJmlRoda());
        System.out.println("Warna: " + kendaraan.getWarna());
        System.out.println();

        Sepeda sepeda = new Sepeda();
        sepeda.setJmlRoda(2);
        sepeda.setWarna("Biru");
        sepeda.setJmlSadel(1);
        sepeda.setJmlGir(18);

        System.out.println("Sepeda:");
        System.out.println("Jumlah Roda: " + sepeda.getJmlRoda());
        System.out.println("Warna: " + sepeda.getWarna());
        System.out.println("Jumlah Sadel: " + sepeda.getJmlSadel());
        System.out.println("Jumlah Gir: " + sepeda.getJmlGir());
        System.out.println();

        SepedaListrik sepedaListrik = new SepedaListrik();
        sepedaListrik.setJmlRoda(2);
        sepedaListrik.setWarna("Hitam");
        sepedaListrik.setJmlSadel(1);
        sepedaListrik.setJmlGir(7);
        sepedaListrik.setKecepatanMaks(50);
        sepedaListrik.setJarakTempuh(100);

        System.out.println("Sepeda Listrik:");
        System.out.println("Jumlah Roda: " + sepedaListrik.getJmlRoda());
        System.out.println("Warna: " + sepedaListrik.getWarna());
        System.out.println("Jumlah Sadel: " + sepedaListrik.getJmlSadel());
        System.out.println("Jumlah Gir: " + sepedaListrik.getJmlGir());
        System.out.println("Kecepatan Maksimal: " + sepedaListrik.getKecepatanMaks() + " km/h");
        System.out.println("Jarak Tempuh: " + sepedaListrik.getJarakTempuh() + " km");
    }
}
