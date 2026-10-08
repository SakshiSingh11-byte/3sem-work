import java.util.Scanner;

class FRUIT2 {
    String color;
    String taste;
    double price;

    public void setDetails(String c, String t, double p) {
        color = c;
        taste = t;
        price = p;
    }

    public void display() {
        System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price);
    }
}

public class FruitProgram2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FRUIT2 fruit = new FRUIT();

        System.out.println("Enter Fruit Color, Taste, and Price:");
        String color = scanner.next();
        String taste = scanner.next();
        double price = scanner.nextDouble();

        fruit.setDetails(color, taste, price);
        
        System.out.println("\nFruit Details:");
        fruit.display();
        
        scanner.close();
    }
}
