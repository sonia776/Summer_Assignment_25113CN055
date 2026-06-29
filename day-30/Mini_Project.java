import java.util.*;

public class Mini_Project {

    static String name[] = new String[5];
    static int marks[] = new int[5];
    static int count = 0;

    static Scanner sc = new Scanner(System.in);

    public static void addStudent(){

        if(count<5){

            System.out.print("Enter Name: ");
            name[count]=sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[count]=sc.nextInt();
            sc.nextLine();

            count++;

        }else{

            System.out.println("Record Full");
        }
    }

    public static void display(){

        System.out.println("\nStudent Records");

        for(int i=0;i<count;i++){

            System.out.println(name[i]+" - "+marks[i]);

        }
    }

    public static void search(){

        System.out.print("Enter Student Name: ");
        String search=sc.nextLine();

        boolean found=false;

        for(int i=0;i<count;i++){

            if(name[i].equalsIgnoreCase(search)){

                System.out.println("Marks = "+marks[i]);
                found=true;
                break;
            }

        }

        if(!found){

            System.out.println("Student Not Found");
        }
    }

    public static void main(String[] args) {

        int choice;

        do{

            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    addStudent();
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    search();
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        }while(choice!=4);

        sc.close();
    }
}
