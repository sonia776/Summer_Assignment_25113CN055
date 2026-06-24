public class Common_Characters {
    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "plane";

        System.out.print("Common Characters: ");

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            // Check if ch is in str2
            if (str2.indexOf(ch) != -1) {

                // Avoid printing duplicates
                boolean alreadyPrinted = false;

                for (int j = 0; j < i; j++) {
                    if (str1.charAt(j) == ch) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    System.out.print(ch + " ");
                }
            }
        }
    }
}
