import java.util.Scanner;

public class DivideUntilTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        scanner.close();

        while (num >= 10) {
            num = num / 2;
            System.out.println("Current value: " + num);
        }
    }
}
