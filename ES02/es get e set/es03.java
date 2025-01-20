import java.util.Scanner;


class Studente {
    private String nome = "Sconosciuto", cognome = "Sconosciuto";
    private double mediaVoti = 0.0;
    private int numeroVoti = 0;


    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome.isEmpty() ? "Sconosciuto" : nome; }


    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome.isEmpty() ? "Sconosciuto" : cognome; }


    public double getMediaVoti() { return mediaVoti; }
    public void setMediaVoti(double voto) {
        if (voto >= 0 && voto <= 10) {
            mediaVoti = ((mediaVoti * numeroVoti) + voto) / (++numeroVoti);
        } else {
            System.out.println("Voto non valido! Deve essere tra 0 e 10.");
        }
    }


    public void stampaDettagli() {
        System.out.println(getNome() + " " + getCognome() + ", Media: " + getMediaVoti());
    }
}


public class es03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Studente s = new Studente();
       
     
        System.out.print("Inserisci il nome: ");
        s.setNome(scanner.nextLine());
        System.out.print("Inserisci il cognome: ");
        s.setCognome(scanner.nextLine());


       
        System.out.print("Quanti voti vuoi inserire? ");
        int numVoti = scanner.nextInt();
        for (int i = 0; i < numVoti; i++) {
            System.out.print("Inserisci il voto " + (i + 1) + ": ");
            s.setMediaVoti(scanner.nextDouble()); 
        }


      
        s.stampaDettagli();
        scanner.close();
    }
}
