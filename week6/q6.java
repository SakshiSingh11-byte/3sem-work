import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        
        int foundIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                foundIndex = i;
                break;
            }
        }
        
        if (foundIndex != -1) {
            System.out.println("Element found at index: " + foundIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
        scanner.close();
    }
}
