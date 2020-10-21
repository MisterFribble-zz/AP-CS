import java.util.Scanner;

public class U3_L1_Activity_Four {
  public static void main(String[] args) {
    // Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);

    // Take an integer as input, convert it to even/odd with %
    System.out.println("Enter a Number:");
    int num = scan.nextInt();
    int evenOdd = num % 2;

    // If evenOdd = 0, print "Even"
    if (evenOdd == 0) {
      System.out.println("Even");
    }

    // If evenOdd = 1, print Odd
    if (evenOdd == 1) {
      System.out.println("Odd");
    }

    // Close scan
    scan.close();
  }
}
