import java.util.*;

public class Que16 {

    public static boolean Armstrong(int num){
         if (num<0) {
            return false ;
         }

         
        int digits = 0;
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }

            return sum == num ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper bound: ");
        int n = sc.nextInt();

        for(int i = 1 ; i<=n ; i++){
            if (Armstrong(i)) {
                System.out.print(i + " ");
            }
           

        }


    }
}
