import java.util.Scanner;

public class U4_L2_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a positive integer:");
    int num = scan.nextInt();

    // Printing the individual digits of a number
    while (num > 0) {
      int digit = num % 10;
      System.out.println(digit);
      num /= 10;
    }

    scan.close();
  }
}
