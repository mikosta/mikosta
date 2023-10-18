import java.util.Scanner;

public class Noempat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan (N): ");
        int N = input.nextInt();

        System.out.print("Masukkan pilihan (A/B): ");
        char pil = input.next().charAt(0);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int countMin = 0;
        int countMax = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            int num = input.nextInt();

            if (num < min) {
                min = num;
                countMin = 1;
            } else if (num == min) {
                countMin++;
            }

            if (num > max) {
                max = num;
                countMax = 1;
            } else if (num == max) {
                countMax++;
            }
        }

        if (pil == 'A') {
            System.out.println("Nilai minimum: " + min);
            System.out.println("Jumlah kemunculan nilai minimum: " + countMin);
        } else if (pil == 'B') {
            System.out.println("Nilai maksimum: " + max);
            System.out.println("Jumlah kemunculan nilai maksimum: " + countMax);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}