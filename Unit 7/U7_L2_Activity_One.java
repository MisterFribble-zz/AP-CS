import java.util.ArrayList;
import java.util.Scanner;

public class U7_L2_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
    String input = "";

    System.out.println("Please enter words, enter STOP to stop the loop.");
    input = scan.nextLine();
    while (!input.equals("STOP")) {
      words.add(input);
      input = scan.nextLine();
    }

    System.out.println(words);
    for (int i = words.size() - 1; i >= 0; i--) {
      System.out.println(words.get(i));
    }

    scan.close();
  }
}
