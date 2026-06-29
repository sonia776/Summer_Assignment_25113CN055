import java.util.*;

public class Mini_Library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
         //Array to store books
        String books[] = new String[5];

        int count = 0;
        int choice;

        do{

            System.out.println("\n===== Mini Library =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    if(count<5){

                        System.out.print("Enter Book Name: ");
                        books[count]=sc.nextLine();

                        count++;

                    }else{

                        System.out.println("Library Full");
                    }

                    break;

                case 2:

                    System.out.println("\nBooks Available:");

                    for(int i=0;i<count;i++){

                        System.out.println((i+1)+". "+books[i]);

                    }

                    break;

                case 3:

                    System.out.println("Thank You");
                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        }while(choice!=3);

        sc.close();
    }
}