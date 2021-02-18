public class U6_L4_Activity_One {
  public static boolean insert(String[] words, String newWord, int place) {
    if (place >= 0 && place < words.length) {
      for (int i = words.length - 1; i > place; i--) {
        words[i] = words[i - 1];
      }
      words[place] = newWord;
      return true;
    }
    return false;
  }
}
