import java.util.Scanner;

class FRUIT4 {
    String color;
    String taste;
    double price;

    public FRUIT4() {
        color = "Unknown";
        taste = "Unknown";
        price = 0.0;
    }

    public FRUIT4(String c) {
        color = c;
        taste = "Unknown";
        price = 0.0;
    }

    public FRUIT4(String c, String t) {
        color = c;
        taste = t;
        price = 0.0;
    }

    public void display() {
        System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price);
    }
}

public class FruitProgram4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter color for one-argument object: ");
        String c1 = scanner.next();

        System.out.print("Enter color and taste for two-argument object: ");
        String c2 = scanner.next();
        String t2 = scanner.next();

        FRUIT4 f1 = new FRUIT();
        FRUIT4 f2 = new FRUIT(c1);
        FRUIT4 f3 = new FRUIT(c2, t2);

        System.out.println("\nDisplaying Objects:");
        f1.display();
        f2.display();
        f3.display();
        
        scanner.close();
    }
}
