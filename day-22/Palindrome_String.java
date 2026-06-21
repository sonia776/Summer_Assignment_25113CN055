public class Palindrome_String {
    public static void main(String[] args) {
       
        String str = "racecar";
              
        boolean ispalindrome = true ;
        int n = str.length() ;
        for(int i = 0 ; i< n/2 ; i++){
            if (str.charAt(i)!= str.charAt(n-1-i)) {
                      ispalindrome = false ;
                      break ;
            }
        }

        if (ispalindrome) {
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}