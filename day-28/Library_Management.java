import java.util.*;

public class Library_Management {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String bookName = "";
        String author = "";

        int choice;

        do {
            System.out.println("\n===== Library Management =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book Name: ");
                    bookName = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author = sc.nextLine();
                    break;

                case 2:
                    System.out.println("\nBook Name : " + bookName);
                    System.out.println("Author    : " + author);
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