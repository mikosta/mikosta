import java.util.Scanner;
//walaupun ini no5 tapi saya mengerjakan hanya  nomer 1,2,3,4,6
public class Nolima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        double hasil = 0;

        if (operator == '+') {
            hasil = tambah(angka1, angka2);
        } else if (operator == '-') {
            hasil = kurang(angka1, angka2);
        } else if (operator == '*') {
            hasil = kali(angka1, angka2);
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = bagi(angka1, angka2);
            } else {
                System.out.println("Pembagian oleh nol tidak valid.");
                return;
            }
        } else {
            System.out.println("Operator tidak valid.");
            return;
        }

        System.out.println("Hasil: " + hasil);
    }

    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        return a / b;
    }
}