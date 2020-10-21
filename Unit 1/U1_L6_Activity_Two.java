/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L6_Activity_Two {
  public static void main(final String[] args) {

    /* Write your code here */
    final Scanner scan = new Scanner(System.in);
    System.out.println("Please input a decimal number:");
    final double num = scan.nextDouble();
    final int roundNum = (int) Math.round(num);
    System.out.println("Answer: " + roundNum);
    scan.close();
  }
}
