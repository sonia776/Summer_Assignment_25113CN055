import java.util.*;

public class Student_Record {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
           
        //Array to store names and marks
        String name[] = new String[5];
        int marks[] = new int[5];

        int i = 0;
        int choice;

        do {

            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    if(i < 5){

                        System.out.print("Enter Student Name: ");
                        name[i] = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        marks[i] = sc.nextInt();

                        i++;

                    }else{
                        System.out.println("Record Full");
                    }

                    break;

                case 2:

                    System.out.println("\nStudent Records");

                    for(int j=0;j<i;j++){

                        System.out.println((j+1)+". "+name[j]+" - "+marks[j]);

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