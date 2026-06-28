import java.util.Scanner;

public class Inventory_Management {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String product = "";
        int quantity = 0;

        int choice;

        do {

            System.out.println("\n===== Inventory Management =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product Name: ");
                    product = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();
                    break;

                case 2:

                    System.out.println("\nProduct Name : " + product);
                    System.out.println("Quantity     : " + quantity);
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