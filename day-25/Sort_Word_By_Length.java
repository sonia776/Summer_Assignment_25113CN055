public class Sort_Word_By_Length {
    public static void main(String[] args) {

        String words[] = {"Java", "Programming", "is", "Fun"};

        for (int i = 0; i < words.length - 1; i++) {

            for (int j = 0; j < words.length - 1 - i; j++) {

                if (words[j].length() > words[j + 1].length()) {

                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Words sorted by length:");

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}