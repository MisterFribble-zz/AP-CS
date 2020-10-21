import java.util.Scanner;

public class U3_L1_Activity_One {
  public static void main(String[] args) {
    //Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter an integer:");
    int num = scan.nextInt();

    if (num == 176) {
      System.out.println("YES");
    }

    scan.close();
  }
}
