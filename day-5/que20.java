public class que20 {

    public static void largestPrimefactor(int num){
        if (num<2) {
            System.out.println("No prime factors");
            return ;
        }

        int maxPrime = -1 ;
        int temp = num ;

        // because even number is not a prime no 
        while (num% 2 == 0) {
            maxPrime = 2 ;
            num/=2 ;
        }

        //odd

        for(int i = 3 ; i*i<=num ;i+=2){
            while (num% i == 0) {
                maxPrime = i ;
                num/= i ; 
            }
        }

        if (num>2) {
            maxPrime = num ;
        }

         System.out.println("The largest prime factor of " + temp + " is: " + maxPrime);
    }

    public static void main(String[] args) {
        largestPrimefactor(12);
         largestPrimefactor(315);
       

        
    }
}