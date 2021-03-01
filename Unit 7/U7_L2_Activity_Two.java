import java.util.ArrayList;

public class U7_L2_Activity_Two {
  public static double average(ArrayList<Double> list) {
    double sum = 0;
    for (Double d : list) {
      sum += d;
    }
    return sum / list.size();
  }
}
