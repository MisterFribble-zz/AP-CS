import java.util.Scanner;

public class U3_L2_Activity_Two {
  public static void main(String[] args) {
    // Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);

    // Take 2 doubles as input
    System.out.println("Please enter two numbers:");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();

    // Print num1 if it is greater than num2
    if (num1 > num2) {
      System.out.println("Largest is: " + num1);
    }

    // Print num2 if it is greater than num1
    if (num2 > num1) {
      System.out.println("Largest is: " + num2);
    }

    // Print num1 if they are equal
    if (num1 == num2) {
      System.out.println("Largest is: " + num1);
    }

    // Close scan
    scan.close();
  }
}
