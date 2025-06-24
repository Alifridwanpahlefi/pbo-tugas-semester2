/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1kelompok2122;

/**
 *
 * @author Lif Rdwn
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        boolean ulang = true;
        while (ulang) {
            System.out.println("\n=== MENU SHAPE ===");
            System.out.println("1. Buat Circle");
            System.out.println("2. Buat Rectangle");
            System.out.println("3. Buat Square");
            System.out.println("4. Tampilkan Semua dan Keluar");
            System.out.print("Pilih (1-4): ");
            int pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1 -> {
                    System.out.println("\n--- Input Circle ---");
                    System.out.print("Radius             : ");
                    double r = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Color              : ");
                    String cC = sc.nextLine();
                    System.out.print("Filled (true/false): ");
                    boolean fC = sc.nextBoolean();
                    shapes.add(new Circle(r, cC, fC));
                    System.out.println("Circle berhasil dibuat!");
                }
                case 2 -> {
                    System.out.println("\n--- Input Rectangle ---");
                    System.out.print("Width              : ");
                    double w = sc.nextDouble();
                    System.out.print("Length             : ");
                    double l = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Color              : ");
                    String cR = sc.nextLine();
                    System.out.print("Filled (true/false): ");
                    boolean fR = sc.nextBoolean();
                    shapes.add(new Rectangle(w, l, cR, fR));
                    System.out.println("Rectangle berhasil dibuat!");
                }
                case 3 -> {
                    System.out.println("\n--- Input Square ---");
                    System.out.print("Side               : ");
                    double s = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Color              : ");
                    String cS = sc.nextLine();
                    System.out.print("Filled (true/false): ");
                    boolean fS = sc.nextBoolean();
                    shapes.add(new Square(s, cS, fS));
                    System.out.println("Square berhasil dibuat!");
                }
                case 4 -> {
                    ulang = false; // langsung keluar loop
                    continue;
                }
                default -> {
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    continue;
                }
            }

            // Prompt ulang
            System.out.print("\nApakah Anda ingin mengulang? (y/n): ");
            char jawaban = sc.next().trim().toLowerCase().charAt(0);
            if (jawaban != 'y') {
                ulang = false;
            }
        }

        // Tampilkan semua sebelum keluar
        System.out.println("\n--- Daftar Shape ---");
        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println("  Luas     : " + s.getArea());
            System.out.println("  Keliling : " + s.getPerimeter());
            System.out.println("---------------------------");
        }
        System.out.println("Terima kasih!");

        sc.close();
    }
}