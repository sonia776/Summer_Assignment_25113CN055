import java.util.*;

public class Maximum {

   public static void maximum(int num1 , int num2) {;

      if (num1>num2) {
         System.out.println(num1 + " is the maximum number " );
      }
      else{
         System.err.println(num2 + " is the maximum number ");
      }

   }

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the First number : ");
      int num1 = sc.nextInt();

      System.out.println("Enter the Second number : ");
      int num2 = sc.nextInt();

      maximum(num1, num2);
      
   }
}