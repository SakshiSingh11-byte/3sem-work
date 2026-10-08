import java.util.Scanner;

abstract class AccountQ4 {
    int id;
    String accountHolderName;
    String address;
    double balance;

    public AccountQ4(int id, String accountHolderName, String address, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class NormalAccount extends AccountQ4 {
    public NormalAccount(int id, String name, String addr, double bal) {
        super(id, name, addr, bal);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
    }
}

public class Program4AbstractAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account Details (ID, Name, Address, Balance):");
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        String addr = scanner.nextLine();
        double bal = scanner.nextDouble();

        NormalAccount acc = new NormalAccount(id, name, addr, bal);
        System.out.println("Account created successfully for ID: " + acc.id);
        
        scanner.close();
    }
}
