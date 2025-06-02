/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum20052025;

/**
 *
 * @author Lif Rdwn
 */
import java.util.Scanner;

public class MainElektronik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("\n=== MENU PILIHAN ===");
            System.out.println("1. Input Data Laptop");
            System.out.println("2. Input Data Smartphone");
            System.out.println("3. Input Data Gaming PC");
            System.out.println("4. Input Data SmartWatch");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = input.nextInt();
            input.nextLine(); // flush newline

            switch (pilihan) {
                case 1 -> {
                    Laptop laptop = new Laptop();
                    System.out.println("\n=== Input Data Laptop ===");
                    System.out.print("Merek: ");
                    laptop.setMerek(input.nextLine());
                    System.out.print("Tahun Produksi: ");
                    laptop.setTahunProduksi(input.nextInt());
                    System.out.print("Garansi (tahun): ");
                    laptop.setGaransi(input.nextInt());
                    System.out.print("Ukuran Layar (inci): ");
                    laptop.setUkuranLayar(input.nextInt());
                    System.out.print("Kapasitas RAM (GB): ");
                    laptop.setKapasitasRAM(input.nextInt());

                    System.out.println("\n--- Data Laptop ---");
                    System.out.println("Merek: " + laptop.getMerek());
                    System.out.println("Tahun Produksi: " + laptop.getTahunProduksi());
                    System.out.println("Garansi: " + laptop.getGaransi() + " tahun");
                    System.out.println("Ukuran Layar: " + laptop.getUkuranLayar() + " inci");
                    System.out.println("Kapasitas RAM: " + laptop.getKapasitasRAM() + " GB");
                }
                case 2 -> {
                    Smartphone smartphone = new Smartphone();
                    System.out.println("\n=== Input Data Smartphone ===");
                    System.out.print("Merek: ");
                    smartphone.setMerek(input.nextLine());
                    System.out.print("Tahun Produksi: ");
                    smartphone.setTahunProduksi(input.nextInt());
                    System.out.print("Garansi (tahun): ");
                    smartphone.setGaransi(input.nextInt());
                    System.out.print("Kapasitas Baterai (mAh): ");
                    smartphone.setKapasitasBaterai(input.nextInt());
                    System.out.print("Jumlah Kamera: ");
                    smartphone.setJumlahKamera(input.nextInt());

                    System.out.println("\n--- Data Smartphone ---");
                    System.out.println("Merek: " + smartphone.getMerek());
                    System.out.println("Tahun Produksi: " + smartphone.getTahunProduksi());
                    System.out.println("Garansi: " + smartphone.getGaransi() + " tahun");
                    System.out.println("Kapasitas Baterai: " + smartphone.getKapasitasBaterai() + " mAh");
                    System.out.println("Jumlah Kamera: " + smartphone.getJumlahKamera());
                }
                case 3 -> {
                    Gaming gaming = new Gaming();
                    System.out.println("\n=== Input Data Gaming PC ===");
                    System.out.print("Merek: ");
                    gaming.setMerek(input.nextLine());
                    System.out.print("Tahun Produksi: ");
                    gaming.setTahunProduksi(input.nextInt());
                    System.out.print("Garansi (tahun): ");
                    gaming.setGaransi(input.nextInt());
                    input.nextLine(); // flush
                    System.out.print("Kartu Grafis: ");
                    gaming.setKartuGrafis(input.nextLine());
                    System.out.print("Refresh Rate (Hz): ");
                    gaming.setRefreshRate(input.nextInt());

                    System.out.println("\n--- Data Gaming PC ---");
                    System.out.println("Merek: " + gaming.getMerek());
                    System.out.println("Tahun Produksi: " + gaming.getTahunProduksi());
                    System.out.println("Garansi: " + gaming.getGaransi() + " tahun");
                    System.out.println("Kartu Grafis: " + gaming.getKartuGrafis());
                    System.out.println("Refresh Rate: " + gaming.getRefreshRate() + " Hz");
                }
                case 4 -> {
                    SmartWatch smartwatch = new SmartWatch();
                    System.out.println("\n=== Input Data SmartWatch ===");
                    System.out.print("Merek: ");
                    smartwatch.setMerek(input.nextLine());
                    System.out.print("Tahun Produksi: ");
                    smartwatch.setTahunProduksi(input.nextInt());
                    System.out.print("Garansi (tahun): ");
                    smartwatch.setGaransi(input.nextInt());
                    System.out.print("Ukuran Layar (inci): ");
                    smartwatch.setUkuranLayar(input.nextInt());
                    System.out.print("Tahan Air? (true/false): ");
                    smartwatch.setTahanAir(input.nextBoolean());

                    System.out.println("\n--- Data SmartWatch ---");
                    System.out.println("Merek: " + smartwatch.getMerek());
                    System.out.println("Tahun Produksi: " + smartwatch.getTahunProduksi());
                    System.out.println("Garansi: " + smartwatch.getGaransi() + " tahun");
                    System.out.println("Ukuran Layar: " + smartwatch.getUkuranLayar() + " inci");
                    System.out.println("Tahan Air: " + (smartwatch.isTahanAir() ? "Ya" : "Tidak"));
                }
                default -> System.out.println("Pilihan tidak valid!");
            }

            // Tanya apakah ingin mengulang
            System.out.print("\nApakah ingin mengulang program? (y/n): ");
            String jawab = input.next().toLowerCase();
            if (!jawab.equals("y")) {
                ulang = false;
                System.out.println("Program selesai. Terima kasih!");
            }
        }

        input.close();
    }
}
