import java.util.Scanner;

class FRUIT5 {
    String color;
    String taste;
    double price;

    public FRUIT5() {
        this("Unknown");
    }

    public FRUIT5(String c) {
        this(c, "Unknown");
    }

    public FRUIT5(String c, String t) {
        color = c;
        taste = t;
        price = 0.0;
    }

    public void display() {
        System.out.println("Color: " + color + ", Taste: " + taste + ", Price: " + price);
    }
}

public class FruitProgram5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter color for chained constructor target: ");
        String colorInput = scanner.next();

        FRUIT5 f1 = new FRUIT();
        FRUIT5 f2 = new FRUIT(colorInput);

        System.out.println("\nDisplaying Chained Constructor Results:");
        f1.display();
        f2.display();
        
        scanner.close();
    }
}
