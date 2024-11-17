import java.util.Scanner;

public class array1{
    public static void main(String[] args) {
        String[] nomi = {"Alice", "Bob", "Carol", "David", "Eve"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un nome: ");
        String nomeUtente = scanner.nextLine();

        String risultato = "Il nome non è presente.";
        for (String nome : nomi) {
            if (nome.equalsIgnoreCase(nomeUtente)) {
                risultato = "Il nome è stato trovato.";
                break;
            }
        }

        System.out.println(risultato);
        
    }
}
