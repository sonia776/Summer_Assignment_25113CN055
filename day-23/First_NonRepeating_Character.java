public class First_NonRepeating_Character {

  public static void Non_Repeating(String str) {
    for (int i = 0; i < str.length(); i++) {
      int count = 0;
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(i) == str.charAt(j)) {
          count++;
        }
      }

      if (count == 1) {
        System.out.println("First Non-Repeating character is  " + str.charAt(i));
        break;
      }

    }
  }

  public static void main(String arg[]) {
    String str = "swiss";
    Non_Repeating(str);

  }
}