import java.util.Scanner;

public class U3_L7_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter 2 strings:");
    String word1 = scan.nextLine();
    String word2 = scan.nextLine();

    String sub1 = word1.substring(0, word1.length() - 1);
    String sub2 = word2.substring(0, word2.length() - 1);

    if (word1.equals(word2)) {
      System.out.println("Great!");
    } else if (sub1.equals(sub2)) {
      System.out.println("Close enough");
    } else {
      System.out.println("Try again");
    }
  }
}
