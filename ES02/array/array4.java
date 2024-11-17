public class array4 {
    public static void main(String[] args) {
        int[] numeri = {10, 20, 30, 40, 50};
        int lunghezza = numeri.length;

        for (int i = 0; i < lunghezza / 2; i++) {
            int temp = numeri[i];
            numeri[i] = numeri[lunghezza - 1 - i];
            numeri[lunghezza - 1 - i] = temp;
        }

        for (int numero : numeri) {
            System.out.print(numero + " ");
        }
    }
}
