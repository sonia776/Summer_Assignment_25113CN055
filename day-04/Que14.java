import java.util.*;
public class Que14 {

    public static int nthFibonacci(int n){
        if (n<=0) {
         return 0 ;
        }    
        if (n==1) {
            return 1 ;
        }
        int first = 0 , second = 1 ;
        for(int i = 2 ; i<=n ; i++){
            int next = first + second ;
            first = second ;
            second = next ;

        }
        return second ;

    }
     public static void main(String[] args) {


          
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();

        System.out.println(nthFibonacci(n));
     }
    
}