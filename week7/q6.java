import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int count = scanner.nextInt();
        
        if (count <= 0) {
            System.out.println("Please enter a number greater than 0.");
            scanner.close();
            return;
        }
        
        System.out.print("Fibonacci Series (Without Recursion): ");
        int num1 = 0, num2 = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(num1 + " ");
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
        System.out.println();
        
        System.out.print("Fibonacci Series (With Recursion):    ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
