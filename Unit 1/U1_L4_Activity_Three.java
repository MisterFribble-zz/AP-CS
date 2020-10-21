/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three {
  public static void main(final String[] args) {

      final double pi = 3.14;
      final Scanner scan = new Scanner(System.in);

      System.out.println("Enter a radius:");
      final double r = scan.nextDouble();
    System.out.println("Circumference: " + pi * 2 * r);
    System.out.println("Area: " + pi * r * r);
    scan.close();
  }
}
