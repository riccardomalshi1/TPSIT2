import java.util.Scanner;

public class es1a8a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input della stringa
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();
        scanner.close();

        // 1. Lunghezza della stringa
        int lunghezza = input.length();
        System.out.println("Lunghezza della stringa: " + lunghezza);

        // 2. Carattere in posizione centrale
        char carattereCentrale = input.charAt(lunghezza / 2);
        System.out.println("Carattere centrale: " + carattereCentrale);

        // 3. Iniziale della stringa in maiuscolo
        String inizialeMaiuscola = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println("Stringa con iniziale maiuscola: " + inizialeMaiuscola);

        // 4. Numero di occorrenze del carattere 'a'
        int occorrenzeA = contaOccorrenze(input, 'a');
        System.out.println("Numero di occorrenze del carattere 'a': " + occorrenzeA);

        // 5. Sottostringa dal primo al quarto carattere
        String sottostringa = lunghezza >= 4 ? input.substring(0, 4) : input;
        System.out.println("Sottostringa dal primo al quarto carattere: " + sottostringa);

        // 6. Stringa in maiuscolo
        System.out.println("Stringa in maiuscolo: " + input.toUpperCase());

        // 7. Stringa in minuscolo
        System.out.println("Stringa in minuscolo: " + input.toLowerCase());

        // 8. Controllo se la stringa è un palindromo
        boolean isPalindromo = isPalindromo(input);
        System.out.println("La stringa è un palindromo: " + isPalindromo);
    }

    // Funzione per contare le occorrenze di un carattere in una stringa
    public static int contaOccorrenze(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    // Funzione per verificare se una stringa è un palindromo
    public static boolean isPalindromo(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
