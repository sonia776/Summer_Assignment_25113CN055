public class Count_Words {
    public static void main(String[] args) {
       
        String str = "Coding is a great skill";
              
        int count = 1 ;
        int n = str.length() ;
        for(int i = 0 ; i< n ; i++){
           if (str.charAt(i) == ' ') {
            count ++ ;
           }
        }
        System.out.println(count);
    }
}
