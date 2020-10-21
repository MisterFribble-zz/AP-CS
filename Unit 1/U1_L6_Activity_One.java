/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L6_Activity_One {
  public static void main(final String[] args) {

    /* Write your code here */
    final Scanner scan = new Scanner(System.in);

    System.out.println("Please enter two integers:");
    final int num1 = scan.nextInt();
    final int num2 = scan.nextInt();
    final double avg = ((double) num1 + num2) / 2;
    System.out.println("The average is: " + avg);
    scan.close();
    
  }
}
