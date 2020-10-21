/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

class U1_L4_Activity_Four {
  public static void main(final String[] args) {

    /* Write your code here */
    final Scanner scan = new Scanner(System.in);
    System.out.println("Enter a price:");
    final double price = scan.nextDouble();
    System.out.println("Change from $20: $" + (20 - price));
    scan.close();
  }
}
