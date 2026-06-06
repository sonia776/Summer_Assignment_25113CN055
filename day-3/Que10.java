public class Que10 {

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