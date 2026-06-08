public class ques26 {

    public static int fabbonaci(int num){
        if (num == 0 || num == 1) {
            return num;
        }
        return fabbonaci(num - 1)+ fabbonaci(num-2);
    }
    
    public static void main(String[] args) {
    
        int num = 2 ;
        for(int i = 0 ; i<=num ; i++){
    
            System.out.print(fabbonaci(i) + " ");
        }
       
    }
    
}