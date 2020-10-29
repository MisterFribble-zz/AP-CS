import java.util.Scanner;

public class U3_L4_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter 2 integers:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    if (num1 >= 0 && num2 >= 0) {
      System.out.println("Both are positive or zero.");
    } else {
      System.out.println("One or both are negative.");
    }
  }
}
