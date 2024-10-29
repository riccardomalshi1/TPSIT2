import java.util.Scanner;

public class es04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();
        
        int lunghezza = input.length();
        System.out.println("Lunghezza della stringa: " + lunghezza);
        
        char carattereCentrale = input.charAt(lunghezza / 2);
        System.out.println("Carattere in posizione centrale: " + carattereCentrale);
        
        String inizialeMaiuscola = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println("Stringa con iniziale maiuscola: " + inizialeMaiuscola);
        
        int numeroA = contaOccorrenze(input, 'a');
        System.out.println("Numero di occorrenze del carattere 'a': " + numeroA);
        
        String sottostringa = (lunghezza >= 4) ? input.substring(0, 4) : input;
        System.out.println("Sottostringa dal primo al quarto carattere: " + sottostringa);
        
        System.out.println("Stringa in maiuscolo: " + input.toUpperCase());
        System.out.println("Stringa in minuscolo: " + input.toLowerCase());
        
        boolean palindromo = controllaPalindromo(input);
        System.out.println("La stringa è un palindromo: " + (palindromo ? "Sì" : "No"));
    }
    
    public static int contaOccorrenze(String str, char carattere) {
        int conteggio = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == carattere) {
                conteggio++;
            }
        }
        return conteggio;
    }
    
    public static boolean controllaPalindromo(String str) {
        int sinistra = 0;
        int destra = str.length() - 1;
        while (sinistra < destra) {
            if (str.charAt(sinistra) != str.charAt(destra)) {
                return false;
            }
            sinistra++;
            destra--;
        }
        return true;
    }
}
