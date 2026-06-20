public class Reverse_a_String {
    public static void main(String[] args) {
        String original = "Java";
        String reversed = "";
        
        
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        System.out.println(reversed); 
    }
}