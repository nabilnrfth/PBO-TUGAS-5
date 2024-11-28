// Kelas Barang berfungsi sebagai parent class yang merepresentasikan data barang
class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    // Constructor untuk menginisialisasi objek Barang
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Method untuk menghitung total harga barang berdasarkan jumlah
    public double hitungTotal(int jumlah) {
        return hargaBarang * jumlah;
    }
}