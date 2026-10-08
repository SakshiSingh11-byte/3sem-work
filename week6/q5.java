import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit (e.g., 100): ");
        int limit = scanner.nextInt();
        
        System.out.println("Prime numbers between 0 and " + limit + ":");
        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
