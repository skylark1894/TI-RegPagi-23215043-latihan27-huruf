/*
 * Nama:Moh.arif prasetyo
 * Nim : 23215043
 * Prodi : Teknik Informatika
 */
package pertemuan5;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class FormatHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        // Mengubah kalimat menjadi huruf besar dan kecil
        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();

        // Menampilkan hasil
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + hurufBesar);
        System.out.println("Huruf Kecil : " + hurufKecil);

        scanner.close();
    }
}
