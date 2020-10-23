import java.util.Scanner;

public class U3_L2_Activity_Four {
  public static void main(String[] args) {
    // Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);

    System.out.println("What is the temperature?");
    double temp = scan.nextDouble();

    if (temp < 99) {
      System.out.println("WARNING");
    }
    if (temp > 102) {
      System.out.println("WARNING");
    }

    // Close scan
    scan.close();
  }
}
