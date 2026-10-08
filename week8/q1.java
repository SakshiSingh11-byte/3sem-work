import java.util.Scanner;

class FRUIT {
    String color;
    String taste;
    double price;

    public void display() {
        System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price);
    }
}

public class FruitProgram1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        FRUIT f1 = new FRUIT();
        System.out.println("Enter details for Fruit 1 (Color, Taste, Price):");
        f1.color = scanner.next();
        f1.taste = scanner.next();
        f1.price = scanner.nextDouble();

        FRUIT f2 = new FRUIT();
        System.out.println("Enter details for Fruit 2 (Color, Taste, Price):");
        f2.color = scanner.next();
        f2.taste = scanner.next();
        f2.price = scanner.nextDouble();

        FRUIT f3 = new FRUIT();
        System.out.println("Enter details for Fruit 3 (Color, Taste, Price):");
        f3.color = scanner.next();
        f3.taste = scanner.next();
        f3.price = scanner.nextDouble();

        System.out.println("\nFruit Details:");
        f1.display();
        f2.display();
        f3.display();
        
        scanner.close();
    }
}
