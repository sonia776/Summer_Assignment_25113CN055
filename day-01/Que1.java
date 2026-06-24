
import java.util.*;

public class Que1 {
  public static void main (String args[ ]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number");
    int number = sc.nextInt();
     int Sum = 0;

   for(int i = 1 ; i<=number ; i++){
       Sum+=i;
   }

   System.out.println("The sum is : " + Sum);
     
   sc.close();
  }
}
