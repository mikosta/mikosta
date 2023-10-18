import java.util.Scanner;

public class Nodua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kodeHari;

        do {
            System.out.println("1 = SENIN 2 = SELASA 3 = RABU 4 = KAMIS");
            System.out.println("5 = JUMAT 6 = SABTU 7 = MINGGU");
            System.out.print("Masukkan kode hari (1-7): ");
            kodeHari = input.nextInt();

            switch (kodeHari) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Hari kerja");
                    break;
                case 6:
                case 7:
                    System.out.println("Hari Libur");
                    break;
                default:
                    System.out.println("Kode hari tidak valid");
            }
        } while (kodeHari < 1 || kodeHari > 7);
    }
}