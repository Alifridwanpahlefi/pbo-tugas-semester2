/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum04032025;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Lif Rdwn/**
 *

 */
public class Array1DRandom {
    public static void main(String[] args){
        int A[], n, i;
        int jumlahGenap = 0, banyakGenap = 0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Masukka Banyak Data : ");
        n = in.nextInt();
        A = new int[n];

        System.out.println("===Data Anda===");
        for(i = 0; i < n; i++) {
            A[i] = rand.nextInt(100) + 1;
            System.out.print(A[i] + "\t");
        }
        System.out.println();

        System.out.println("===Data Genap Anda===");
        for(i = 0; i < n; i++) {
            if(A[i] % 2 == 0) {
                System.out.print(A[i] + "\t");
                jumlahGenap += A[i]; 
                banyakGenap++; 
            }
        }
        System.out.println();
        
        System.out.println("Jumlah angka genap: " + jumlahGenap);
        System.out.println("Banyaknya angka genap: " + banyakGenap);
    }
}
