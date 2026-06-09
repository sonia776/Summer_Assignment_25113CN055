import java.util.*;

public class Factorial_Number {

   public static int factorialNo(int num) {
      int fact = 1;

      if (num == 0 || num == 1) {
         return 1;
      }

      for (int i = 2; i <= num; i++) {
         fact *= i;
      }

      return fact;

   }

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number : ");
      int num = sc.nextInt();
      System.out.println("Factorial of " + num + " is " + factorialNo(num));
   }
}