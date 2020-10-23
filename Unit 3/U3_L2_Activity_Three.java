import java.util.Scanner;

public class U3_L2_Activity_Three {
  public static void main(String[] args) {
    // Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);

    // Take input as int
    System.out.println("Enter a test score:");
    int score = scan.nextInt();

    // Print Not Valid if score is less than 0 or greater than 100
    if (score > 100) {
      System.out.println("Not Valid");
    }
    if (score < 0) {
      System.out.println("Not Valid");
    }

    //Close scan
    scan.close();
  }
}
