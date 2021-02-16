public class U6_L3_Activity_Three {
  public static void printIngs(String[] words) {
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() >= 3 && words[i].substring(words[i].length() - 3).equals("ing")) {
        System.out.println(words[i]);
      }
    }
  }
}
