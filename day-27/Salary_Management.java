
import java.util.*;

public class Salary_Management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = "";
        double salary = 0;
        int choice;

        do {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Enter Employee Details");
            System.out.println("2. Display Employee Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary = sc.nextDouble();
                    break;

                case 2:
                    System.out.println("\n----- Employee Details -----");
                    System.out.println("Employee Name : " + name);
                    System.out.println("Salary        : " + salary);
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}