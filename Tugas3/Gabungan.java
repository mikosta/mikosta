import java.util.Scanner;

public class Gabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih program:");
        System.out.println("1. Komparasi Angka");
        System.out.println("2. Operasi Logika");
        System.out.println("3. Menghitung Luas dan Volume");
        System.out.println("4. Memeriksa Hak Meminjam Buku");
        System.out.print("Masukkan nomor program yang ingin dijalankan: ");
        int choice = input.nextInt();
        
        switch (choice) {
            case 1:
                runKomparasi();
                break;
            case 2:
                runLogika();
                break;
            case 3:
                runAritmatika();
                break;
            case 4:
                runPerpustakaan();
                break;
            default:
                System.out.println("Program tidak valid.");
        }
    }

    public static void runKomparasi() {
         // operator komparasi

         int a,b;
         boolean hasilKomparasi;
 
         // operator equal atau persamaan
         System.out.println("----- PERSAMAAN");
         a = 10;
         b = 10;
         hasilKomparasi = (a == b);
         System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);
 
         a = 12;
         b = 10;
         hasilKomparasi = (a == b);
         System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);
 
         // operator not equal atau pertidaksamaan
         System.out.println("----- PERTIDAKSAMAAN");
         a = 10;
         b = 10;
         hasilKomparasi = (a != b);
         System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);
 
         a = 12;
         b = 10;
         hasilKomparasi = (a != b);
         System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);
 
         // operator less than atau kurang dari
         System.out.println("----- KURANG dari");
         a = 9;
         b = 10;
         hasilKomparasi = (a < b);
         System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);
 
         a = 12;
         b = 10;
         hasilKomparasi = (a < b);
         System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);
 
         // operator greater than atau lebih dari
         System.out.println("----- LEBIH dari");
         a = 9;
         b = 10;
         hasilKomparasi = (a > b);
         System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);
 
         a = 12;
         b = 10;
         hasilKomparasi = (a > b);
         System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);
 
         // operator less than equal atau kurang dari sama dengan
         System.out.println("----- KURANG DARI SAMA DENGAN");
         a = 9;
         b = 10;
         hasilKomparasi = (a <= b);
         System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);
 
         a = 10;
         b = 10;
         hasilKomparasi = (a <= b);
         System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);
 
         a = 12;
         b = 10;
         hasilKomparasi = (a <= b);
         System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);
 
         // operator greater than equal atau lebih dari sama dengan
         System.out.println("----- LEBIH DARI SAMA DENGAN");
         a = 9;
         b = 10;
         hasilKomparasi = (a >= b);
         System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);
 
         a = 10;
         b = 10;
         hasilKomparasi = (a >= b);
         System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);
 
         a = 12;
         b = 10;
         hasilKomparasi = (a >= b);
         System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);
 
 
    }

    public static void runLogika() {
         // Operator Logika --> operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, negasi

        boolean a,b,c;

        // OR / atau (||)

        System.out.println("==== OR (||) =====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        // AND / dan (&&)

        System.out.println("==== AND (&&) =====");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);


        // XOR / exlusive or (^)

        System.out.println("==== XOR (^) =====");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a^b);
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

    public static void runAritmatika() {
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        // menghitung luas persegi panjang
        // luas = panjang * lebar
1

        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("volume = "+ volume);
    }

    public static void runPerpustakaan() {
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
