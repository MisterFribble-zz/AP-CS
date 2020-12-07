import java.util.Scanner;

public class U4_L3_Activity_Four {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a positive integer:");
    int num = scan.nextInt();

    if (num > 0) {
      for (int i = num; i >= 0; i--) {
        if (i % 5 == 0) {
          System.out.print(i + " ");
        }
      }
    } else {
      System.out.println("error");
    }

    scan.close();
  }
}
