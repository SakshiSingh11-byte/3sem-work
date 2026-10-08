import java.util.Scanner;

class AccountQ3 {
    int id;
    String accountHolderName;
    String address;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static double calculateCompoundInterest(double p, double r, double t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }
}

public class Program3StaticAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountQ3 acc = new AccountQ3();

        System.out.print("Enter Account ID: ");
        acc.id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        acc.accountHolderName = scanner.nextLine();
        System.out.print("Enter Address: ");
        acc.address = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        acc.balance = scanner.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        acc.deposit(scanner.nextDouble());

        System.out.print("Enter Withdrawal Amount: ");
        acc.withdraw(scanner.nextDouble());

        System.out.print("Enter Principal, Rate, and Time for Interest Calculation: ");
        double p = scanner.nextDouble();
        double r = scanner.nextDouble();
        double t = scanner.nextDouble();

        System.out.println("Simple Interest: " + AccountQ3.calculateSimpleInterest(p, r, t));
        System.out.println("Compound Interest: " + AccountQ3.calculateCompoundInterest(p, r, t));

        scanner.close();
    }
}
