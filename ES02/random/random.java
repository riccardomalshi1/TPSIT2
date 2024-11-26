import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numeri = new int[10];
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = random.nextInt(100) + 1;
        }

        int posizioneDaIndovinare = random.nextInt(numeri.length);
        int numeroSegreto = numeri[posizioneDaIndovinare];

        System.out.println("Ho scelto un numero in una posizione casuale dell'array. Prova a indovinare!");

        int tentativo;
        do {
            System.out.print("Inserisci il tuo tentativo: ");
            tentativo = scanner.nextInt();

            if (tentativo > numeroSegreto) {
                System.out.println("Troppo alto!");
            } else if (tentativo < numeroSegreto) {
                System.out.println("Troppo basso!");
            } else {
                System.out.println("Complimenti! Hai indovinato!");
            }
        } while (tentativo != numeroSegreto);

        scanner.close();
    }
}
