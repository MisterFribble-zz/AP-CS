import java.util.ArrayList;
import java.util.Scanner;

public class U7_L1_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();

    System.out.println("Please enter words, enter STOP to stop the loop.");
    String input = scan.nextLine();
    while (!input.equals("STOP")) {
      list.add(input);
      input = scan.nextLine();
    }

    System.out.println(list.size());
    System.out.println(list);

    if (list.size() > 2) {
      list.remove(0);
      list.remove(list.size() - 1);
    }
    System.out.println(list);

    scan.close();
  }
}
