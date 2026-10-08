import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            scanner.close();
            return;
        }
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        if (size > 1) {
            int temp = arr[0];
            arr[0] = arr[size - 1];
            arr[size - 1] = temp;
        }
        
        System.out.println("Array after swapping first and last elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
