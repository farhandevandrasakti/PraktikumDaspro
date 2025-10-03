package jobsheet5;
import java.util.Scanner;

public class Tugas3SistemAksesWIFI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== SISTEM AKSES WIFI KAMPUS ===");
        
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        String jenisPengguna = sc.next();
        
        System.out.print("Masukkan jumlah SKS (untuk mahasiswa): ");
        int sks = sc.nextInt();
        
        System.out.println("\n=== HASIL PENGECEKAN ===");
        
        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println(" WIFI diberikan (dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            if (sks >= 12) {
                System.out.println(" WIFI diberikan (mahasiswa aktif)");
            } else {
                System.out.println(" Akses ditolak, SKS kurang");
            }
        } else {
            System.out.println(" Akses ditolak - Jenis pengguna tidak dikenali");
        }
    }
}