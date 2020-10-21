/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L4_Activity_Two {
    public static void main(String[] args) {
      
       /* Write your code here */
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter number of inches you would like to convert to feet:");
       int inch = scan.nextInt();
       System.out.println(inch + " inches is " + inch / 12 + " whole feet.");
       scan.close();
    }
}