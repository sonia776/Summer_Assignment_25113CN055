import java.util.*;

public class Que3 {
  public static void main (String args[ ]){

    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the number : ");
    int number = sc.nextInt();

    int Factorial = 1 ;

    for(int i =number ; i>=1; i--){
      Factorial*=i ;
    } 

    System.out.println("facorial of " + number + " is : " + Factorial);
       sc.close();
  }
}