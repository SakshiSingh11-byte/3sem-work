public class ArrayInsertDisplay {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (i + 1) * 10;
        }

        System.out.println("The array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
