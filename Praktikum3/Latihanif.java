import java.util.Scanner;

public class Latihanif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan sebuah karakter: ");
            String karakter = input.nextLine();
            
            if (karakter.length() == 1) {
                char ch = karakter.charAt(0);
                
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " adalah huruf");
                } else if (Character.isDigit(ch)) {
                    System.out.println(ch + " adalah digit");
                } else {
                    System.out.println(ch + " adalah bukan huruf atau angka");
                }
            } else {
                System.out.println("Masukkan hanya satu karakter.");
            }
            
            System.out.print("Ingin memasukkan karakter lagi? (ya/tidak): ");
            String jawaban = input.nextLine();
            
            if (!jawaban.equalsIgnoreCase("ya")) {
                break;
            }
        }
        
        System.out.println("Terima kasih!");
    }
}
