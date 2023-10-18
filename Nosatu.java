import java.util.Scanner;

public class Nosatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat (n): ");
        int n = input.nextInt();
        
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }
        
        System.out.println("Jumlah = " + jumlah);
    }
}
