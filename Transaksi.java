package laundry;

/**
 *
 * @author ZAKARIA
 */
public class Transaksi {
    JenisLaundry selectedLaundry;
    double jumlah;
    double total;

    public Transaksi(JenisLaundry selectedLaundry, double jumlah) {
        this.selectedLaundry = selectedLaundry;
        this.jumlah = jumlah;
        this.total = selectedLaundry.getHarga() * jumlah;
    }
    
}