public class First_Repeating_Character {

  public static void Repeating(String str) {
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(i) == str.charAt(j)) {
          System.out.println("First Repeating Character is " + str.charAt(i));
          return;
        }
      }

    }
    System.out.println("No Repeating Character Found");
  }

  public static void main(String arg[]) {
    String str = "helloo";
    Repeating(str);

  }
}