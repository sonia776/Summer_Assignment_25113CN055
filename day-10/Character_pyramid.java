import java.util.*;

public class Character_pyramid {

    public static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }

            char ch = 'A' ;
            for (int k = 1; k <= i; k++) {
                System.out.print( ch + " ");
                ch++ ;
            }
            ch-=2 ;
            for(int l = i -1 ; l>= 1 ; l--){
                System.err.print(ch + " ");
                ch-- ;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println();

        pattern(num);
    }
}

