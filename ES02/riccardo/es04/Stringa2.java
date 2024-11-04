import java.util.Scanner;

public class Stringa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci la prima stringa:");
        String primaStringa = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa:");
        String secondaStringa = scanner.nextLine();
        if (primaStringa.equalsIgnoreCase(secondaStringa)) {
            System.out.println("Le due stringhe sono uguali (ignorando maiuscole/minuscole).");
        } else {
            System.out.println("Le due stringhe sono diverse.");
        }
        
        System.out.println("Inserisci una stringa da convertire in numero intero:");
        String stringaIntero = scanner.nextLine();
        try {
            int numeroIntero = Integer.parseInt(stringaIntero);
            System.out.println("Numero intero convertito: " + numeroIntero);
        } catch (NumberFormatException e) {
            System.out.println("La stringa inserita non può essere convertita in un numero intero.");
        }
        
        System.out.println("Inserisci una stringa da convertire in numero decimale:");
        String stringaDecimale = scanner.nextLine();
        try {
            double numeroDecimale = Double.parseDouble(stringaDecimale);
            System.out.println("Numero decimale convertito: " + numeroDecimale);
        } catch (NumberFormatException e) {
            System.out.println("La stringa inserita non può essere convertita in un numero decimale.");
        }
        
        System.out.println("Inserisci una frase:");
        String frase = scanner.nextLine();
        String[] parole = frase.split("\\s+");
        System.out.println("Le parole della frase sono:");
        for (String parola : parole) {
            System.out.println(parola);
        }
        
        System.out.println("Inserisci una stringa:");
        String stringaInizio = scanner.nextLine();
        if (stringaInizio.length() >= 5) {
            System.out.println("I primi 5 caratteri sono: " + stringaInizio.substring(0, 5));
        } else {
            System.out.println("La stringa è troppo corta per mostrare i primi 5 caratteri.");
        }
        
        System.out.println("Inserisci una stringa:");
        String stringaFine = scanner.nextLine();
        if (stringaFine.length() >= 5) {
            System.out.println("Gli ultimi 5 caratteri sono: " + stringaFine.substring(stringaFine.length() - 5));
        } else {
            System.out.println("La stringa è troppo corta per mostrare gli ultimi 5 caratteri.");
        }
        
        System.out.println("Inserisci una frase:");
        String fraseLunga = scanner.nextLine();
        String[] paroleLunghe = fraseLunga.split("\\s+");
        String parolaPiuLunga = "";
        for (String parola : paroleLunghe) {
            if (parola.length() > parolaPiuLunga.length()) {
                parolaPiuLunga = parola;
            }
        }
        System.out.println("La parola più lunga è: " + parolaPiuLunga);
        
        scanner.close();
    }
}
