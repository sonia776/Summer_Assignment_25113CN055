import java.util.*;
public class Armstrong {

    public static void armstrong(int num) {
        int temp = num;
        int digits = 0;
        int sum = 0 ;

        while (temp>0) {
            digits++ ;
            temp /=10 ;
        }

        temp = num ;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum+=Math.pow(lastDigit, digits);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num = sc.nextInt();

       armstrong(num);
    
    }
}