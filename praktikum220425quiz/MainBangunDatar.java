/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum220425quiz;

/**
 *
 * @author Lif Rdwn
 */

import java.util.Scanner;

public class MainBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Lingkaran
        System.out.print("Masukkan jari-jari pada sebuah Lingkaran: ");
        double r = input.nextDouble();
        Lingkaran lingkaran = new Lingkaran(r);
        System.out.println("\n" + lingkaran.toString());
        System.out.println("Diameter: " + lingkaran.getDiameter());
        System.out.println("Keliling: " + lingkaran.getKeliling());
        System.out.println("Luas: " + lingkaran.getLuas());

        System.out.println("\n---");

        //Kerucut
        System.out.print("Masukkan jari-jari pada sebuah kerucut: ");
        double rK = input.nextDouble();
        System.out.print("Masukkan tinggi pada sebuah kerucut: ");
        double tK = input.nextDouble();
        Kerucut kerucut = new Kerucut(rK, tK);
        System.out.println("\n" + kerucut.toString());
        System.out.println("Sisi Miring: " + kerucut.getSisiMiring());
        System.out.println("Luas Permukaan: " + kerucut.getLuas());
        System.out.println("Volume: " + kerucut.getVolume());

        System.out.println("\n---");

        // Silinder
        System.out.print("Masukkan jari-jari pada sebuah silinder: ");
        double rS = input.nextDouble();
        System.out.print("Masukkan tinggi pada sebuah silinder: ");
        double tS = input.nextDouble();
        Silinder silinder = new Silinder(rS, tS);
        System.out.println("\n" + silinder.toString());
        System.out.println("Luas Permukaan: " + silinder.getLuas());
        System.out.println("Volume: " + silinder.getVolume());

    }
}
