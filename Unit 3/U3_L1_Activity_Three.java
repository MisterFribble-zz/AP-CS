import java.util.Scanner;

public class U3_L1_Activity_Three {
  public static void main(String[] args) {
    //Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);

    //Take 2 integer inputs
    System.out.println("Please enter two integers:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    //Test if num1 and num2 are equal, print YES if they are
    if (num1 == num2) {
      System.out.println("YES");
    }

    //close scan
    scan.close();
  }
}
