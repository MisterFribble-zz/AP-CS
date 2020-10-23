import java.util.Scanner;

public class U3_L2_Activity_One {
  public static void main(String[] args) {
    // Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);

    // Take 4 doubles from the user
    System.out.println("Enter 4 doubles:");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    double num3 = scan.nextDouble();
    double num4 = scan.nextDouble();

    // Calculate average
    double average = (num1 + num2 + num3 + num4)/4;

    // Test if average is at least 89.5, print ABOVE AVERAGE if so
    if (average >= 89.5) {
      System.out.println("ABOVE AVERAGE");
    }

    scan.close();
  }
}
