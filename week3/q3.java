import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        scanner.close();

        double cube = num * num * num;

        System.out.println("The cube of " + num + " is: " + cube);
    }
}
