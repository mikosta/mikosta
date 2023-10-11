import java.util.Scanner;

public class Gabungan2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char choice;
        boolean exit = false;

        while (!exit) {
            System.out.println("Pilih program:");
            System.out.println("1. Komparasi Angka");
            System.out.println("2. Operasi Logika");
            System.out.println("3. Menghitung Luas dan Volume");
            System.out.println("4. Memeriksa Hak Meminjam Buku");
            System.out.println("5. Nested If");
            System.out.println("6. Logika Dua");
            System.out.println("E. Keluar");
            System.out.print("Masukkan nomor program yang ingin dijalankan atau 'E' untuk keluar: ");
            choice = input.next().charAt(0);

            switch (choice) {
                case '1':
                    runKomparasi();
                    break;
                case '2':
                    runLogika();
                    break;
                case '3':
                    runAritmatika();
                    break;
                case '4':
                    runPerpustakaan();
                    break;
                case '5':
                    runNestedIf();
                    break;
                case '6':
                    runLogikaDua();
                    break;
                case 'E':
                case 'e':
                    exit = true;
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Program tidak valid.");
            }
        }
    }

    /**
     * 
     */
    public static void runNestedIf() {
        // Implementasi program NestedIf...
        int a = 2;
        int b = 10;

        System.out.println("Ini adalah awal dari program");

        if (a == 5) {

            if (b == 10) {

                System.out.println("Ini adalah dimana a = 5 dan b = 10");

            } else {

                System.out.println("Ini adalah dimana a = 5 dan b bukan 10");

            }

        } else {

            System.out.println("Ini adalah dimana a salah");

        }

        System.out.println("Ini adalah akhir dari program");
    }

    public static void runLogikaDua() {
        // Implementasi program LogikaDua...
        boolean a, b, c;

        // OR / atau (||)

        System.out.println("==== OR (||) =====");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        // AND / dan (&&)

        System.out.println("==== AND (&&) =====");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        // XOR / exlusive or (^)

        System.out.println("==== XOR (^) =====");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        // NOT / negasi --> flipping (!)
        System.out.println("==== NEGASI (!) ====");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c);

        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c);
    }

    // Fungsi-fungsi program yang ada di sini...

    public static void runKomparasi() {
        // Implementasi runKomparasi()...
    }

    public static void runLogika() {
        // Implementasi runLogika()...
    }

    public static void runAritmatika() {
        // Implementasi runAritmatika()...
    }

    public static void runPerpustakaan() {
        // Implementasi runPerpustakaan()...
    }
}
import java.util.Scanner;

public class Gabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char choice;
        boolean exit = false;

        while (!exit) {
            System.out.println("Pilih program:");
            System.out.println("1. Komparasi Angka");
            System.out.println("2. Operasi Logika");
            System.out.println("3. Menghitung Luas dan Volume");
            System.out.println("4. Memeriksa Hak Meminjam Buku");
            System.out.println("5. Nested If");
            System.out.println("6. Logika Dua");
            System.out.println("E. Keluar");
            System.out.print("Masukkan nomor program yang ingin dijalankan atau 'E' untuk keluar: ");
            choice = input.next().charAt(0);

            switch (choice) {
                case '1':
                    runKomparasi();
                    break;
                case '2':
                    runLogika();
                    break;
                case '3':
                    runAritmatika();
                    break;
                case '4':
                    runPerpustakaan();
                    break;
                case '5':
                    runNestedIf();
                    break;
                case '6':
                    runLogikaDua();
                    break;
                case 'E':
                case 'e':
                    exit = true;
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Program tidak valid.");
            }
        }
    }

    public static void runNestedIf() {
        // Implementasi program NestedIf...
        int a = 2;
        int b = 10;

        System.out.println("Ini adalah awal dari program");

        if (a == 5) {

            if (b == 10) {

                System.out.println("Ini adalah dimana a = 5 dan b = 10");

            } else {

                System.out.println("Ini adalah dimana a = 5 dan b bukan 10");

            }

        } else {

            System.out.println("Ini adalah dimana a salah");

        }

        System.out.println("Ini adalah akhir dari program");
    }

    public static void runLogikaDua() {
        // Implementasi program LogikaDua...
        boolean a, b, c;

        // OR / atau (||)

        System.out.println("==== OR (||) =====");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        // AND / dan (&&)

        System.out.println("==== AND (&&) =====");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        // XOR / exlusive or (^)

        System.out.println("==== XOR (^) =====");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        // NOT / negasi --> flipping (!)
        System.out.println("==== NEGASI (!) ====");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c);

        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c);
    }

    // Fungsi-fungsi program yang ada di sini...

    public static void runKomparasi() {
        // Implementasi runKomparasi()...
    }

    public static void runLogika() {
        // Implementasi runLogika()...
    }

    public static void runAritmatika() {
        // Implementasi runAritmatika()...
    }

    public static void runPerpustakaan() {
        // Implementasi runPerpustakaan()...
    }
}
