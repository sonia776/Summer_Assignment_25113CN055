import java.util.Scanner;

public class Quiz_Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Java is a ?");
        System.out.println("1. Language");
        System.out.println("2. Database");
        System.out.println("3. Browser");
        System.out.println("4. OS");

        int ans1 = sc.nextInt();

        if (ans1 == 1) {
            score++;
        }

        System.out.println("\nQ2. Size of int in Java?");
        System.out.println("1. 2 bytes");
        System.out.println("2. 4 bytes");
        System.out.println("3. 8 bytes");
        System.out.println("4. 16 bytes");

        int ans2 = sc.nextInt();

        if (ans2 == 2) {
            score++;
        }

        System.out.println("\nQ3. Which loop is entry-controlled?");
        System.out.println("1. for");
        System.out.println("2. do-while");
        System.out.println("3. Both");
        System.out.println("4. None");

        int ans3 = sc.nextInt();

        if (ans3 == 3) {
            score++;
        }

        System.out.println("\nYour Score = " + score + "/3");

        sc.close();
    }
}