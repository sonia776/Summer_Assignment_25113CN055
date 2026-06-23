public class Longest_Word {
    public static void main(String[] args) {

        String str = "I love programming in Java";

        String words[] = str.split(" ");

        String longest = "";

        for (String word : words) {

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest Word = " + longest);
    }
}
