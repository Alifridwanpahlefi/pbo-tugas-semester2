/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum04032025;
import java.util.Scanner;

/**
 *
 * @author Lif Rdwn
 */
public class Array2DMatrik {
    public static void main(String[] args) {
        
        int M[][], N[][], P[][]; 
        int i, j, b, k;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah baris = ");
        b = in.nextInt();
        System.out.print("Masukkan jumlah kolom = ");
        k = in.nextInt();
        M = new int[b][k];
        N = new int[b][k];
        P = new int[b][k];
        
        System.out.println("Masukkan elemen Matriks M:");
        for(i = 0; i < b; i++){
            for(j = 0; j < k; j++){
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Masukkan elemen Matriks N:");
        for(i = 0; i < b; i++){
            for(j = 0; j < k; j++){
                System.out.print("N[" + i + "][" + j + "] = ");
                N[i][j] = in.nextInt();
            }
        }
        
        for(i = 0; i < b; i++){
            for(j = 0; j < k; j++){
                P[i][j] = M[i][j] + N[i][j];
            }
        }
        
        System.out.println("Matriks M:");
        for(i = 0; i < b; i++){
            for(j = 0; j < k; j++){
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("Matriks N:");
        for(i = 0; i < b; i++){
            for(j = 0; j < k; j++){
                System.out.print(N[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("Hasil Penjumlahan Matriks M dan N (M + N):");
        for(i = 0; i < b; i++){
            for(j = 0; j < k; j++){
                System.out.print(P[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
