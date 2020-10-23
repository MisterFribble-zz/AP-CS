import java.util.Scanner;

public class U3_L3_Activity_Two {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a grade from 1 to 4");
    int grade = scan.nextInt();

    if (grade == 4) {
      System.out.println("A");
    } else if (grade == 3) {
      System.out.println("B");
    } else if (grade == 2) {
      System.out.println("C");
    } else if (grade == 1) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }

    scan.close();
  }
}
