import java.util.Scanner;

public class U3_L3_Activity_Three {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int min = 1;
    int max = 13;

    int num1 = min + (int) (Math.random() * ((max - min) + 1));
    int num2 = min + (int) (Math.random() * ((max - min) + 1));
    int correct = num1 * num2;

    System.out.println(num1 + " * " + num2 + " = ?");
    int answer = scan.nextInt();

    if (answer == correct) {
      System.out.println("Correct!");
    } else {
      System.out.println("Wrong");
    }

    scan.close();
  }
}
