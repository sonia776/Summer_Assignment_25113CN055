import java.util.*;
      public class Sum {
      
      
             public static int sum(int num1 , int num2){

               return (num1 + num2);
      
             }
         public static void main(String[] args) {


          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the first number : ");
          int num1 = sc.nextInt();

          System.out.print("Enter the second number : ");
          int num2 = sc.nextInt();

          System.out.println("The Sum of " + num1 + " and " + num2 + " is "  + sum(num1, num2));

   }
}