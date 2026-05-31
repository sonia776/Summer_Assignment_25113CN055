//question no 9  Write a program to check whether a number is prime or not.

public class day3{

  public static boolean primes(int a) {
    boolean isPrime = true;
    if (a == 2) {
      isPrime = true;
    }
    for (int i = 2; i <= Math.sqrt(a); i++) {
      if (a % i == 0) {
        isPrime = false;
      }
    }
    return isPrime;
  }
  public static void main(String arg[]) {

   
    System.out.println(primes(16));

  }
}



// question no 10 write a program to print prime numbers in a range.

public class day3{

  public static boolean primes(int a) {
    boolean isPrime = true;
    if (a == 2) {
      isPrime = true;
    }
    for (int i = 2; i <= Math.sqrt(a); i++) {
      if (a % i == 0) {
        isPrime = false;
      }
    }
    return isPrime;
  }

  public static void primeRange(int n) {
    for (int i = 2; i <= n; i++) {
      if (primes(i)) {
        System.out.println(i);
      }
    }
  }

  public static void main(String arg[]) {

    primeRange(25);

  }
}




// question no 11 write a program to find GCD of two numbers.

public class day3{
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

    public static void main(String[] args) {
        
        int number1 = 48;
        int number2 = 18;
       
        int gcd = findGCD(number1, number2);
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
}


// question no 12 write a program to find LCM of two numbers.

    import java.util.*;

public class day3 {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;

        // Find LCM
        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM is: " + max);
                break;
            }
            max++;
        }
    }
}


