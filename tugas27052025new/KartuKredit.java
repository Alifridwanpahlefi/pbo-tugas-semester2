/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas27052025new;


public class KartuKredit extends Pembayaran implements MetodePembayaran {
    private String nomorKartu;

    public KartuKredit(double jumlah, String nomorKartu) {
        super(jumlah);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran sebesar Rp" + jumlah + " dengan kartu kredit " + nomorKartu);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Metode: Kartu Kredit - " + nomorKartu);
    }
}