public class que17 {
    public static void perfectNo(int num) {
        if (num <= 1) {
            System.out.println(num + " is not perfect number");
            return ;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
                if (sum== num) {
                    System.out.println( num +" is a perfect no");
                }else{
                    System.out.println(num + " is not a perfect number");
                }
    }

    public static void main(String[ ] args) {
        perfectNo(6);
        perfectNo(8);
        perfectNo(-4);
        
    }
}