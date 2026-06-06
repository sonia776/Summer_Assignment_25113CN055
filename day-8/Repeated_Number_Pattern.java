import java.util.*;

public class Repeated_Number_Pattern {

   public static void patterns(int num) {
      int number = 1;
      for (int i = 1; i <= num; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(number + " ");
         }
         number++;
         System.out.println();
      }
   }

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int num = sc.nextInt();
      System.out.println();

      patterns(num);

   }
}