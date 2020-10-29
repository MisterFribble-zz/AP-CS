import java.util.Scanner;

public class U3_L4_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = scan.nextInt();

    if (!(num <= 76 && num >= 5)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
