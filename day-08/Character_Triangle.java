import java.util.*;
public class Character_Triangle {

   public static void patterns(int num){
      for(int i = 1 ; i<=num; i++){
         char ch = 'A' ;
         for(int j = 1 ; j<=i ; j++){
            System.out.print(ch + " ");
            ch++ ;
         }
         System.out.println();
      }
   }
    public static void main(String[] args) {

      
    Scanner sc = new Scanner(System.in);

    int num =  sc.nextInt() ;
    System.out.println();

    patterns(num);


}
}