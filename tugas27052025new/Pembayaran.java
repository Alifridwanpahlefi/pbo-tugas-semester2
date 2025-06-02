/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas27052025new;


public abstract class Pembayaran {
    protected double jumlah;

    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    public abstract void prosesPembayaran();
}