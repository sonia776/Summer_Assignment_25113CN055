import java.util.*;

public class Hollow_Square_Pattern {

   public static void patterns(int num) {

      for (int i = 0; i <= num; i++) {
         for (int j = 0; j <= num; j++) {

            if (i == 0 || i == num || j == 0 || j == num) {
               System.out.print("*");
            }else{
               System.out.print(" ");
            }
              
         }
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


