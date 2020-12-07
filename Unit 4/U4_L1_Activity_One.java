import java.util.Scanner;

public class U4_L1_Activity_One {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter positive numbers (-1 to stop)");

    int n = 0;
    int c = 0;
    while (n != -1) {
      c += n;
      n = scan.nextInt();
    }

    System.out.println("Sum is " + c);

    scan.close();
  }
}
