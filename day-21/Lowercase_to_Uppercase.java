public class Lowercase_to_Uppercase {
    public static void main(String[] args) {
        String lower = "sonia";
        char[] chars = lower.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                
                chars[i] = (char) (chars[i] - 32);
            }
        }
        
        System.out.println(chars); 
    }
}
