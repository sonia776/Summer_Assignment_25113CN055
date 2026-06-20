public class Vowels_and_Consonant {

    public static void main(String[] args) {

        String str = "sonia";
        int vowels_Count = 0, consonant_Count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowels_Count++;

            } else {
                consonant_Count++;
            }

        }

        System.out.println("Number of vowels : " + vowels_Count);
        System.out.println("Number of consonants : " + consonant_Count);

    }

}