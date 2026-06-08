public class Que11{
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