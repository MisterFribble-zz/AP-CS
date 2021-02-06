public class U6_L2_Activity_Two {
  public static int numEven(int[] list) {
    int count = 0;
    for (int i = 0; i < list.length; i++) {
      if (list[i] % 2 == 0) {
        count++;
      }
    }
    return count;
  }
}
