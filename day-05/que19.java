public class que19 {

    public static void factors(int num){
        for(int i = 1 ; i<=num ; i++){
            if (num%i == 0) {
                System.out.print( i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
    
      factors(6);
      factors(12);
    }
}