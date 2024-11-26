import java.util.Random;
import java.util.Scanner;

public class random2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numeri = new int[6];
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = random.nextInt(20) + 1;
        }

        System.out.print("Array generato: ");
        for (int numero : numeri) {
            System.out.print(numero + " ");
        }
        System.out.println();

        System.out.print("Inserisci un numero target: ");
        int target = scanner.nextInt();

        System.out.println("Coppie trovate:");
        boolean coppieTrovate = false;

        for (int i = 0; i < numeri.length; i++) {
            for (int j = i; j < numeri.length; j++) {
                if (numeri[i] + numeri[j] == target) {
                    System.out.println("(" + numeri[i] + ", " + numeri[j] + ")");
                    coppieTrovate = true;
                }
            }
        }

        if (!coppieTrovate) {
            System.out.println("Nessuna coppia trovata.");
        }

        scanner.close();
    }
}
