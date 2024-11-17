public class array5 {
    public static void main(String[] args) {
        int[] primoArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] secondoArray = new int[5];


        System.arraycopy(primoArray, 0, secondoArray, 0, 5);


        for (int num : secondoArray) {
            System.out.print(num + " ");
        }
    }
}
