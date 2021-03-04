import java.util.ArrayList;

public class U7_L3_Activity_Two {
  public static void printStatistics(ArrayList<Integer> list) {
    int sum = 0;
    for (Integer integer : list) {
      sum += integer;
    }
    System.out.println("Sum: " + sum);

    double average = (double)sum / list.size();
    System.out.println(average);

    int count = 0;
    boolean singleMode = true;
    int mode = 0;
    for (int i = 0; i < list.size(); i++) {
      int tempCount = 0;
      for (int j = i; j < list.size(); j++) {
        if (list.get(j) == list.get(i)) {
          tempCount++;
        }
      }
      if (tempCount > count) {
        count = tempCount;
        mode = list.get(i);
      } else if (tempCount == count) {
        singleMode = false;
        break;
      }
    }
    System.out.print("Mode: ");
    if (singleMode) {
      System.out.println(mode);
    } else {
      System.out.println("no single mode");
    }
  }
}
