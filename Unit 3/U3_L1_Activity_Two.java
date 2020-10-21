import java.util.Scanner;

public class U3_L1_Activity_Two {
  public static void main(String[] args) {
    //Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);

    //Take user input as double num
    System.out.println("Please enter a double:");
    double num = scan.nextDouble();

    //Print YES if num equals 48.729
    if (num == 48.729) {
      System.out.println("YES");
    }

    //Close scan
    scan.close();
  }
}
