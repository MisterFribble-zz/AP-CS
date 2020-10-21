/* Lesson 6 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L6_Activity_Three {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);

    System.out.println("Please input a decimal number: ");
    double input = scan.nextDouble();
    int number = (int)(input * 100);
    int tens = (number / 10) % 10;
    int ones = number % 10;
    System.out.println("Answer: " + tens + " " + ones);
    scan.close();
  }
}
