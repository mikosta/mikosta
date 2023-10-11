package Praktikum2;
import java.util.Scanner;

public class HitungLuasLingkaran {
    public static void main(String[] args) {
        // Membaca jari-jari lingkaran dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari Lingkaran: ");
        double jariJari = input.nextDouble();

        // Menghitung luas lingkaran
        double luas = Math.PI * jariJari * jariJari;

        // Menampilkan hasil
        System.out.println("Luas Lingkaran dengan jari-jari " + jariJari + " adalah: " + luas);
    }
}
