public class ques27 {

    public static int sumOFdigits(int num) {

        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumOFdigits(num /= 10);
    }

    public static void main(String[] args) {

        int num = 5478;
        System.out.println("Sum of digits is : " + sumOFdigits(num));

    }

}