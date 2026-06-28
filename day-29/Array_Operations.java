import java.util.*;

public class Array_Operations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        int choice;

        do {

            System.out.println("\n===== Array Operations =====");
            System.out.println("1. Display Array");
            System.out.println("2. Maximum Element");
            System.out.println("3. Minimum Element");
            System.out.println("4. Sum of Elements");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int num : arr)
                        System.out.print(num + " ");
                    System.out.println();
                    break;

                case 2:
                    int max = arr[0];
                    for (int num : arr)
                        if (num > max)
                            max = num;
                    System.out.println("Maximum = " + max);
                    break;

                case 3:
                    int min = arr[0];
                    for (int num : arr)
                        if (num < min)
                            min = num;
                    System.out.println("Minimum = " + min);
                    break;

                case 4:
                    int sum = 0;
                    for (int num : arr)
                        sum += num;
                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}
