// Kelas utama untuk menjalankan program faktur
import java.util.Scanner;

public class ProgramFaktur {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input

        // Proses Login
        System.out.println("+-----------------------------------------------------+");
        System.out.print("Username : ");
        String username = scanner.nextLine(); // Membaca username dari pengguna

        System.out.print("Password : ");
        String password = scanner.nextLine(); // Membaca password dari pengguna

        String captcha = "12345"; // Captcha tetap untuk validasi sederhana
        System.out.print("Captcha  : ");
        String userCaptcha = scanner.nextLine();  // Membaca captcha yang dimasukkan pengguna

         // Validasi login
        if (!username.equals("Khun") || !password.equals("AgueroAgnes") || !userCaptcha.equals(captcha)) {
            System.out.println("Login gagal, silakan ulangi."); // Jika validasi gagal
            return; // Menghentikan eksekusi program
        }

        System.out.println("Login berhasil!"); // Jika validasi berhasil
        System.out.println("+-----------------------------------------------------+");

        try {
            // Input data transaksi
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine(); // Membaca string input untuk nomor faktur

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine(); // Membaca string input untuk kode barang

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine(); // Membaca string input untuk nama barang

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            scanner.nextLine(); // Clear buffer

            System.out.print("Masukkan Nama Kasir: ");
            String namaKasir = scanner.nextLine(); // Membaca string input untuk nama kasir

            if (hargaBarang < 0 || jumlahBeli < 0) {
                throw new IllegalArgumentException("Harga atau jumlah tidak boleh negatif.");
            }

            // Membuat objek Transaksi dengan data yang diinput
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

             // Menampilkan detail transaksi
            transaksi.tampilkanDetail(namaKasir);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Input tidak valid.");
        } finally {
            scanner.close();
        }
    }
}