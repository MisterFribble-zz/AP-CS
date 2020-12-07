/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L3_Activity_Three{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number between 0 and 100:");
    int num = scan.nextInt();
    int count = 0;
    if (num < 100 && num > 0) {
      for (int i = num; i <= 100; i++){
        count++;
        System.out.print(i + " ");
        if (count % 20 == 0) {
          System.out.println();
        }
      }
    } else {
      System.out.println("error");
    }
    
    scan.close();
  }
}