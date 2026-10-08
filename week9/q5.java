import java.util.Scanner;

abstract class AccountQ5 {
    int id;
    String accountHolderName;
    String address;
    double balance;

    public AccountQ5(int id, String accountHolderName, String address, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class SavingQ5 extends AccountQ5 {
    double minBalance;

    public SavingQ5(int id, String name, String addr, double bal, double minBal) {
        super(id, name, addr, bal);
        this.minBalance = minBal;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Deposited: " + amount + " | Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Savings Withdrawn: " + amount + " | Current Balance: " + balance);
        } else {
            System.out.println("Transaction Denied: Must maintain minimum balance of " + minBalance);
        }
    }

    public void display() {
        System.out.println("Savings - ID: " + id + " | Name: " + accountHolderName + " | Balance: " + balance + " | Min Balance: " + minBalance);
    }
}

class CurrentQ5 extends AccountQ5 {
    double maxWithdrawalLimit;

    public CurrentQ5(int id, String name, String addr, double bal, double maxLimit) {
        super(id, name, addr, bal);
        this.maxWithdrawalLimit = maxLimit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current Deposited: " + amount + " | Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= maxWithdrawalLimit && balance >= amount) {
            balance -= amount;
            System.out.println("Current Withdrawn: " + amount + " | Current Balance: " + balance);
        } else if (amount > maxWithdrawalLimit) {
            System.out.println("Transaction Denied: Exceeds maximum withdrawal limit of " + maxWithdrawalLimit);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void display() {
        System.out.println("Current - ID: " + id + " | Name: " + accountHolderName + " | Balance: " + balance + " | Max Limit: " + maxWithdrawalLimit);
    }
}

public class Program5AccountChildren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Savings Details (ID, Name, Address, Balance, Min Balance):");
        int sId = scanner.nextInt();
        scanner.nextLine();
        String sName = scanner.nextLine();
        String sAddr = scanner.nextLine();
        double sBal = scanner.nextDouble();
        double minBal = scanner.nextDouble();
        SavingQ5 savingAcc = new SavingQ5(sId, sName, sAddr, sBal, minBal);

        System.out.println("Enter Current Details (ID, Name, Address, Balance, Max Withdrawal Limit):");
        int cId = scanner.nextInt();
        scanner.nextLine();
        String cName = scanner.nextLine();
        String cAddr = scanner.nextLine();
        double cBal = scanner.nextDouble();
        double maxLimit = scanner.nextDouble();
        CurrentQ5 currentAcc = new CurrentQ5(cId, cName, cAddr, cBal, maxLimit);

        System.out.print("\nEnter amount to deposit in Savings: ");
        savingAcc.deposit(scanner.nextDouble());
        System.out.print("Enter amount to withdraw from Savings: ");
        savingAcc.withdraw(scanner.nextDouble());

        System.out.print("\nEnter amount to deposit in Current: ");
        currentAcc.deposit(scanner.nextDouble());
        System.out.print("Enter amount to withdraw from Current: ");
        currentAcc.withdraw(scanner.nextDouble());

        System.out.println("\n--- Account Summary ---");
        savingAcc.display();
        currentAcc.display();

        scanner.close();
    }
}
