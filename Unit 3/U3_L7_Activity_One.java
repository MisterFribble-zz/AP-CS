import java.util.Scanner;

public class U3_L7_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String password = "swordfish";

    System.out.println("Enter password:");
    String input = scan.nextLine();
    if (input.equals(password)) {
      System.out.println("Access granted!");
    } else {
      System.out.println("Access denied!");
    }
  }
}
