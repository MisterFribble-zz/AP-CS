import java.util.ArrayList;

public class U7_L6_Activity_Two {
  public static int insertSort(ArrayList<Integer> list) {
    int count = 0;
    for (int i = 1; i < list.size(); i++) {
      int temp = list.get(i);
      int j = i - 1;
      while(j >= 0 && list.get(j).compareTo(temp) == 1) {
        count++;
        list.set(j + 1, list.get(j));
        j--;
      }
      list.set(j + 1, temp);
    }
    return count;
  }
}
