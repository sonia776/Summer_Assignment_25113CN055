public class Character_Frequency {
    public static void main(String[] args) {

        String str = "hello";

        int[] frequency = new int[str.length()];

        char[] sbr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (sbr[i] == sbr[j]) {
                    frequency[i]++;
                    sbr[j] = '0'; // so that code doesn't print the same letter twice ;
                }
            }
        }

        System.out.println("Characters and their frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (sbr[i] != ' ' && sbr[i] != '0') {
                System.out.println(sbr[i] + " = " + frequency[i]);
            }
        }
    }
}
