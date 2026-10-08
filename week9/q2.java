import java.util.Scanner;

class University {
    String uniName;
    int ranking;
}

class Faculty extends University {
    String facultyName;

    public void Details() {
        System.out.println("University: " + uniName);
        System.out.println("Faculty Name: " + facultyName);
    }
}

class Department extends Faculty {
    String deptName;
    String chairman;

    public void Details() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Chairman: " + chairman);
    }

    public void Display() {
        super.Details();
        this.Details();
    }
}

public class UniversityProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Department dept = new Department();

        System.out.print("Enter University Name: ");
        dept.uniName = scanner.nextLine();
        System.out.print("Enter University Ranking: ");
        dept.ranking = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Faculty Name: ");
        dept.facultyName = scanner.nextLine();
        System.out.print("Enter Department Name: ");
        dept.deptName = scanner.nextLine();
        System.out.print("Enter Chairman Name: ");
        dept.chairman = scanner.nextLine();

        System.out.println("\n--- Department Complete Display ---");
        dept.Display();
        System.out.println("University Ranking: " + dept.ranking);

        scanner.close();
    }
}
