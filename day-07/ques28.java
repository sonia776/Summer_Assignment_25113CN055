public class ques28 {

   static  int reverse = 0 ;
    public static int Reverse(int num) {
        if (num == 0 ) {
            return reverse;
        }
        reverse = reverse*10 +( num % 10) ;
        return  Reverse(num /10);
    }

    public static void main(String[] args) {

        int num = 5478;
        System.out.println("Reverse of a number is : " + Reverse(num));

    }

}