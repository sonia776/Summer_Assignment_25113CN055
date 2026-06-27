import java.util.Scanner;

public class Contact_Management {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        String phone = "";

        int choice;

        do {

            System.out.println("\n===== Contact Management =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    phone = sc.nextLine();
                    break;

                case 2:

                    System.out.println("\nName : " + name);
                    System.out.println("Phone : " + phone);
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
