/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas27052025new;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih metode pembayaran: ");
        System.out.println("1. Transfer Bank");
        System.out.println("2. E-Wallet");
        System.out.println("3. Kartu Kredit");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        System.out.print("Masukkan jumlah pembayaran: ");
        double jumlah = scanner.nextDouble();
        scanner.nextLine();

        Pembayaran pembayaran = null;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama bank: ");
                String bank = scanner.nextLine();
                pembayaran = new Transfer(jumlah, bank);
                break;
            case 2:
                System.out.print("Masukkan nama e-wallet: ");
                String dompet = scanner.nextLine();
                pembayaran = new EWallet(jumlah, dompet);
                break;
            case 3:
                System.out.print("Masukkan nomor kartu kredit: ");
                String kartu = scanner.nextLine();
                pembayaran = new KartuKredit(jumlah, kartu);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        if (pembayaran instanceof MetodePembayaran) {
            ((MetodePembayaran) pembayaran).tampilkanInfo();
        }
        pembayaran.prosesPembayaran();
    }
}