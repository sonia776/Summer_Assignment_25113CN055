public class ques25 {

    public static int factorial(int num){
        if (num == 0 || num == 1) {
            return 1 ;
        }
        return num * factorial(num-1);
    }

    public static void main(String[] args) {
       
        int num = 8 ;
        System.out.println(" Factorial of "+ num + " is : " + factorial(num));
       
    }
    
}