import java.util.Scanner;

public class Perpus{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();

        boolean berhakMeminjam = (usia >= 17); // Minimal usia 17 tahun untuk meminjam buku
        if (berhakMeminjam) {
            System.out.println("Anda berhak meminjam buku dari perpustakaan.");
        } else {
            System.out.println("Anda belum mencapai usia yang cukup untuk meminjam buku.");
        }
    }
}
