import java.util.Scanner;

public class U2_L8_Activity_Three {
  public static void main(String[] args) {
    //Instantiate and initialize new Scanner scan
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter two integers:");
    int a = scan.nextInt();
    int b = scan.nextInt();

    int diff = Math.abs(a) + Math.abs(b);
    System.out.println("Difference: " + diff);

    scan.close();
  }
}
