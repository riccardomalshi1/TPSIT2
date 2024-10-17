public class Frazione {
    // Attributi
    private int numeratore;
    private int denominatore;
    
    // Costruttore
    // utilizzo this per distinguere i parametri dagli attributi
    // se non volessimo usare this, potremmo usare nomi diversi
    // per i parametri, ad esempio num e den
    public Frazione(int num, int den) {
        numeratore = num;
        denominatore = den;
    }
    
    // Metodi
    public int getNumeratore() {
        return numeratore;
    }
    
    public int getDenominatore() {
        return denominatore;
    }
    
    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }
    
    public void setDenominatore(int denominatore) {
        this.denominatore = denominatore;
    }
    
    public Frazione somma(Frazione f) {
        int num = numeratore * f.denominatore + f.numeratore * denominatore;
        int den = denominatore * f.denominatore;
        return new Frazione(num, den);
    }

    public Frazione sott(Frazione f) {
    int num = numeratore * f.denominatore - f.numeratore * denominatore;
    int den = denominatore * f.denominatore;
    return new Frazione(num, den);
}


    public Frazione mol(Frazione f) {
        int num = numeratore * f.numeratore;
        int den = denominatore * f.denominatore;
        return new Frazione(num, den);
    }


    public Frazione div(Frazione f) {
        int num = numeratore * f.denominatore;
        int den = denominatore * f.numeratore;
        return new Frazione(num, den);
    }

      
    public String toString() {
        return numeratore + "/" + denominatore;
    }
    
    public static void main(String[] args) {
        Frazione f1 = new Frazione(1, 2);
        Frazione f2 = new Frazione(1, 3);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f1 + f2 = " + f1.somma(f2));
        System.out.println("f1 - f2 = " + f1.sott(f2));
        System.out.println("f1 * f2 = " + f1.mol(f2));
        System.out.println("f1 / f2 = " + f1.div(f2));
    }
}
