import java.util.ArrayList;

public class U7_L4_Activity_One{
  public static int countInitial(ArrayList<String> list, String letter){

    // Implement the countInitial method as described in the assignment
    int count = 0;
    for (String string : list) {
      if (string.substring(0,1).equalsIgnoreCase(letter)) {
        count++;
      }
    }
    return count;
  }
}
