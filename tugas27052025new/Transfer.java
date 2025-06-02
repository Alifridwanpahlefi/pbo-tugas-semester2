/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas27052025new;


public class Transfer extends Pembayaran implements MetodePembayaran {
    private String namaBank;

    public Transfer(double jumlah, String namaBank) {
        super(jumlah);
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran sebesar Rp" + jumlah + " melalui transfer bank " + namaBank);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Metode: Transfer Bank - " + namaBank);
    }
}