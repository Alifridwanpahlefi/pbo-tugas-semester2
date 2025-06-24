/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas27052025new;


public class EWallet extends Pembayaran implements MetodePembayaran {
    private String namaDompet;

    public EWallet(double jumlah, String namaDompet) {
        super(jumlah);
        this.namaDompet = namaDompet;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran sebesar Rp" + jumlah + " melalui e-wallet " + namaDompet);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Metode: E-Wallet - " + namaDompet);
    }
}