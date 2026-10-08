import java.util.Scanner;

class Vehicle {
    double baseCost;

    public void cost() {
        System.out.println("Base Cost of Vehicle: " + baseCost);
    }
}

class Bus extends Vehicle {
    String route;

    public void display() {
        System.out.println("Bus Route: " + route);
    }
}

class Train extends Vehicle {
    int numberOfCoaches;

    public void display() {
        System.out.println("Train Coaches: " + numberOfCoaches);
    }
}

public class VehicleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bus bus = new Bus();
        System.out.print("Enter Bus Base Cost: ");
        bus.baseCost = scanner.nextDouble();
        System.out.print("Enter Bus Route: ");
        bus.route = scanner.next();

        Train train = new Train();
        System.out.print("Enter Train Base Cost: ");
        train.baseCost = scanner.nextDouble();
        System.out.print("Enter Train Number of Coaches: ");
        train.numberOfCoaches = scanner.nextInt();

        System.out.println("\n--- Bus Details ---");
        bus.cost();
        bus.display();

        System.out.println("\n--- Train Details ---");
        train.cost();
        train.display();

        scanner.close();
    }
}
