import java.util.ArrayList;

public class U7_L2_Activity_Three {

  public static ArrayList<Integer> getOdds(ArrayList<Integer> vals) {
    // Implement this method as described in the assignment
    ArrayList<Integer> oddNums = new ArrayList<Integer>();
    for (Integer i : vals) {
      if (i % 2 == 1) {
        oddNums.add(i);
      }
    }
    return oddNums;
  }

}
