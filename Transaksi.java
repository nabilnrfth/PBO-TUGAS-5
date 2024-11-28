// Kelas Transaksi sebagai turunan dari kelas Barang
import java.text.SimpleDateFormat; // Library untuk format tanggal dan waktu
import java.util.Date; // Library untuk mendapatkan waktu saat ini

class Transaksi extends Barang {
    private String noFaktur; // Nomor faktur transaksi
    private int jumlahBeli; // Jumlah barang yang dibeli

    // Constructor untuk menginisialisasi objek Transaksi
    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil constructor parent class (Barang)
        this.noFaktur = noFaktur; // Mengatur nomor faktur
        this.jumlahBeli = jumlahBeli; // Mengatur jumlah beli
    }

     // Method untuk menampilkan detail transaksi
    public void tampilkanDetail(String namaKasir) {
        double total = hitungTotal(jumlahBeli); // Menghitung total harga barang
        Date date = new Date(); // Membuat objek Date untuk mendapatkan waktu saat ini
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); // Mengatur format tanggal dan waktu

         // Menampilkan detail transaksi
        System.out.println("\n+----------------------------------------------------+");
        System.out.println("Selamat Datang di Dexter Supermarket");
        System.out.println("Tanggal dan Waktu : " + formatter.format(date)); // Format waktu sekarang
        System.out.println("+----------------------------------------------------+");
        System.out.println("No. Faktur      : " + noFaktur); // Menampilkan nomor faktur
        System.out.println("Kode Barang     : " + kodeBarang); // Menampilkan kode barang
        System.out.println("Nama Barang     : " + namaBarang); // Menampilkan nama barang
        System.out.println("Harga Barang    : Rp " + hargaBarang); // Menampilkan harga barang
        System.out.println("Jumlah Beli     : " + jumlahBeli); // Menampilkan jumlah barang yang dibeli
        System.out.println("TOTAL           : Rp " + total); // Menampilkan total harga
        System.out.println("+----------------------------------------------------+");
        System.out.println("Kasir           : " + namaKasir); // Menampilkan nama kasir
        System.out.println("+----------------------------------------------------+");
    }
}