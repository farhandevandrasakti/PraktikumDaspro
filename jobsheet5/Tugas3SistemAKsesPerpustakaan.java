package jobsheet5;
import java.util.Scanner;

public class Tugas3SistemAKsesPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== SISTEM AKSES PERPUSTAKAAN ===");
        
        System.out.print("Apakah membawa kartu anggota? (true/false): ");
        boolean bawaKartu = sc.nextBoolean();
        
        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean registrasiOnline = sc.nextBoolean();
        
        System.out.println("\n=== HASIL PENGECEKAN ===");
        
        if (bawaKartu || registrasiOnline) {
            System.out.println(" Boleh masuk");
        } else {
            System.out.println(" Ditolak masuk");
            System.out.println("Alasan: Harus membawa kartu anggota ATAU sudah registrasi online");
        }
    }
}