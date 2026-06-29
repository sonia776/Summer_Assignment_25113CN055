import java.util.Scanner;

public class Employee_Management {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // An array to store employee names and their salaries
        String name[] = new String[5];
        double salary[] = new double[5];

        int count=0;
        int choice;

        do{

            System.out.println("\n===== Employee Management =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    if(count<5){

                        System.out.print("Enter Employee Name: ");
                        name[count]=sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salary[count]=sc.nextDouble();

                        count++;

                    }else{

                        System.out.println("Record Full");
                    }

                    break;

                case 2:

                    System.out.println("\nEmployee Details");

                    for(int i=0;i<count;i++){

                        System.out.println((i+1)+". "+name[i]+" - ₹"+salary[i]);

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
