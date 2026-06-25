import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = (int)Math.floor(Math.random()*100 +1 );

        int guess;

        do {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too High!");
            } else if (guess < secretNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct! You Won!");
            }

        } while (guess != secretNumber);

        sc.close();
    }
}