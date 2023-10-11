import java.util.Scanner;

public class CekLulus {
    public static void main(String[] args) {
        // Membuat variabel dan Scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);

        // Mengambil input
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai: ");
        nilai = scan.nextInt();

        // Cek apakah dia lulus atau tidak
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal");
        }
    }
}
