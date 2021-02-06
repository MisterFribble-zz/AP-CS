public class U6_L2_Activity_One {

  // Write your allNegative method here
  public static boolean allNegative(double[] d) {
    boolean flag = true;
    for (int i = 0; i < d.length; i++) {
      if (d[i] >= 0) {
        flag = false;
        break;
      }
    }
    return flag;
  }
}
