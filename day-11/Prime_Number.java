public class Prime_Number {

   public static boolean primeNumber(int num) {
      boolean isPrime = true;

      if (num < 2) {
         isPrime = false;
      }

      for (int i = 2; i <= num / 2; i++) {
         if (num % i == 0) {
            isPrime = false;
         }

      }

      return isPrime;

   }

   public static void main(String[] args) {

      System.out.println(primeNumber(23));
      System.out.println(primeNumber(-1));
      System.out.println(primeNumber(2));

   }
}