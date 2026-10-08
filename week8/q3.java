import java.util.Scanner;

class FRUIT3 {
    String color;
    String taste;
    double price;

    public FRUIT3(String c, String t, double p) {
        color = c;
        taste = t;
        price = p;
    }

    public void display() {
        System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price);
    }
}

public class FruitProgram3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Fruit Color, Taste, and Price:");
        String color = scanner.next();
        String taste = scanner.next();
        double price = scanner.nextDouble();

        FRUIT3 fruit = new FRUIT(color, taste, price);
        
        System.out.println("\nFruit Details:");
        fruit.display();
        
        scanner.close();
    }
}
