import java.util.*;

public class Fibonacci {

    public static void fibonacci(int num) {

        if (num <= 0) {
            System.out.println("Please enter a number greater than 0.");
            return;
        }

        if (num == 1) {
            System.out.println("Fibonacci series is : 0");
        } else {

            int first = 0, second = 1;
            System.out.print("Fibonacci series is : " + first + " " + second);
            for (int i = 2; i < num; i++) {
                int next = first + second;
                System.out.print(" " + next);
                first = second;
                second = next;

            }

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int num = sc.nextInt();
        fibonacci(num);
    }

}