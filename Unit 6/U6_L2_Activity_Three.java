public class U6_L2_Activity_Three {
  public static boolean hasDuplicates(int[] list) {
    boolean hasDuplicates = false;
    for (int i = 0; i < list.length; i++) {
      for (int j = i + 1; j < list.length; j++) {
        if (list[i] == list[j]) {
          hasDuplicates = true;
          break;
        }
      }
    }
    return hasDuplicates;
  }
}
