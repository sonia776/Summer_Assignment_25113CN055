import java.util.Scanner;

public class Ticket_Booking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String passenger = "";
        String destination = "";

        int choice;

        do {

            System.out.println("\n===== Ticket Booking =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Ticket");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Passenger Name: ");
                    passenger = sc.nextLine();

                    System.out.print("Enter Destination: ");
                    destination = sc.nextLine();
                    break;

                case 2:

                    System.out.println("\nPassenger : " + passenger);
                    System.out.println("Destination : " + destination);
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
