public class Maximum_Occurring_Character {

  public static void maximum_occurring(String str) {
    int maxcount = 0;
    char maxchar = ' ';
    for (int i = 0; i < str.length(); i++) {
      int count = 0;
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(i) == str.charAt(j)) {
          count++;

        }
      }
      if (count > maxcount) {
        maxcount = count;
        maxchar = str.charAt(i);
      }

    }

    System.out.println("Maximum Occurring Character: " + maxchar);
    System.out.println("Frequency: " + maxcount);

  }

  public static void main(String arg[]) {
    String str = "swiss";
    maximum_occurring(str);
  }
}
