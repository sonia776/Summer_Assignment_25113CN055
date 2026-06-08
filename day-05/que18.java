public class que18 {

    public static int factorial(int digits){
        int fact = 1 ;
        for(int i = 1 ; i<=digits ; i++){
             fact*= i ;
        }
        return fact ;
    }

    public static void checkStrongNo(int num){
        int sum = 0 ;
        int temp =num  ;
        while (num>0) {
            int digits = num% 10 ;
             sum +=factorial(digits);
             num /= 10 ;
        }

        if (sum== temp) {
            System.out.println(temp +" is a strong number");  
        } else{
            System.out.println(temp + " is not a strong number");
        }
    }

    public static void main(String[] args) {
    checkStrongNo(145);
    checkStrongNo(152);
        
    }
}