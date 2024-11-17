import java.util.Arrays;

public class array8 {
    public static void main(String[] args) {
        int[] primoArray = {4, 8, 15, 16};
        int[] secondoArray = Arrays.copyOf(primoArray, primoArray.length);

        boolean sonoUguali = Arrays.equals(primoArray, secondoArray);

        System.out.println("I due array sono identici: " + sonoUguali);
    }
}
